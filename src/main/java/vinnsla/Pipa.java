package vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pipa {
    //private int endi1;
    //private int endi2;

    //private static int[] h1 = {0, 1, 1, 1};
    //private static int[] h2 = {1, 3, 0, 2};
    //private static String[] att = {"V", "S", "N", "A"};
    private Att inn;
    private Att ut;
    private final StringProperty opin = new SimpleStringProperty();

    enum Att {V, N, A, S}


    // ordinal til þess að fá tölugildið

    // public Pipa(String endi1, String endi2) {
    //   this.endi1 = endi1;
    // this.endi2 = endi2;
    // }

    public Pipa(int t, int r) {
        this.inn = Att.values()[t];
        this.ut = Att.values()[r];
    }

    public Pipa() {
        this.inn = Att.V;
        this.ut = Att.S;
    }

    //att[this.endi1]
    //att[this.endi2]


    public Att getInn() {
        return inn;
    }

    public Att getUt() {
        return ut;
    }

    public String getOpin() {
        return opin.get();
    }

    //  public boolean flaedir(Pipa s) {
//
    //  }

    //public boolean flaedir(Pipa s) {
    //  if () {

    //    return true;
    //}
    //     return false;
    //}


    public static void main(String[] args) {

    }
}
