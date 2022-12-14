/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class RegistrarOfficeHomeController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    private RegistrarOffice R = new RegistrarOffice();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    public void init(String name, String id){
        nameLabel.setText("Name : "+ name);
        idLabel.setText("ID : "+ id);
    }

    @FXML
    private void confirmEnrollRequestsOnClick(MouseEvent event) {
    }

    @FXML
    private void registerInstitutionOnClick(MouseEvent event) {
    }

    @FXML
    private void prepareRegistrationCardsOnClick(MouseEvent event) throws IOException {
        R.prepareRegistrationCards(event);
        
    }

    @FXML
    private void prepareAdmitCardsOnClick(MouseEvent event) {
    }

    @FXML
    private void viewStudentInformationOnClick(MouseEvent event) {
    }

    @FXML
    private void updateCorrectionRequestsOnClick(MouseEvent event) {
    }

    @FXML
    private void handleStudentMigrationsOnClick(MouseEvent event) {
    }

    @FXML
    private void requestBillChangeOnClick(MouseEvent event) {
    }

    @FXML
    private void logoutOnClick(MouseEvent event) throws IOException {
        R.logout(event);
    }
    
}
