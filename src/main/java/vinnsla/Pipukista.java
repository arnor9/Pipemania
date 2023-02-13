package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class Pipukista {

    private final ObservableList<Pipa> kista = FXCollections.observableArrayList();

    public Pipukista(int i) {
        int fjoldi = 4;
        for (int i = 0; i < fjoldi; i++) {
            kista.add(nyPipa());
        }
    }

    Random random = new Random();

    private Pipa nyPipa() {
        return Pipa(RandomInn, RandomUt);
    }

    public Pipa naestaPipa() {
        kista.remove(0);
        kista.add(nyPipa());
    }

    public static void main(String[] args) {

    }
}
