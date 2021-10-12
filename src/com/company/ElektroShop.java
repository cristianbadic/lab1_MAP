package com.company;

import java.util.ArrayList;

public class ElektroShop {
    private ArrayList<Integer> tastaturen;
    private ArrayList<Integer> usb_laufwerke;
    private int buget;

    public ElektroShop(ArrayList<Integer> tastaturen, ArrayList<Integer> usb_laufwerke, int buget){
        this.tastaturen = tastaturen;
        this.usb_laufwerke = usb_laufwerke;
        this.buget= buget;
    }

    //gibt die billigste Tastatur aus
    public int billigsteTast(){
        int billigste = tastaturen.get(0);
        for( int idx = 1; idx< tastaturen.size(); idx++){
            if (tastaturen.get(idx)< billigste){
                billigste = tastaturen.get(idx);
            }
        }
        return billigste;
    }

    //gibt den teuersten Gegenstand aus
    public int teuersteGegegnstand(){
        int teuerste = tastaturen.get(0);
        for (int tastatur : tastaturen){
            if (tastatur > teuerste){
                teuerste = tastatur;
            }
        }
        for (int usb : usb_laufwerke){
            if (usb > teuerste){
                teuerste = usb;
            }
        }
        return teuerste;
    }

    //gibt -1 aus, wenn sich Markus kein USB leisten kann und sonst den teuersten USB den sich Markus leisten kann
    public int teuersteUsbBuget(){
        int teuerste = -1;
        for (int usb : usb_laufwerke){
            if (usb > teuerste && usb<= buget){
                teuerste = usb;
            }
        }
        return teuerste;
    }

    //man Findet die Maximale ausgabesumme fur die 2 Objekten, wenn der Buget zu klien ist wird -1 zuruckgegeben
    public int maxAusgabe(){
        int max = -1;
        int idxTast = 0;
        int idxUsb = 0;
        while (idxTast < tastaturen.size()){
            while(idxUsb < usb_laufwerke.size()){
                int ausgabe = tastaturen.get(idxTast)+ usb_laufwerke.get(idxUsb);
                if (ausgabe <= buget && ausgabe > max){
                    max = ausgabe;
                }
                idxUsb +=1;
            }
            idxTast+=1;
            idxUsb = 0;
        }
        return max;
    }
}
