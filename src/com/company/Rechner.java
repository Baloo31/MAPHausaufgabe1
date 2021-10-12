package com.company;

import java.util.ArrayList;

public class Rechner {

    /*
        - Berechnet die Summe zweier grosse Zahlen represntiert auf 2 Arrays
        Pre: zwei Arrays mit den gleichen Anzahl von Ziffern
        Post: ein Array der die Summe der Zahlen representiert
     */
    public ArrayList<Integer> berechneSumme(ArrayList<Integer> ZahlEins, ArrayList<Integer> ZahlZwei){
        int carry = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Man vorbereitet das Array "resultat"
        for (int idx = 0; idx < ZahlEins.size(); idx++){
            result.add(0);
        }
        for (int idx = ZahlEins.size() - 1; idx >= 0; idx--){
            result.set(idx, (ZahlEins.get(idx) + ZahlZwei.get(idx) + carry) % 10);
            if ((ZahlEins.get(idx) + ZahlZwei.get(idx) + carry) > 9){
                carry = 1;
            } else {
                carry = 0;
            }
        }

        // Am Ende kann die Summe mit ein Ziffer grosser sein
        if (carry == 1){
            result.add(0, 1);
        }
        return result;
    }


    /*
        - Berechnet die Differenz zweier grosse Zahlen represntiert auf 2 Arrays
        Pre: zwei Arrays mit den gleichen Anzahl von Ziffern
        Post: ein Array der die Differenz der Zahlen representiert
     */
    public ArrayList<Integer> berechneDifferenz(ArrayList<Integer> ZahlEins, ArrayList<Integer> ZahlZwei){
        int borrow = 0;
        // Man vorbereitet das Array "resultat"
        ArrayList<Integer> result = new ArrayList<>();
        for (int idx = 0; idx < ZahlEins.size(); idx++){
            result.add(0);
        }
        // Man durchquert alle Ziffern von rechts nach links
        for (int idx = ZahlEins.size() - 1; idx >= 0; idx--){
            if (ZahlEins.get(idx) - ZahlZwei.get(idx) - borrow < 0){
                result.set(idx, (10 + ZahlEins.get(idx) - ZahlZwei.get(idx) - borrow));
                borrow = 1;
            } else {
                result.set(idx, (ZahlEins.get(idx) - ZahlZwei.get(idx) - borrow));
                borrow = 0;
            }
        }
        return result;
    }


    /*
        - Berechnet die Multiplikation zweier Zahlen rep. auf Arrays
        Pre: Ein Array und eine Ziffer
        Post: Die Multiplikation representiert auf ein Array
     */
    public ArrayList<Integer> berechneMultiplikation(ArrayList<Integer> ZahlEins, int zahlZwei){
        ArrayList<Integer> result = new ArrayList<>();
        for (int idx = 0; idx < ZahlEins.size(); idx++){
            result.add(0);
        }
        int carry = 0;
        // Man durchquert die Ziffern des Zahles von rechts nach links
        for (int idx = ZahlEins.size() - 1; idx >= 0; idx--){
            result.set(idx, (ZahlEins.get(idx) * zahlZwei + carry) % 10);
            carry = ((ZahlEins.get(idx) * zahlZwei + carry) / 10);
        }
        if (carry != 0){
            result.add(0, carry);
        }

        return result;
    }

    /*
        - Berechnet die Division zweier Zahlen rep. auf Arrays
        Pre: Ein Array und eine Ziffer
        Post: Die Division representiert auf ein Array
     */
    public ArrayList<Integer> berechneDivision(ArrayList<Integer> ZahlEins, int zahlZwei){
        ArrayList<Integer> result = new ArrayList<>();
        // Das resultat wird vorbereitet
        for (int idx = 0; idx < ZahlEins.size(); idx++){
            result.add(0);
        }
        int carry = 0;
        // Man durchquert die Ziffern des Zahles von links nach rechts
        for (int idx = 0; idx < result.size(); idx++){
            result.set(idx, (carry*10 + ZahlEins.get(idx)) / zahlZwei);
            carry = (carry*10 + ZahlEins.get(idx)) % zahlZwei;
        }
        if (result.get(0) == 0){
            result.remove(0);
        }
        return result;
    }
}
