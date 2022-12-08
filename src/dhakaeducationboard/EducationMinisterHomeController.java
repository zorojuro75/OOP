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
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class EducationMinisterHomeController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    private EducationMinister edumini = new EducationMinister();
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
    private void viewPercentagePassFailOnClick(MouseEvent event) {
    }

    @FXML
    private void viewStudentCountOnClick(MouseEvent event) throws IOException {
        edumini.viewStudentCount(event);
    }

    @FXML
    private void viewPercentageGendersOnClick(MouseEvent event) {
    }

    @FXML
    private void viewTeacherStaffCountOnClick(MouseEvent event) {
    }

    @FXML
    private void viewInstituteScholarshipBudgetsOnClick(MouseEvent event) {
    }

    @FXML
    private void requirementRequestsOnClick(MouseEvent event) {
    }

    @FXML
    private void officialRequestsOnClick(MouseEvent event) {
    }

    @FXML
    private void viewRankingsOnClick(MouseEvent event) {
    }

    @FXML
    private void logoutOnClick(MouseEvent event) throws IOException {
        edumini.logout(event);
    }
    
}
