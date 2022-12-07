/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class RegistrationFormController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField rollNumberTextField;
    @FXML
    private TextField institutionNameTextField;
    @FXML
    private TextField sessionTextField;
    @FXML
    private Label examOptionLabel;
    private String exam;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void init(String option) {
        exam =option;
        examOptionLabel.setText(option+" Registration Form");
    }

    @FXML
    private void submitForm(MouseEvent event) throws IOException {
        File f = null;
        FileWriter fw = null;

        try {

            f = new File(exam + ".txt");
            if (f.exists()) {
                fw = new FileWriter(f, true);
            } else {
                fw = new FileWriter(f);
            }
            fw.write(
                    rollNumberTextField.getText() + ","
                    + nameTextField.getText() + ","
                    + institutionNameTextField.getText() + ","
                    + sessionTextField.getText() + "\n"
            );

        } catch (IOException ex) {
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {
            }
        }
        if (true) {
            Parent paymentOptionParent = FXMLLoader.load(getClass().getResource("paymentOption.fxml"));
            Scene paymentOptionScene = new Scene(paymentOptionParent);
            Stage paymentOptionStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            paymentOptionStage.setScene(paymentOptionScene);
            paymentOptionStage.setTitle("Dhaka Education Board");
            paymentOptionStage.show();
        }
    }

}
