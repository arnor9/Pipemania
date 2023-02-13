package vidmot.pipemania;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import vinnsla.Pipemania;

public class PipemaniaController {
    @FXML
    private Button fxAthFlaedir;

    @FXML
    private Button fxVeljaReit;

    private Pipemania mania;


    public void fxVeljaReit(ActionEvent event) {
        String daemi;
        daemi = (((Button) event.getSource()).getText());
        System.out.print(daemi);
    }

    public void fxAthFlaedir(ActionEvent event) {
        String flaedir;
        flaedir = (((Button) event.getSource()).getText());
        System.out.print(flaedir);
    }

    public void initialize() {
        mania = new Pipemania();
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
