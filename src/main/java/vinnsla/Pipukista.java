package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class Pipukista {

    private final ObservableList<Pipa> kista = FXCollections.observableArrayList();

    public Pipukista(int f) {
        for (int i = 0; i < f; i++) {
            kista.add(nyPipa());
        }
    }

    Random random = new Random();

    private Pipa nyPipa() {

        int RandomInn = 1;
        int RandomUt = 2;

        return new Pipa(RandomInn, RandomUt);
    }

    public Pipa naestaPipa() {
        kista.remove(0);
        Pipa p = nyPipa();
        kista.add(p);
        return p;
    }
}
