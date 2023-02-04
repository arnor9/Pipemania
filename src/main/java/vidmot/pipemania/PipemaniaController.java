package vidmot.pipemania;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PipemaniaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
