package com.company;

import java.util.ArrayList;

public class MinMaxFinder {
    private ArrayList<Integer> zahlen;

    /*
        - Default constructor
     */
    public MinMaxFinder(){
        this.zahlen = new ArrayList<>();
    }

    /*
        - Constructor
     */
    public MinMaxFinder(ArrayList<Integer> zahlen){
        this.zahlen = zahlen;
    }

    /*
        - Findet die maximale Zahl aus einem Array
        Pre: Ein Array von positive Zahlen
        Post: Die maximale Zahl aus dieser Array
        Throws: Wenn es keine Zahlen gibt
     */
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

    /*
        - Findet die minimale Zahl aus einem Array
        Pre: Ein Array von positive Zahlen
        Post: Die minimale Zahl aus dieser Array
        Throws: Wenn es keine Zahlen gibt
     */
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


    /*
        - Findet die maximale Summe von n-1 Zahlen aus einem Array
        Pre: Ein Array von positive Zahlen
        Post: Die maximale Summe von n-1 Zahlen
     */
    public int findeMaxSumNMinusEinsZahlen() {
        int sum = 0;
        try {
            int min = findeMin();
            for (int zahl : this.zahlen) {
                sum += zahl;
            }
            return sum-min;
        } catch (Exception exception) {
            return sum;
        }
    }

    /*
        - Findet die maximale Summe von n-1 Zahlen aus einem Array
        Pre: Ein Array von positive Zahlen
        Post: Die maximale Summe von n-1 Zahlen
     */
    public int findeMinSumNMinusEinsZahlen() {
        int sum = 0;
        try {
            int max = findeMax();
            for (int zahl : this.zahlen) {
                sum += zahl;
            }
            return sum-max;
        } catch (Exception exception) {
            return sum;
        }
    }
}
