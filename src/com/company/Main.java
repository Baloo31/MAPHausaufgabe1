package com.company;

public class Main {

    public static void main(String[] args) {
        // Aufgabe 1
        Benotung UniBenotung = new Benotung();
        int[] noten = {43, 16, 39, 100, 0, 67, 94};
        int[] notenNichtAusreichend = UniBenotung.filterNichtAusreichende(noten);
        for (int idx = 0; idx < notenNichtAusreichend.length; idx++) {
            System.out.println(notenNichtAusreichend[idx] + ", ");
        }
        System.out.println(UniBenotung.berechnenDurchschnittswert(noten));
    }
}

class Benotung {

    public int[] filterNichtAusreichende(int[] noten) {
        int[] notenNichtAusreichend = new int[noten.length];
        int anzNichtAusreichendeNoten = 0;
        for (int idx = 0; idx < noten.length; idx++){
            if (noten[idx] < 40) {
                notenNichtAusreichend[anzNichtAusreichendeNoten] = noten[idx];
                anzNichtAusreichendeNoten++;
            }
        }
        return notenNichtAusreichend;
    }

     public double berechnenDurchschnittswert(int[] noten) {
        int sum = 0;
        for (int idx = 0; idx < noten.length; idx++){
            sum += noten[idx];
        }
        return sum / noten.length;
    }


    public int[] abrunden(int[] noten) {
        int[] notenAbgerundet = new int[noten.length];
        for (int idx = 0; idx < noten.length; idx++) {
            notenAbgerundet[idx] = this.runden(noten[idx]);
        }
        return notenAbgerundet;
    }

    public int runden(int note){
        if (note < 38) return note;
        return 100;
    }


    /*
    private double[] getMaxAbgerundeteNote(double[] noten) {
    }

    */
}
