package com.company;

import java.util.ArrayList;

public class Max_Min {
    private ArrayList<Integer> poszahlen;

    public Max_Min(ArrayList<Integer> poszahlen){
        this.poszahlen= poszahlen;
    }
    //Finden der maximaler Zahl mit hilfe einer for-Schleife
    public int max_zahl(){
        int max = this.poszahlen.get(0);
        for (int idx = 1; idx < this.poszahlen.size(); idx++){
            if (this.poszahlen.get(idx) > max){
                max = this.poszahlen.get(idx);
            }
        }
        return max;
    }

    //Methode um die minimale Zahl zu finden
    public int min_zahl(){
        int min = this.poszahlen.get(0);
        for (int idx = 1; idx < this.poszahlen.size(); idx++){
            if (this.poszahlen.get(idx) < min){
                min = this.poszahlen.get(idx);
            }
        }
        return min;
    }

    //Maximale Summe, in dem man die kleinste Zahl subtrahiert aus der Summe aller Zahlen
    public int max_sum(){
        int min = min_zahl();
        int sum=0;
        for(int idx = 0; idx <this.poszahlen.size(); idx++){
                sum += this.poszahlen.get(idx);
            }
        sum -= min;
        return sum;
    }

    //Maximale Summe, in dem man die maximale Zahl subtrahiert aus der Summe aller Zahlen
    public int min_sum(){
        int max = max_zahl();
        int sum=0;
        for(int idx = 0; idx <this.poszahlen.size(); idx++){
                sum += this.poszahlen.get(idx);
        }
        sum -=max;
        return sum;
    }
}
