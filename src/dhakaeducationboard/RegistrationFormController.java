/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.ComboBox;
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
    private TextField sessionTextField;
    @FXML
    private Label examOptionLabel;
    private String exam;
    @FXML
    private ComboBox<String> institutionNameComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("Institution.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Institution p;
            try {
                while (true) {
                    p = (Institution) ois.readObject();
                    institutionNameComboBox.getItems().add(p.getUserName());
                }
            }//end of nested try
            catch (Exception e) {
                //
            }//nested catch             
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }

    }

    public void init(String option) {
        exam = option;
        examOptionLabel.setText(option + " Registration Form");
    }

    @FXML
    private void submitForm(MouseEvent event) throws IOException {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            if (exam.equals("HSC")) {
                f = new File(institutionNameComboBox.getValue()+"HSC.bin");
            } else {
                f = new File(institutionNameComboBox.getValue()+"SSC.bin");
            }
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            RegistrationForm s = new RegistrationForm(nameTextField.getText(), Integer.parseInt(rollNumberTextField.getText()), institutionNameComboBox.getValue(), sessionTextField.getText());
            oos.writeObject(s);

        } catch (IOException ex) {
        } finally {
            try {
                if (oos != null) {
                    oos.close();
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
