package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class RechnerTest {
    private Rechner rechner;

    @Test
    void berechneSumme() {
        rechner = new Rechner();
        ArrayList<Integer> zahlEins = new ArrayList<>(Arrays.asList(1,3,0,0,0,0,0,0,0));
        ArrayList<Integer> zahlZwei = new ArrayList<>(Arrays.asList(8,7,0,0,0,0,0,0,0));
        Assertions.assertEquals(Arrays.asList(1,0,0,0,0,0,0,0,0,0), rechner.berechneSumme(zahlEins, zahlZwei));

        ArrayList<Integer> zahlDrei = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> zahlVier = new ArrayList<>(Arrays.asList(6,8,3,6,4));
        Assertions.assertEquals(Arrays.asList(8,0,7,0,9), rechner.berechneSumme(zahlDrei, zahlVier));
    }

    @Test
    void berechneDifferenz() {
        rechner = new Rechner();
        ArrayList<Integer> zahlEins = new ArrayList<>(Arrays.asList(8,3,0,0,0,0,0,0,0));
        ArrayList<Integer> zahlZwei = new ArrayList<>(Arrays.asList(5,4,0,0,0,0,0,0,0));
        Assertions.assertEquals(Arrays.asList(2,9,0,0,0,0,0,0,0), rechner.berechneDifferenz(zahlEins, zahlZwei));

        rechner = new Rechner();
        ArrayList<Integer> zahlEins2 = new ArrayList<>(Arrays.asList(8,7,6));
        ArrayList<Integer> zahlZwei2 = new ArrayList<>(Arrays.asList(8,7,5));
        Assertions.assertEquals(Arrays.asList(0,0,1), rechner.berechneDifferenz(zahlEins2, zahlZwei2));
    }

    @Test
    void berechneMultiplikation() {
        rechner = new Rechner();
        ArrayList<Integer> zahlEins = new ArrayList<>(Arrays.asList(2,3,6,0,0,0,0,0,0));
        Assertions.assertEquals(Arrays.asList(4,7,2,0,0,0,0,0,0), rechner.berechneMultiplikation(zahlEins, 2));

        ArrayList<Integer> zahlEins2 = new ArrayList<>(Arrays.asList(9,9,9));
        Assertions.assertEquals(Arrays.asList(8,9,9,1), rechner.berechneMultiplikation(zahlEins2, 9));
    }

    @Test
    void berechneDivision() {
        rechner = new Rechner();
        ArrayList<Integer> zahlEins = new ArrayList<>(Arrays.asList(4,5,8,0,0,0,0,0,0));
        Assertions.assertEquals(Arrays.asList(5,0,8,8,8,8,8,8), rechner.berechneDivision(zahlEins, 9));

        ArrayList<Integer> zahlEins2 = new ArrayList<>(Arrays.asList(2,3,6,0,0,0,0,0,0));
        Assertions.assertEquals(Arrays.asList(1,1,8,0,0,0,0,0,0), rechner.berechneDivision(zahlEins2, 2));
    }
}