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
public class TeacherHomeController implements Initializable {

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
    private void applyExaminer(MouseEvent event) {
    }

    @FXML
    private void applyGovernmentTeacher(MouseEvent event) {
    }

    @FXML
    private void submitGrades(MouseEvent event) {
    }

    @FXML
    private void applyInvigilator(MouseEvent event) {
    }

    @FXML
    private void changeInstitution(MouseEvent event) {
    }

    @FXML
    private void checkExamScripts(MouseEvent event) {
    }

    @FXML
    private void receiveExamScripts(MouseEvent event) {
    }

    @FXML
    private void viewClassSchedules(MouseEvent event) {
    }

    @FXML
    private void logout(MouseEvent event) {
    }

    public void init(String name, String id){
        nameLabel.setText("Name : "+ name);
        idLabel.setText("ID : "+ id);
    }
    
}
