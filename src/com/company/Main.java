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

        RechnerTest test3 = new RechnerTest();
        test3.berechneSumme();
        test3.berechneDifferenz();
        test3.berechneDivision();
        test3.berechneMultiplikation();

        System.out.println("Die Tests wurden erfolgreich beendet!");

    }
}

