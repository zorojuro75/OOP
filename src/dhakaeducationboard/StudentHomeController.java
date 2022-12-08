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
public class StudentHomeController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    Student s = new Student();
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
    private void viewBoardExamResultsOnClick(MouseEvent event) {
        
    }

    @FXML
    private void applyRegistrationOnClck(MouseEvent event) throws IOException {
        s.applyRegistration(event);
    }

    @FXML
    private void applyRecheckingOnClick(MouseEvent event) {
        s.applyRechecking(event);
    }

    @FXML
    private void viewSeatPlanOnClick(MouseEvent event) {
        s.viewSeatPlan(event);
    }

    @FXML
    private void editPersonalInformationOnClick(MouseEvent event) {
        s.editPersonalInformation(event);
    }

    @FXML
    private void applyCollegeOnClick(MouseEvent event) {
        s.applyCollege(event);
    }

    @FXML
    private void changeInstitutionOnClick(MouseEvent event) {
        s.changeInstitution(event);
    }

    @FXML
    private void applyScholarshipOnClick(MouseEvent event) {
        s.applyScholarship(event);
    }

    @FXML
    private void logoutOnclick(MouseEvent event) throws IOException {
        s.logout(event);
    }

}
