package test;

import org.junit.jupiter.api.Test;
import spil.Die;
import static org.junit.jupiter.api.Assertions.*;


class DieTest {

    Die d1 = new Die();
    Die d2 = new Die();

    @Test //tester en ternings fordeling
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

    @Test //Tester 2 terningers fordeling
    void rul2() {
        int a2=0, a3=0, a4=0, a5=0, a6=0, a7=0, a8=0, a9=0, a10=0, a11=0, a12 =0;
        int antaltest = 110000;

        while(a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12<= antaltest) {

            d1.rul();
            d2.rul();
            int roll = d1.getFaceValue() + d2.getFaceValue();

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
            if (roll == 7) {
                a7++;
            }
            if (roll == 8) {
                a8++;
            }
            if (roll == 9) {
                a9++;
            }
            if (roll == 10) {
                a10++;
            }
            if (roll == 11) {
                a11++;
            }
            if (roll == 12) {
                a12++;
            }
        }

        System.out.println("Antal 2'ere " + a2);
        System.out.println("Antal 3'ere " + a3);
        System.out.println("Antal 4'ere " + a4);
        System.out.println("Antal 5'ere " + a5);
        System.out.println("Antal 6'ere " + a6);
        System.out.println("Antal 7'ere " + a7);
        System.out.println("Antal 8'ere " + a8);
        System.out.println("Antal 9'ere " + a9);
        System.out.println("Antal 10'ere " + a10);
        System.out.println("Antal 11'ere " + a11);
        System.out.println("Antal 12'ere " + a12);
        assertTrue(a2 <= antaltest * (1.0/36) * 1.05 && a2 >= antaltest * (1.0/36) * 0.95);
        assertTrue(a3 <= antaltest * (2.0/36) * 1.05 && a3 >= antaltest * (2.0/36) * 0.95);
        assertTrue(a4 <= antaltest * (3.0/36) * 1.05 && a4 >= antaltest * (3.0/36) * 0.95);
        assertTrue(a5 <= antaltest * (4.0/36) * 1.05 && a5 >= antaltest * (4.0/36) * 0.95);
        assertTrue(a6 <= antaltest * (5.0/36) * 1.05 && a6 >= antaltest * (5.0/36) * 0.95);
        assertTrue(a7 <= antaltest * (6.0/36) * 1.05 && a7 >= antaltest * (6.0/36) * 0.95);
        assertTrue(a8 <= antaltest * (5.0/36) * 1.05 && a8 >= antaltest * (5.0/36) * 0.95);
        assertTrue(a9 <= antaltest * (4.0/36) * 1.05 && a9 >= antaltest * (4.0/36) * 0.95);
        assertTrue(a10 <= antaltest * (3.0/36) * 1.05 && a10 >= antaltest * (3.0/36) * 0.95);
        assertTrue(a11 <= antaltest * (2.0/36) * 1.05 && a11 >= antaltest * (2.0/36) * 0.95);
        assertTrue(a12 <= antaltest * (1.0/36) * 1.05 && a12 >= antaltest * (1.0/36) * 0.95);
    }
}