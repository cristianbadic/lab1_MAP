package com.company;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;

public class Uni {

    //man erzeugt eine neue Liste, welche alle unreichende Noten, Noten unter 40, enthalt
    public ArrayList<Integer> unreichendeNoten(ArrayList<Integer> noten){
        ArrayList<Integer> unreichend = new ArrayList<Integer>();
        for (int idx = 0; idx < noten.size(); idx++){
            if (noten.get(idx) < 40){
                unreichend.add(noten.get(idx));
            }
        }
        return unreichend;
    }

    //man macht eine Summe aus aller Noten und Teilt sie durch die Anzahl der Noten
    public double durchschnitt(ArrayList<Integer> noten){
        int sum = 0;
        for (int idx = 0; idx < noten.size(); idx++){
            sum += noten.get(idx);
        }
        return ((double)sum)/ noten.size();
    }

    //man erzeugt einen Array mit alle Noten die aufgerundet werden, dabei wird immer die aufgerundete Note eingefugt
    public ArrayList<Integer> abrunden(ArrayList<Integer> noten){
        ArrayList<Integer> ab_noten= new ArrayList<Integer>();
        for (int idx=0; idx < noten.size(); idx++){
            if (noten.get(idx) > 37){
                if(noten.get(idx) %5 == 3){
                    ab_noten.add(noten.get(idx)+2);
                }
                else if(noten.get(idx) %5 == 4){
                    ab_noten.add(noten.get(idx)+1);
                }
            }
        }
        return ab_noten;
    }

    //man sucht die maximale Note die aufgerundet wird, man rundet sie auf und gibt sie aus
    //wenn keine Zahl aufgerundet wird, wird 37 ausgegeben, die grosste Note, die man nicht aufrundet
    public int maxNote(ArrayList<Integer> noten){
        int max = 37;
        for (int idx=0; idx < noten.size(); idx++) {
            if(noten.get(idx)> max) {
                if (noten.get(idx) % 5 == 3) {
                    max = noten.get(idx) + 2;
                } else if (noten.get(idx) % 5 == 4) {
                    max = noten.get(idx) + 1;
                }
            }
        }
        return max;
    }
}
