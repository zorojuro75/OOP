/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class PrepareRegSceneController implements Initializable {

    @FXML
    private ComboBox<String> examTypeCombo;
    @FXML
    private ComboBox<String> institutionNameCombo;
    @FXML
    private TableView<RegistrationForm> regCardTableView;
    @FXML
    private TableColumn<RegistrationForm, String> name;
    @FXML
    private TableColumn<RegistrationForm, String> rollNumber;
    @FXML
    private TableColumn<RegistrationForm, String> institutionName;
    @FXML
    private TableColumn<RegistrationForm, String> session;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        examTypeCombo.getItems().addAll("HSC", "SSC");
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
    private void viewRegFormsOnClick(MouseEvent event) {
        name.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("name"));
        rollNumber.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("rollNumber"));
        institutionName.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("instituteName"));
        session.setCellValueFactory(new PropertyValueFactory<RegistrationForm, String>("session"));
        regCardTableView.setItems(getApplications(examTypeCombo.getValue(), institutionNameCombo.getValue()));
        regCardTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    @FXML
    private void createRegCardsOnClick(MouseEvent event) {
    }

    public ObservableList<RegistrationForm> getApplications(String exam, String institutionName) {
        ObservableList<RegistrationForm> registrationForm = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File(institutionName + exam + ".bin");
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
}
