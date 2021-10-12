package com.company;

import java.util.ArrayList;

public class BigNumbers {
    private ArrayList<Integer> zahl1;
    private ArrayList<Integer> zahl2;

    public BigNumbers(ArrayList<Integer> zahl1, ArrayList<Integer> zahl2) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    //eine Hilfsmethode fur die Methode diff, gibt true aus wenn die zeite der zwei Zahlen grosser ist als die erste
    private boolean relation(){
        int idx = 0;
        while (idx < zahl1.size()){
            if (zahl2.get(idx)>zahl1.get(idx)){
                return true;
            }
            else if(zahl2.get(idx)<zahl1.get(idx)){
                return false;
            }
            idx +=1;
        }
        return false;
    }

    //man durchquert den ersten Array, von hinten nach vorne
    //in den rez Array wird immer, je eine Ziffer am Anfang eingefugt
    public ArrayList<Integer> summe() {
        ArrayList<Integer> rez = new ArrayList<Integer>();
        int trans = 0;
        //trans markiert eine transportierte Ziffer die zur Summe zugezahlt wird
        for (int idx = zahl1.size() - 1; idx >= 0; idx--) {
            int ziff = (zahl1.get(idx) + zahl2.get(idx) + trans) % 10;
            //ziff ist die eigentliche Ziffer, die man in den resultat Array zufugt
            rez.add(0, ziff);
            if (zahl1.get(idx) + zahl2.get(idx) + trans > 9) {
                trans = 1;
            } else {
                trans = 0;
            }
        }
        if (trans == 1) {
            rez.add(0, 1);
        }
        return rez;
    }

    //wenn die zweite Zahl grosser ist, werden die Arrays ausgetauscht
    //man macht die Differenz, tauscht die Arrays wieder zuruck und bei dem rez Array wird der erste Element mit -1 multipliziert
    public ArrayList<Integer> diff() {
        ArrayList<Integer> rez = new ArrayList<Integer>();
        boolean gef = false;
        ArrayList<Integer> aux = new ArrayList<>();
        if (relation()){
            aux = zahl1;
            zahl1 = zahl2;
            zahl2 = aux;
            gef = true;
        }
        int trans = 0;
        for (int idx = zahl1.size() - 1; idx >= 0; idx--) {
            int ziff = (zahl1.get(idx) - zahl2.get(idx) - trans);
            if (ziff <0){
                rez.add(0, 10+ziff);
                trans = 1;
            }
            else{
                rez.add(0, ziff);
                trans=0;
            }
        }
        while(rez.get(0) == 0 && rez.size()>1){
            rez.remove(0);
        }
        if (gef){
            rez.set(0,rez.get(0)*(-1));
            aux = zahl1;
            zahl1 = zahl2;
            zahl2 = aux;
            gef = true;
        }
        return rez;
    }

    //man durchquert denn ersten Array von hinten an, und fugt im rez immer am Anfang
    //man fugt im rez immer am Anfang
    public ArrayList<Integer> mul(int mul_ziff) {
        ArrayList<Integer> rez = new ArrayList<Integer>();
        int trans=0;
        for (int idx = zahl1.size() - 1; idx >= 0; idx--) {
            int ziff = (zahl1.get(idx)*mul_ziff+trans) % 10;
            rez.add(0, ziff);
            trans = (zahl1.get(idx)*mul_ziff+trans) / 10;
        }
        if (trans >0){
            rez.add(0,trans);
        }
        return rez;
    }

    //die Zahl durch welchen man Teilt, wird als Parameter gegeben
    //man fugt im rez immer am Ende
    public ArrayList<Integer> div(int div_ziff){
        ArrayList<Integer> rez = new ArrayList<Integer>();
        int trans;
        //trans wird zur ubertragung der Ziffer benutzt
        if (zahl1.get(0)< div_ziff){
            trans = zahl1.get(0);
        }
        else{
            rez.add(zahl1.get(0)/div_ziff);
            trans = zahl1.get(0)%div_ziff;
        }
        for(int idx=1; idx< zahl1.size(); idx++){
            int ziff = (trans *10 +zahl1.get(idx))/div_ziff;
            rez.add(ziff);
            trans = (trans *10 +zahl1.get(idx))%div_ziff;
        }
        return rez;
    }
}
