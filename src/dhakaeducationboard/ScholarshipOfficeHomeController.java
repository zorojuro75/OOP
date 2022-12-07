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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewScholarshipStudents(MouseEvent event) {
    }

    @FXML
    private void viewStudentInformation(MouseEvent event) {
    }

    @FXML
    private void viewScholarStudentResults(MouseEvent event) {
    }

    @FXML
    private void scholarshipRequests(MouseEvent event) {
    }

    @FXML
    private void viewRankings(MouseEvent event) throws IOException {
        Parent studentPublicExamOption1Parent = FXMLLoader.load(getClass().getResource("viewRankings.fxml"));
        Scene studentPublicExamOption1Scene = new Scene(studentPublicExamOption1Parent);
        Stage studentPublicExamOption1Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        studentPublicExamOption1Stage.setScene(studentPublicExamOption1Scene);
        studentPublicExamOption1Stage.setTitle("Dhaka Education Board");
        studentPublicExamOption1Stage.show();
    }

    @FXML
    private void viewInstituteScholarshipBudgets(MouseEvent event) {
    }

    @FXML
    private void scholarshipBudgetRequests(MouseEvent event) {
        
    }

    @FXML
    private void changeScholarshipStatus(MouseEvent event) {
    }

    @FXML
    private void logout(MouseEvent event) {
    }
    
}
