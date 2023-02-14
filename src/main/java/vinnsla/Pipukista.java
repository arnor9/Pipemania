package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class Pipukista {

    private final ObservableList<Pipa> kista = FXCollections.observableArrayList();

    public Pipukista(int f) {
        for (int i = 0; i < f; i++) {
            kista.add(nyPipa());
            //Hér þarf að kalla á eh fall! líklega í controller, sem að tekur kistuna... loopar í gegnum hana og birtir
            // myndirnar eru birtar á réttum stað
        }
    }

    Random random = new Random();

    private Pipa nyPipa() {
        int RandomInn = random.nextInt(3);
        int RandomUt = random.nextInt(3);

        return new Pipa(RandomInn, RandomUt);
    }

    public Pipa naestaPipa() {
        Pipa nedst;
        nedst = kista.get(0);
        // Skila myndinni á sinn stað
        kista.remove(nedst);
        Pipa p = nyPipa();
        kista.add(p);
        return p;
    }
}
