package com.company;

import java.util.ArrayList;

public class ElektronikShop {
    private ArrayList<Integer> preiseTastaturen;
    private ArrayList<Integer> preiseUSBLaufwerke;

    ElektronikShop(){
        preiseTastaturen = new ArrayList<>();
        preiseUSBLaufwerke = new ArrayList<>();
    }

    ElektronikShop(ArrayList<Integer> preiseTast, ArrayList<Integer> preiseUsbL){
        preiseTastaturen = new ArrayList<>(preiseTast);
        preiseUSBLaufwerke = new ArrayList<>(preiseUsbL);
    }

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

    public int getSummeTastaturUndUsbLBudget(int budget) throws Exception{
        if (preiseTastaturen.isEmpty() || preiseUSBLaufwerke.isEmpty()){
            throw new Exception("Eine der Listen ist leer, man kann also nicht beide kaufen!");
        }
        int maxGeldbetrag = -1; int geldbetrag;
        int idxTast = 0; int idxUsbL = 0;
        while (idxTast < preiseTastaturen.size()){
            while (idxUsbL < preiseUSBLaufwerke.size()){
                geldbetrag = preiseTastaturen.get(idxTast) + preiseUSBLaufwerke.get(idxUsbL);
                if (geldbetrag <= budget && geldbetrag > maxGeldbetrag){
                    maxGeldbetrag = geldbetrag;
                }
                idxUsbL++;
            }
            idxUsbL = 0; idxTast++;
        }
        return maxGeldbetrag;
    }
}
