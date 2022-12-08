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
public class TeacherHomeController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    private Teacher teacher = new Teacher();
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
    private void applyExaminerOnClick(MouseEvent event) throws IOException {
        teacher.applyExaminer(event);
    }

    @FXML
    private void applyGovernmentTeacherOnClick(MouseEvent event) {
    }

    @FXML
    private void submitGradesOnClick(MouseEvent event) {
    }

    @FXML
    private void applyInvigilatorOnClick(MouseEvent event) {
    }

    @FXML
    private void changeInstitutionOnClick(MouseEvent event) {
    }

    @FXML
    private void checkExamScriptsOnClick(MouseEvent event) {
    }

    @FXML
    private void receiveExamScriptsOnClick(MouseEvent event) {
    }

    @FXML
    private void viewClassSchedulesOnClick(MouseEvent event) {
    }

    @FXML
    private void logoutOnClick(MouseEvent event) throws IOException {
        teacher.logout(event);
    }
    
}
