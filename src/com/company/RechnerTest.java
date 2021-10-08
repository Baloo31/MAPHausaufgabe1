package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.Inet4Address;
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
    }
}