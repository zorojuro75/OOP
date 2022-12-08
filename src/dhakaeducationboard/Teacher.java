/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.IOException;
import java.io.Serializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author willi
 */
public class Teacher extends User implements Serializable{

    public Teacher() {
    }

    public Teacher(String userName, String userid, String email, String password) {
        super(userName, userid, email, password);
    }
    
    public void applyExaminer(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("examinerApplicationForm.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }
    
    public void applyGovernmentTeacher(MouseEvent event) {
    }
    
    public void submitGrades(MouseEvent event) {
    }
    
    public void applyInvigilator(MouseEvent event) {
    }
    
    public void changeInstitution(MouseEvent event) {
    }
    
    public void checkExamScripts(MouseEvent event) {
    }
    
    public void receiveExamScripts(MouseEvent event) {
    }
    
    public void viewClassSchedules(MouseEvent event) {
    }
     
}
