package com.company;

import java.util.ArrayList;

public class Rechner {

    public ArrayList<Integer> berechneSumme(ArrayList<Integer> ZahlEins, ArrayList<Integer> ZahlZwei){
        int carry = 0;
        ArrayList<Integer> result = new ArrayList<>();
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
        if (carry == 1){
            result.add(0, 1);
        }
        return result;
    }

    public ArrayList<Integer> berechneDifferenz(ArrayList<Integer> ZahlEins, ArrayList<Integer> ZahlZwei){
        int borrow = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int idx = 0; idx < ZahlEins.size(); idx++){
            result.add(0);
        }
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

    public ArrayList<Integer> berechneMultiplikation(ArrayList<Integer> ZahlEins, int zahlZwei){
        ArrayList<Integer> result = new ArrayList<>();
        for (int idx = 0; idx < ZahlEins.size(); idx++){
            result.add(0);
        }
        int carry = 0;

        for (int idx = ZahlEins.size() - 1; idx >= 0; idx--){
            result.set(idx, (ZahlEins.get(idx) * zahlZwei + carry) % 10);
            carry = ((ZahlEins.get(idx) * zahlZwei + carry) / 10);
        }
        if (carry != 0){
            result.add(0, carry);
        }

        return result;
    }

    public ArrayList<Byte> berechneDivision(ArrayList<Integer> ZahlEins, int zahlZwei){
        return new ArrayList<>();
    }
}
