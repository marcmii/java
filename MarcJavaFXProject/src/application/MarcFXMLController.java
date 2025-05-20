package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MarcFXMLController {

    @FXML
    private Button boto;

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    @FXML
    void click(ActionEvent event) {
    	outputTextArea.setText(inputTextArea.getText());
    }
    
  

}



