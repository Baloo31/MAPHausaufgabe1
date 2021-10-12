package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ElektronikShopTest {

    @Test
    void getBilligsteTastatur() {
        ArrayList<Integer> preiseTastaturen = new ArrayList<>(Arrays.asList(40, 35, 70, 15, 45));
        ArrayList<Integer> preiseUSBLaufwerke = new ArrayList<>(Arrays.asList(40, 35, 70, 20, 45));
        ElektronikShop shop = new ElektronikShop(preiseTastaturen, preiseUSBLaufwerke);
        try{
            Assertions.assertEquals(15, shop.getBilligsteTastatur());
        } catch (Exception exception){
            Assertions.fail();
        }

        ElektronikShop shop2 = new ElektronikShop();
        try{
            shop2.getBilligsteTastatur();
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }
    }

    @Test
    void getTeuerstenGegenstand() {
        ArrayList<Integer> preiseTastaturen = new ArrayList<>(Arrays.asList(15, 20, 10, 35));
        ArrayList<Integer> preiseUSBLaufwerke = new ArrayList<>(Arrays.asList(20, 15, 40, 15));
        ElektronikShop shop = new ElektronikShop(preiseTastaturen, preiseUSBLaufwerke);
        try{
            Assertions.assertEquals(40, shop.getTeuerstenGegenstand());
        } catch (Exception exception){
            Assertions.fail();
        }

        ElektronikShop shop2 = new ElektronikShop();
        try{
            shop2.getTeuerstenGegenstand();
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }
    }

    @Test
    void getTeuersteUsbLBudget() {
        ArrayList<Integer> preiseTastaturen = new ArrayList<>();
        ArrayList<Integer> preiseUSBLaufwerke = new ArrayList<>(Arrays.asList(15, 45, 20, 65, 18));
        ElektronikShop shop = new ElektronikShop(preiseTastaturen, preiseUSBLaufwerke);
        try{
            Assertions.assertEquals(20, shop.getTeuersteUsbLBudget(30));
        } catch (Exception exception){
            Assertions.fail();
        }

        ElektronikShop shop2 = new ElektronikShop();
        try{
            shop2.getTeuersteUsbLBudget(100);
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }

        ArrayList<Integer> preiseUSBLaufwerke2 = new ArrayList<>(Arrays.asList(100, 200, 300));
        ElektronikShop shop3 = new ElektronikShop(preiseTastaturen, preiseUSBLaufwerke2);
        try{
            shop3.getTeuersteUsbLBudget(99);
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }
    }

    @Test
    void getSummeTastaturUndUsbLBudget() {
        ArrayList<Integer> preiseTastaturen1 = new ArrayList<>(Arrays.asList(40, 50, 60));
        ArrayList<Integer> preiseUSBLaufwerke1 = new ArrayList<>(Arrays.asList(8, 12));
        ElektronikShop shop1 = new ElektronikShop(preiseTastaturen1, preiseUSBLaufwerke1);
        try{
            Assertions.assertEquals(58, shop1.getSummeTastaturUndUsbLBudget(60));
        } catch (Exception exception){
            Assertions.fail();
        }

        ElektronikShop shop2 = new ElektronikShop();
        try{
            shop2.getSummeTastaturUndUsbLBudget(100);
            Assertions.fail();
        } catch (Exception exception){
            Assertions.assertTrue(true);
        }

        ArrayList<Integer> preiseTastaturen3 = new ArrayList<>(Arrays.asList(40, 60));
        ArrayList<Integer> preiseUSBLaufwerke3 = new ArrayList<>(Arrays.asList(8, 12));
        ElektronikShop shop3 = new ElektronikShop(preiseTastaturen3, preiseUSBLaufwerke3);
        try{
            Assertions.assertEquals(52, shop3.getSummeTastaturUndUsbLBudget(60));
        } catch (Exception exception){
            Assertions.fail();
        }

        ArrayList<Integer> preiseTastaturen4 = new ArrayList<>(Arrays.asList(60, 70));
        ArrayList<Integer> preiseUSBLaufwerke4 = new ArrayList<>(Arrays.asList(8, 12));
        ElektronikShop shop4 = new ElektronikShop(preiseTastaturen4, preiseUSBLaufwerke4);
        try{
            Assertions.assertEquals(-1, shop4.getSummeTastaturUndUsbLBudget(60));
        } catch (Exception exception){
            Assertions.fail();
        }
    }
}