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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmEnrollRequests(MouseEvent event) {
    }

    @FXML
    private void registerInstitution(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewInstiReg.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        LoginController controller = loader.getController();
//        controller.init();

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }

    @FXML
    private void prepareRegistrationCards(MouseEvent event) {
    }

    @FXML
    private void prepareAdmitCards(MouseEvent event) {
    }

    @FXML
    private void viewStudentInformation(MouseEvent event) {
    }

    @FXML
    private void updateCorrectionRequests(MouseEvent event) {
    }

    @FXML
    private void handleStudentMigrations(MouseEvent event) {
    }

    @FXML
    private void requestBillChange(MouseEvent event) {
    }

    @FXML
    private void logout(MouseEvent event) {
    }

    void init(String userName, String userid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
