package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Aufgabe1
        Uni ubb = new Uni();
        ArrayList<Integer> noten= new ArrayList<Integer>(Arrays.asList(67, 23, 44, 78, 21, 37, 40, 99, 67, 90, 55, 64, 82, 44));
        System.out.println("Aufgabe1");
        System.out.println("Die Notenliste ist folgende:");
        System.out.println(noten);
        System.out.println("A. Die unausreichenden Noten sind:");
        System.out.println(ubb.unreichendeNoten(noten));
        System.out.println("B. Der Durchschnittswert ist: ");
        System.out.println(ubb.durchschnitt(noten));
        System.out.println("C. Die Notenliste, abgerundet: ");
        System.out.println(ubb.abrunden(noten));
        System.out.println("D. Die maximale abgerundete Note:");
        int max_aufrund = ubb.maxNote(noten);
        if (max_aufrund == 37){
            System.out.println("Es git keine Note die aufgerundet werden kann!");
        }
        else {
            System.out.println(ubb.maxNote(noten));
        }

    //Aufgabe2
        ArrayList<Integer> pos_zahlen= new ArrayList<Integer>(Arrays.asList(6, 213, 44, 78, 21, 37, 40, 99, 67,340,90,3));
        Max_Min liste = new Max_Min(pos_zahlen);
        System.out.println("\nAufgabe2");
        System.out.println("Die Liste von Zahlen ist folgende:");
        System.out.println(pos_zahlen);
        System.out.println("A. Die maximale Zahl ist:");
        System.out.println(liste.max_zahl());
        System.out.println("B. Die minimale Zahl ist: ");
        System.out.println(liste.min_zahl());
        System.out.println("C. Maximale Summe von n-1 Zahlen: ");
        System.out.println(liste.max_sum());
        System.out.println("D. Minimale Summe von n-1 Zahlen:");
        System.out.println(liste.min_sum());

    //Aufgabe3
        ArrayList<Integer> zahl1= new ArrayList<Integer>(Arrays.asList(6,2,0,0,0,7,1));
        ArrayList<Integer> zahl2= new ArrayList<Integer>(Arrays.asList(7,2,0,0,0,0,0));
        BigNumbers rechnungen = new BigNumbers(zahl1, zahl2);
        System.out.println("\nAufgabe3");
        System.out.println("Die erste  Zahl:");
        System.out.println(zahl1);
        System.out.println("Die zweite Zahl:");
        System.out.println(zahl2);
        System.out.println("A. Die Summe der Zahlen:");
        System.out.println(rechnungen.summe());
        System.out.println("B. Die differenz der Zahlen: ");
        System.out.println(rechnungen.diff());
        System.out.println("C. Die Multiplikation der ersten Zahl mit einer Ziffer: ");
        System.out.println(rechnungen.mul(3));
        System.out.println("D. Die Division der ersten Zahl mit einer Ziffer:");
        System.out.println(rechnungen.div(4));

        //Aufgabe4
        ArrayList<Integer> tastatur= new ArrayList<Integer>(Arrays.asList(60,21,34,61,100,70,15));
        ArrayList<Integer> usb= new ArrayList<Integer>(Arrays.asList(17,25,20,30,50,80,26,140));
        ElektroShop shop = new ElektroShop(tastatur, usb, 70);
        System.out.println("\nAufgabe4");
        System.out.println("Tastaturen Preise :");
        System.out.println(tastatur);
        System.out.println("USB Laufwerke Preise:");
        System.out.println(usb);
        System.out.println("A.Die billigste Tastatur kostet:");
        System.out.println(shop.billigsteTast());
        System.out.println("B. Der teuerste Gegenstand ist: ");
        System.out.println(shop.teuersteGegegnstand());
        System.out.println("C. Teuerste leistbare USB Laufwerk fur Markus ");
        int teuerUSB = shop.teuersteUsbBuget();
        if (teuerUSB == -1){
            System.out.print("Markus kann sich kein USB Laufwerk leisten\n");
        }
        else{
            System.out.println(teuerUSB);
        }
        System.out.println("D. Die maximale Ausgabe fur Markus fur je einen Gegenstand ist:");
        int ausGeld = shop.maxAusgabe();
        if (ausGeld == -1){
            System.out.print("Markus kann sich nicht zwei Gegenstande leisten");
        }
        else{
            System.out.println(ausGeld);
        }
    }

}
