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
    private String exam;
    @FXML
    private ComboBox<String> institutionNameComboBox;
    @FXML
    private ComboBox<String> examComboBox;
    @FXML
    private ComboBox<String> paymentComboBox;
    private Student std;
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
        paymentComboBox.getItems().addAll("Bkash", "Rocket", "Nagad", "Credit/Debit Card");
        paymentComboBox.setValue("Bkash");
        examComboBox.getItems().addAll("SSC", "HSC");
        examComboBox.setValue("SSC");

    }
    public void init(Student s){
        std =s;
    }

    @FXML
    private void submitForm(MouseEvent event) throws IOException {
        File f = null;
        File f2 = null;
        FileOutputStream fos = null;
        FileOutputStream fos2 = null;
        ObjectOutputStream oos = null;
        ObjectOutputStream oos2 = null;
        exam = examComboBox.getValue();
        try {
            f2 = new File(institutionNameComboBox.getValue()+".bin");
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
            if (f2.exists()) {
                fos2 = new FileOutputStream(f2, true);
                oos2 = new AppendableObjectOutputStream(fos2);
            } else {
                fos2 = new FileOutputStream(f2);
                oos2 = new ObjectOutputStream(fos2);
            }
            std.setInstitutename(institutionNameComboBox.getValue());
            RegistrationForm s = new RegistrationForm(nameTextField.getText(), rollNumberTextField.getText(), institutionNameComboBox.getValue(), sessionTextField.getText());
            oos.writeObject(s);
            oos2.writeObject(std);

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
            Parent paymentOptionParent = FXMLLoader.load(getClass().getResource("studentHome.fxml"));
            Scene paymentOptionScene = new Scene(paymentOptionParent);
            Stage paymentOptionStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            paymentOptionStage.setScene(paymentOptionScene);
            paymentOptionStage.setTitle("Dhaka Education Board");
            paymentOptionStage.show();
        }
    }

    @FXML
    private void viewCardOnClick(MouseEvent event) throws IOException {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("regestered"+ std.getInstitutename() + exam + ".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            RegistrationCard p;
            try {
                while (true) {
                    p = (RegistrationCard) ois.readObject();
                    if(p.getStudentName().equals(std.userName)){
                        std.setRegCard(p);
                    }
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewRegCard.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        ViewRegCardController controller = loader.getController();
        System.out.println(std.toString());
        controller.init(std, exam);
        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }

}
