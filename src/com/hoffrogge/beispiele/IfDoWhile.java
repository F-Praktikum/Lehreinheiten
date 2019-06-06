package com.hoffrogge.beispiele;

/**
 * Erl�utert den Unterschied von Abfragen mit Bedingungen und Ausf�hren von Code
 * f�r If-Abfragen, While-Schleifen und Do-While-Schleifen.
 */
public class IfDoWhile {

    public static void main(String[] args) {

        int zaehler = 0;

        /*
         * Bedingung wird genau 1 mal gepr�ft und wenn sie wahr ist, der Code 1
         * mal ausgef�hrt.
         * 
         * Code wird 0 - 1 mal ausgef�hrt.
         */
        if (zaehler < 10) {

            System.out.println("If-Abfrage: " + zaehler);
            zaehler++;
        }

        /*
         * Bedingung wird zuerst gepr�ft, trifft sie zu, wird der Code
         * ausgef�hrt. Wird solange wiederholt, bis die Bedigung nicht mehr
         * zutrifft.
         * 
         * Code wird 0 - n mal ausgef�hrt.
         */
        while (zaehler < 10) {

            System.out.println("While-Schleife: " + zaehler);
            zaehler++;
        }

        /*
         * Zuerst wird der Code ausgef�hrt, dann wird die Bedingung gepr�ft und
         * wenn sie zutrifft, der Code wieder ausgef�hrt, die Bedingung wieder
         * gepr�ft usw.
         * 
         * Code wird 1 - n mal ausgef�hrt.
         */
        do {

            System.out.println("Do-While-Schleife: " + zaehler);
            zaehler++;

        } while (zaehler < 10);
    }
}