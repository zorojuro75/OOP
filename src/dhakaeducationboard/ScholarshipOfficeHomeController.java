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
 * @author anikb
 */
public class ScholarshipOfficeHomeController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    private ScholarshipOffice so= new ScholarshipOffice();
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
    private void viewScholarshipStudentsOnclick(MouseEvent event) {
    }

    @FXML
    private void viewStudentInformationOnclick(MouseEvent event) {
    }

    @FXML
    private void viewScholarStudentResultsOnclick(MouseEvent event) {
    }

    @FXML
    private void scholarshipRequestsOnclick(MouseEvent event) {
    }

    @FXML
    private void viewRankingsOnclick(MouseEvent event) throws IOException {
        so.viewRankings(event);
    }

    @FXML
    private void viewInstituteScholarshipBudgetsOnclick(MouseEvent event) {
    }

    @FXML
    private void scholarshipBudgetRequestsOnclick(MouseEvent event) {
    }

    @FXML
    private void changeScholarshipStatusOnclick(MouseEvent event) {
    }

    @FXML
    private void logoutOnclick(MouseEvent event) throws IOException {
        so.logout(event);
    }
    
}
