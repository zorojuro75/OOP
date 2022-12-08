/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class ExaminerApplicationFormController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox<String> examOptionCombo;
    @FXML
    private ComboBox<String> institutionNameCombo;
    @FXML
    private ComboBox<String> subjectCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        examOptionCombo.getItems().addAll("HSC", "SSC");
        subjectCombo.getItems().addAll("Bangla", "English", "Mathematics", "Physics", "Chemistry", "Economics", "Accounting", "Finance");
        try {
            f = new File("Institution.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Institution p;
            try {
                while (true) {
                    p = (Institution) ois.readObject();
                    institutionNameCombo.getItems().add(p.getUserName());
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

    @FXML
    private void applyForExaminer(MouseEvent event) throws IOException {
        File f = null;

        FileOutputStream fos = null;

        ObjectOutputStream oos = null;

        try {
            f = new File("examinerApplications.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
 
            ExaminerForm s = new ExaminerForm(Integer.parseInt(idTextField.getText()), examOptionCombo.getValue(), institutionNameCombo.getValue(), subjectCombo.getValue());
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
            Parent paymentOptionParent = FXMLLoader.load(getClass().getResource("teacherHome.fxml"));
            Scene paymentOptionScene = new Scene(paymentOptionParent);
            Stage paymentOptionStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            paymentOptionStage.setScene(paymentOptionScene);
            paymentOptionStage.setTitle("Dhaka Education Board");
            paymentOptionStage.show();
        }
    }
    
}
