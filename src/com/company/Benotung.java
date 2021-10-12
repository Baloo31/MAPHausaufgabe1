package com.company;

import java.util.ArrayList;
import java.lang.Exception;


public class Benotung {

    /*
        - Liefert die nicht ausreichende Noten aus einer Menge von Noten
        Pre: Ein Array von Noten (ganze Zahlen zwischen 0 und 100)
        Post: Ein Array von nicht ausreichende Noten
     */
    public ArrayList<Integer> filtreNichtAusreichendeNoten(ArrayList<Integer> noten) {
        for (int index = 0; index < noten.size(); index++){
            if (noten.get(index) > 39) {
                noten.remove(index); index--;
            }
        }
        return noten;
    }


    /*
        - Liefert die Durchschnittswert einer Menge von Noten
        Pre: Ein Array von Noten (ganze Zahlen zwischen 0 und 100)
        Post: Die Durschnittswert dieser Noten
     */
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


    /*
        - Liefert ein Array von abgerundete Noten
        Pre: Ein Array von Noten (ganze Zahlen zwischen 0 und 100)
        Post: Ein Array mit denselben Noten, aber abgerudet
     */
    public ArrayList<Integer> rundeNotenAb(ArrayList<Integer> noten) {
        for (int index = 0; index < noten.size(); index++){
            noten.set(index, rundeNote(noten.get(index)));
        }
        return noten;
    }


    /*
        - Rundet eine Note ab
        Pre: Eine Note (ganze Zahl zw. 0 u. 100)
        Post: Der abgerundeten Wert dieser Note
     */
    public int rundeNote(int note){
        if (note < 40) return note;
        if (note % 5 > 2){
            return note + 5 - note % 5;
        }
        return note;
    }


    /*
        - Ergibt die maximall abgerundete Note aus einem Array von Noten
        Pre: Ein Array von Noten (ganze Zahlen zwischen 0 und 100)
        Post: Die maximall abgerundete Note aus dieser Array
        Throws: Falls keine maximall abgerundete Note gefunden wurde
     */
    public int getMaxAbgerundeteNote(ArrayList<Integer> noten) throws Exception{
        for (int note : noten) {
            if (note % 5 == 3 && note > 39){
                return note;
            }
        }
        throw new Exception("Keine maximall abgerundete Note gefunden!");
    }

}
