package com.company;

import java.util.ArrayList;

public class MinMaxFinder {
    private ArrayList<Integer> zahlen;

    public MinMaxFinder(){
        this.zahlen = new ArrayList<>();
    }

    public MinMaxFinder(ArrayList<Integer> zahlen){
        this.zahlen = zahlen;
    }

    public int findeMax() throws Exception {
        if (this.zahlen.isEmpty()){
            throw new Exception("Es gibt keine Zahlen!");
        }
        int max = this.zahlen.get(0);
        for (int zahl : this.zahlen){
            if (zahl > max){
                max = zahl;
            }
        }
        return max;
    }

    public int findeMin() throws Exception {
        if (this.zahlen.isEmpty()){
            throw new Exception("Es gibt keine Zahlen!");
        }
        int min = this.zahlen.get(0);
        for (int zahl : this.zahlen){
            if (zahl < min){
                min = zahl;
            }
        }
        return min;
    }

    public int findeMaxSumNMinusEinsZahlen() {
        int sum = 0;
        try {
            int min = findeMin(); boolean weggelassen = false;
            for (int zahl : this.zahlen) {
                if (zahl == min && !weggelassen) {
                    weggelassen = true;
                } else {
                    sum += zahl;
                }
            }
            return sum;
        } catch (Exception exception) {
            return sum;
        }
    }

    public int findeMinSumNMinusEinsZahlen() {
        int sum = 0;
        try {
            int max = findeMax(); boolean weggelassen = false;
            for (int zahl : this.zahlen) {
                if (zahl == max && !weggelassen) {
                    weggelassen = true;
                } else {
                    sum += zahl;
                }
            }
            return sum;
        } catch (Exception exception) {
            return sum;
        }
    }
}
