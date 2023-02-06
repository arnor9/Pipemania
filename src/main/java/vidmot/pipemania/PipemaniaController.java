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


}
