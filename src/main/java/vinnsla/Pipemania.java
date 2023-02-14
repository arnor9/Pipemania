package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Pipemania {
    private IntegerProperty Stig = new SimpleIntegerProperty();
    private ObjectProperty<Pipa> currentPipa = new SimpleObjectProperty<Pipa>();
    private static final int F = 5;
    private final Pipa[][] pipulogn = new Pipa[F][F];
    private final ObjectProperty<Pipa> nuverandiPipa = new SimpleObjectProperty<Pipa>();

    public Pipemania() {
        Stig.set(0);
    }

    public static ObservableList<Pipa> getPipukista() {
        return
    }

    public IntegerProperty getStig() {
        return Stig;
    }

    public void setStig(IntegerProperty s) {
        Stig = s;
    }
}
