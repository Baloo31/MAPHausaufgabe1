package com.company;


public class Main {

    public static void main(String[] args) {
        // Aufgabe 1
        BenotungTest test = new BenotungTest();
        test.filtreNichtAusreichendeNoten();
        test.berechneDurchschnittswert();
        test.rundeNotenAb();
        test.getMaxAbgerundeteNote();
        System.out.println("Die Tests wurden erfolgreich beendet!");

    }
}

