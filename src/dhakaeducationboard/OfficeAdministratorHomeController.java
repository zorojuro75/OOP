/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class OfficeAdministratorHomeController implements Initializable {

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
    private void passwordResetRequests(MouseEvent event) {
    }

    @FXML
    private void publishMarksheets(MouseEvent event) {
    }

    @FXML
    private void requestProposals(MouseEvent event) {
    }

    @FXML
    private void teacherInstitutionRequests(MouseEvent event) {
    }

    @FXML
    private void backupSystem(MouseEvent event) {
    }

    @FXML
    private void showHideResults(MouseEvent event) {
    }

    @FXML
    private void createInstitutionAccount(MouseEvent event) {
    }

    @FXML
    private void publishAllocationSchedule(MouseEvent event) {
    }

    @FXML
    private void logout(MouseEvent event) {
    }

    void init(String userName, String userid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
