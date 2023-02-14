package vidmot.pipemania;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import vinnsla.Pipa;
import vinnsla.Pipemania;
import vinnsla.Pipukista;

public class PipemaniaController {
    @FXML
    private Button fxAthFlaedir;

    @FXML
    private Button fxVeljaReit;

    @FXML
    private TextField fxStig;

    @FXML
    private Button fxButar;

    private Pipemania mania;

    private Pipukista kista;

    public PipemaniaController() {
        kista = new Pipukista(4);
        System.out.println(kista);
    }


    public void fxVeljaReit(ActionEvent event) {
        String daemi;
        daemi = (((Button) event.getSource()).getText());
        initialize();
        System.out.print(daemi);
    }


    public void fxMynd(ActionEvent event) {

    }

    public void fxAthFlaedir(ActionEvent event) {
        String flaedir;
        flaedir = (((Button) event.getSource()).getText());
        System.out.print(flaedir);
    }
    // public void getStyleClass(Pipa p) {
    //     p.getInn();
    //     p.getUt();
    //     Button hnappur = (Button) ActionEvent.getSource();
    //     hnappur.getStyleClass().add(getStyleClass(p);
    // }

    public void initialize() {
        mania = new Pipemania();
        fxStig.textProperty().bind(mania.getStig().asString());
        ObservableList<Pipa> q = Pipemania.getPipukista();
        q.addListener((ListChangeListener<Pipa>) change -> {
            if (change.next() && change.wasAdded()) {

                //uppfæra lista hér
                //birta Myndir(q);
            }
        });
        //Birta myndir
        (ObservableList < Pipa > q)
        int i = 3;
        for (Pipa p : q) {
            fxButar.getChildren().get(i).getStyleClass().clear();
            fxButar.getChildren.get(i--).getStyleClass().add(getStyleClass().add(getMyndStyleClass(p));
        }
    }
    //fxButar er fx:id inn í scenebuilder þ.e. þetta er eins og pipekista i scenebuilder
}
}
