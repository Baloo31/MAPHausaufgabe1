package com.company;

import java.util.ArrayList;

public class ElektronikShop {
    private ArrayList<Integer> preiseTastaturen;
    private ArrayList<Integer> preiseUSBLaufwerke;

    /*
    Default constructor
     */
    ElektronikShop(){
        preiseTastaturen = new ArrayList<>();
        preiseUSBLaufwerke = new ArrayList<>();
    }

    /*
    Constructor
     */
    ElektronikShop(ArrayList<Integer> preiseTast, ArrayList<Integer> preiseUsbL){
        preiseTastaturen = new ArrayList<>(preiseTast);
        preiseUSBLaufwerke = new ArrayList<>(preiseUsbL);
    }


    /*
    - Ergibt die Preis der billigste Tastatur
    Pre: Die Liste von Tastaturen
    Post: Preis der billigste Tastatur
    Throws: Wenn die Liste von Tastaturen leer ist
     */
    public int getBilligsteTastatur() throws Exception{
        if (preiseTastaturen.isEmpty()){
            throw new Exception("Es gibt keine Tastaturen!");
        }
        int bestenPreis = preiseTastaturen.get(0);
        for (int preis : preiseTastaturen){
            if (preis < bestenPreis){
                bestenPreis = preis;
            }
        }
        return bestenPreis;
    }


    /*
    - Ergibt den teuersten Gegenstand aus dem Shop
    Pre: Die zwei Listen : Tastaturen und USB Laufwerke
    Post: Die teuerste Gegenstand aus diese Listen
    Throws: Wenn beide Listen leer sind
     */
    public int getTeuerstenGegenstand() throws Exception{
        if (preiseTastaturen.isEmpty() && preiseUSBLaufwerke.isEmpty()){
            throw new Exception("Es gibt keine Gegenstande!");
        }
        int teuerstePreis = 0;
        for (int preis : preiseTastaturen){
            if (preis > teuerstePreis){
                teuerstePreis = preis;
            }
        }
        for (int preis : preiseUSBLaufwerke){
            if (preis > teuerstePreis){
                teuerstePreis = preis;
            }
        }
        return teuerstePreis;
    }


    /*
    - Ergibt den teuersten USB Laufwerk im Bezug einer Budget
    Pre: Liste von USB Laufwerke und Budget
    Post: Die teuerste USB Laufwerk im Bezug auf dieser Budget

     */
    public int getTeuersteUsbLBudget(int budget) throws Exception{
        int gefundenePreis = -1;
        for (int preis : preiseUSBLaufwerke){
            if (preis <= budget && preis > gefundenePreis){
                gefundenePreis = preis;
            }
        }
        if (gefundenePreis == -1){
            throw new Exception("Es gibt keine USBLaufwerke oder nicht genug Geld!");
        }
        return gefundenePreis;
    }


    /*
    - Ergibt die maximalle Paar Tastatur-USB Laufwerk im Bezug auf Budget
    Pre: Liste Tastaturen, Liste USB Laufwerke und Budget
    Post: Die Maximalle Geldbetrag je einer Tastatur und USB Laufwerk,
            oder -1 wenn keine Paaren im Bezug auf dieser Budget kaufen kann
    Throws: Wenn eine der beiden Listen leer ist
     */
    public int getSummeTastaturUndUsbLBudget(int budget) throws Exception{
        if (preiseTastaturen.isEmpty() || preiseUSBLaufwerke.isEmpty()){
            throw new Exception("Eine der Listen ist leer, man kann also nicht beide kaufen!");
        }
        int maxGeldbetrag = -1; int geldbetrag;
        int idxTast = 0; int idxUsbL = 0;
        while (idxTast < preiseTastaturen.size()){
            if (this.preiseTastaturen.get(idxTast) < budget) {
                while (idxUsbL < preiseUSBLaufwerke.size()) {
                    if (this.preiseUSBLaufwerke.get(idxUsbL) < budget) {
                        geldbetrag = preiseTastaturen.get(idxTast) + preiseUSBLaufwerke.get(idxUsbL);
                        if (geldbetrag <= budget && geldbetrag > maxGeldbetrag) {
                            maxGeldbetrag = geldbetrag;
                        }
                    }
                    idxUsbL++;
                }
            }
            idxUsbL = 0; idxTast++;
        }
        return maxGeldbetrag;
    }
}
