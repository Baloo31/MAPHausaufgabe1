package com.company;

import java.util.ArrayList;
import java.util.Arrays;

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

    public ArrayList<Byte> berechneMultiplikation(ArrayList<Byte> ZahlEins, byte zahlZwei){
        return new ArrayList<>();
    }

    public ArrayList<Byte> berechneDivision(ArrayList<Byte> ZahlEins, byte zahlZwei){
        return new ArrayList<>();
    }
}
