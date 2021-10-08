package com.company;


public class Main {

    public static void main(String[] args) {
        // Aufgabe 1
        BenotungTest test = new BenotungTest();
        test.filtreNichtAusreichendeNoten();
        test.berechneDurchschnittswert();
        test.rundeNotenAb();
        test.getMaxAbgerundeteNote();

        // Aufgabe 2
        MinMaxFinderTest test2 = new MinMaxFinderTest();
        test2.findeMax();
        test2.findeMin();
        test2.findeMaxSumNMinusEinsZahlen();
        test2.findeMinSumNMinusEinsZahlen();

        System.out.println("Die Tests wurden erfolgreich beendet!");

    }
}

