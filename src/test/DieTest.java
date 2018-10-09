package test;

import org.junit.jupiter.api.Test;
import spil.Die;


import static org.junit.jupiter.api.Assertions.*;
// vi tester om terningen er tilfældig
class DieTest {

    Die d1 = new Die();

    @Test
    void rul() {
        int a2=0, a3=0, a4=0, a5=0, a6=0, a1=0;

        while(a1 + a2 + a3 + a4 + a5 + a6 <= 60000) {

            d1.rul();
            int roll = d1.getFaceValue();

            if (roll == 1) {
                a1++;
            }
            if (roll == 2) {
                a2++;
            }
            if (roll == 3) {
                a3++;
            }
            if (roll == 4) {
                a4++;
            }
            if (roll == 5) {
                a5++;
            }
            if (roll == 6) {
                a6++;
            }
        }
        System.out.println("Antal 1'ere " + a1);
        System.out.println("Antal 2'ere " + a2);
        System.out.println("Antal 3'ere " + a3);
        System.out.println("Antal 4'ere " + a4);
        System.out.println("Antal 5'ere " + a5);
        System.out.println("Antal 6'ere " + a6);
        assertTrue(a1 <= 10400 && a1  >= 9600
                && a2 <= 10400 && a2  >= 9600
                && a3 <= 10400 && a4  >= 9600
                && a4 <= 10400 && a4  >= 9600
                && a5 <= 10400 && a5  >= 9600
                && a6 <= 10400 && a6  >= 9600);
    }
}