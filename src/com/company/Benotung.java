package com.company;

import java.util.ArrayList;
import java.lang.Exception;


public class Benotung {

    public ArrayList<Integer> filtreNichtAusreichendeNoten(ArrayList<Integer> noten) {
        for (int index = 0; index < noten.size(); index++){
            if (noten.get(index) > 39) {
                noten.remove(index); index--;
            }
        }
        return noten;
    }


    public double berechneDurchschnittswert(ArrayList<Integer> noten) throws Exception {
        int sum = 0;
        for (int note : noten){
            sum += note;
        }
        if (!noten.isEmpty()) {
            return ((double) sum)/ noten.size();
        }
        throw new Exception("Man hat keine Noten bekommen!");
    }


    public ArrayList<Integer> rundeNotenAb(ArrayList<Integer> noten) {
        for (int index = 0; index < noten.size(); index++){
            noten.set(index, rundeNote(noten.get(index)));
        }
        return noten;
    }

    public int rundeNote(int note){
        if (note < 40) return note;
        if (note % 5 > 2){
            return note + 5 - note % 5;
        }
        return note;
    }


    public int getMaxAbgerundeteNote(ArrayList<Integer> noten) throws Exception{
        for (int note : noten) {
            if (note % 5 == 3 && note > 39){
                return note;
            }
        }
        throw new Exception("Keine maximal abgerundete Note gefunden!");
    }

}
