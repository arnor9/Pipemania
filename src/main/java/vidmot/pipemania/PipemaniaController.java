package vidmot.pipemania;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import vinnsla.Pipemania;
import vinnsla.Pipukista;

public class PipemaniaController {
    @FXML
    private Button fxAthFlaedir;

    @FXML
    private Button fxVeljaReit;

    @FXML
    private TextField fxStig;

    private Pipemania mania;

    private Pipukista kista;

    public PipemaniaController() {
        kista = new Pipukista(4);
        System.out.println(kista);
    }


    public void fxVeljaReit(ActionEvent event) {
        String daemi;
        daemi = (((Button) event.getSource()).getText());
        System.out.print(daemi);
    }

    public void fxMynd(ActionEvent event) {

    }

    public void fxAthFlaedir(ActionEvent event) {
        String flaedir;
        flaedir = (((Button) event.getSource()).getText());
        System.out.print(flaedir);
    }

    public void initialize() {
        mania = new Pipemania();
        //fxStig.textProperty().bind(mania.stigProperty().asString());
    }

    //fxButar er fx:id inn í scenebuilder þ.e. þetta er eins og pipekista i scenebuilder

    // ObservableList<Pipa> q = pipemania.getPipukista();
    //q.addListener((ListChangeListener<Pipa>)change ->{
    //  if(change.next() && change.wasAdded()){
    //    uppfæra lista hér
    //          birta Myndir(q);
    //}
    //})
    //Birta myndir(ObservableList<Pipa>q)
    //  int i = 3;
    //for(pipa p : q){
    //fxButar.getChildren().get(i).getStyleClass().clear();
    //fxButar.getChildren.get(i--).getStyleClass().add(getStyleClasss()
    //.add(getMyndStyleClass(p));


}
