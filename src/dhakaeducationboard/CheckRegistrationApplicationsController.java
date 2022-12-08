/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class CheckRegistrationApplicationsController implements Initializable {

    @FXML
    private TableView<RegistrationForm> applicationTableView;
    @FXML
    private TableColumn<RegistrationForm, String> name;
    @FXML
    private TableColumn<RegistrationForm, String> rollnumber;
    @FXML
    private TableColumn<RegistrationForm, String> institute;
    @FXML
    private TableColumn<RegistrationForm, String> session;
    @FXML
    private ComboBox<String> examComboBox;
    private Institution I = new Institution();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        examComboBox.getItems().addAll("HSC", "SSC");
        examComboBox.setValue("HSC");
    }

    public void init(Institution i) {
        I =i;
    }

    @FXML
    private void showApplicantsOnClick(MouseEvent event) {
        name.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("name"));
        rollnumber.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("rollNumber"));
        institute.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("instituteName"));
        session.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("session"));
        applicationTableView.setItems(getApplications(examComboBox.getValue(), I.userName));
    }
     public ObservableList<RegistrationForm> getApplications(String exam, String institutionName) {
        ObservableList<RegistrationForm> registrationForm = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File(institutionName+exam+".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            RegistrationForm p;
            try {
                while (true) {
                    p = (RegistrationForm) ois.readObject();
                    registrationForm.add(p);
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
        return registrationForm;
    }

    @FXML
    private void sendApplicationsOnClick(MouseEvent event) {
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("reg"+I.userName+examComboBox.getValue()+".bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            
            RegistrationForm s = applicationTableView.getSelectionModel().getSelectedItem();
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
    }

    @FXML
    private void logoutOnClick(MouseEvent event) throws IOException {
        I.logout(event);
    }

}
