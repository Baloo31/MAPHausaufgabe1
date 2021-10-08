package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MinMaxFinderTest {
    MinMaxFinder finder;
    MinMaxFinder finder2;

    MinMaxFinderTest(){
        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(4); zahlen.add(8); zahlen.add(3); zahlen.add(10); zahlen.add(17);
        this.finder = new MinMaxFinder(zahlen);
        this.finder2 = new MinMaxFinder();
    }

    @Test
    void findeMax() {
        try {
            Assertions.assertEquals(17, this.finder.findeMax());
        } catch (Exception exception){
            Assertions.fail();
        }

        try {
            finder2.findeMax();
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }
    }

    @Test
    void findeMin() {
        try {
            Assertions.assertEquals(3, this.finder.findeMin());
        } catch (Exception exception){
            Assertions.fail();
        }

        try {
            finder2.findeMin();
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }
    }

    @Test
    void findeMaxSumNMinusEinsZahlen() {
        Assertions.assertEquals(39, this.finder.findeMaxSumNMinusEinsZahlen());
        Assertions.assertEquals(0, this.finder2.findeMaxSumNMinusEinsZahlen());
    }

    @Test
    void findeMinSumNMinusEinsZahlen() {
        Assertions.assertEquals(25, this.finder.findeMinSumNMinusEinsZahlen());
        Assertions.assertEquals(0, this.finder2.findeMinSumNMinusEinsZahlen());
    }
}