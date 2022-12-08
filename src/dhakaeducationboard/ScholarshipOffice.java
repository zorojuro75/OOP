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
public class ScholarshipOffice extends User implements Serializable{

    public ScholarshipOffice() {
    }

    public ScholarshipOffice(String userName, String userid, String email, String password) {
        super(userName, userid, email, password);
    }

    public void viewScholarshipStudents(MouseEvent event) {
    }

    public void viewStudentInformation(MouseEvent event) {
    }

    public void viewScholarStudentResults(MouseEvent event) {
    }

    public void scholarshipRequests(MouseEvent event) {
    }

    public void viewRankings(MouseEvent event) throws IOException {
        Parent studentPublicExamOption1Parent = FXMLLoader.load(getClass().getResource("viewRankings.fxml"));
        Scene studentPublicExamOption1Scene = new Scene(studentPublicExamOption1Parent);
        Stage studentPublicExamOption1Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        studentPublicExamOption1Stage.setScene(studentPublicExamOption1Scene);
        studentPublicExamOption1Stage.setTitle("Dhaka Education Board");
        studentPublicExamOption1Stage.show();
    }

    public void viewInstituteScholarshipBudgets(MouseEvent event) {
    }

    public void scholarshipBudgetRequests(MouseEvent event) {
        
    }

    public void changeScholarshipStatus(MouseEvent event) {
    }
}
