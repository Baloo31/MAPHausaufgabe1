package com.company;

import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;


class BenotungTest {
    private Benotung UniBenotung;

    BenotungTest(){
        UniBenotung = new Benotung();
    }

    @org.junit.jupiter.api.Test
    public void filtreNichtAusreichendeNoten() {
        ArrayList<Integer> noten = new ArrayList<>();
        noten.add(100); noten.add(30); noten.add(60); noten.add(80); noten.add(14); noten.add(39); noten.add(99);

        ArrayList<Integer> notenGefiltert = new ArrayList<>();
        notenGefiltert.add(30); notenGefiltert.add(14); notenGefiltert.add(39);

        for (int note : UniBenotung.filtreNichtAusreichendeNoten(noten)){
            Assertions.assertTrue(notenGefiltert.contains(note));
        }
    }

    @org.junit.jupiter.api.Test
    public void berechneDurchschnittswert() {
        ArrayList<Integer> noten = new ArrayList<>();

        try {
            UniBenotung.berechneDurchschnittswert(noten);
            Assertions.fail();
        } catch (Exception exception) {
            Assertions.assertTrue(true);
        }

        noten.add(100); noten.add(30); noten.add(60); noten.add(14); noten.add(39); noten.add(99);

        try {
            Assertions.assertEquals(57, UniBenotung.berechneDurchschnittswert(noten));
        } catch (Exception exception) {
            Assertions.fail();
        }
    }

    @org.junit.jupiter.api.Test
    public void rundeNotenAb() {
        ArrayList<Integer> noten = new ArrayList<>();
        noten.add(100); noten.add(31); noten.add(60); noten.add(81); noten.add(14); noten.add(39); noten.add(93);
        noten.add(62);

        ArrayList<Integer> notenAbgerundet = new ArrayList<>();
        notenAbgerundet.add(100); notenAbgerundet.add(31); notenAbgerundet.add(60); notenAbgerundet.add(81);
        notenAbgerundet.add(14); notenAbgerundet.add(39); notenAbgerundet.add(95); notenAbgerundet.add(62);

        ArrayList<Integer> output;
        output = UniBenotung.rundeNotenAb(noten);

        for (int index = 0; index < output.size(); index++) {
            Assertions.assertEquals(notenAbgerundet.get(index), output.get(index));
        }

    }

    @org.junit.jupiter.api.Test
    public void getMaxAbgerundeteNote() {
        ArrayList<Integer> noten = new ArrayList<>();
        noten.add(100); noten.add(31); noten.add(60); noten.add(81); noten.add(13); noten.add(47);

        try {
            UniBenotung.getMaxAbgerundeteNote(noten);
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }

        noten.add(93); noten.add(62);

        try {
            Assertions.assertEquals(noten.get(6), UniBenotung.getMaxAbgerundeteNote(noten));
        } catch (Exception exception){
            Assertions.fail();
        }
    }
}