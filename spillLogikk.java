package com.codewithkani;

import java.util.Random;
import java.util.Scanner;

public class spillLogikk {
    private static int brukervalg;
    private static int maskinvalg;
    public static int brukerValg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vennligst legg inn et valg mellom 1-3. (Stein er 1, papir er 2 og saks er 3 \n");
        int valg = scanner.nextInt();
        return valg;
    }

    public static int maskinValg() {
        System.out.print("Maskinen er i ferd med å fatte sitt valg...\n");
        Random random = new Random();
        int maskinvalg = random.nextInt(3) + 1;
        return maskinvalg;
    }

     /*
        Stein slår saks ( 1 > 3)
        Saks slår papir ( 3 > 2)
        Papir slår stein (2 > 1)

     * */

    public static void kalkulerVinner() {
        int brukervalg = brukerValg();
        int maskinvalg = maskinValg();

        if (brukervalg == maskinvalg) {
            System.out.println("Det ble likt!");
        } else if (brukervalg == 1 || maskinvalg == 3) {
            System.out.println("Brukeren vant med stein!");
        } else if (brukervalg == 3 || maskinvalg == 2) {
            System.out.println(" Brukeren vant med saks!");
        } else if (brukervalg == 2 || maskinvalg == 1) {
            System.out.println("Brukeren vant med papir!");
        } else if (maskinvalg == 1 || brukervalg == 3) {
            System.out.println("Maskinen vant med stein!!");
        } else if (maskinvalg == 3 || brukervalg == 2) {
            System.out.println("maskinen vant med saks!");
        } else if (maskinvalg == 2 || brukervalg == 1) {
            System.out.println("maskinen vant med papir!");
        }
    }

}