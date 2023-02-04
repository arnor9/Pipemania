module vidmot.pipemania {
    requires javafx.controls;
    requires javafx.fxml;


    opens vidmot.pipemania to javafx.fxml;
    exports vidmot.pipemania;
}
