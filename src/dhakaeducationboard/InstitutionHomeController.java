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
public class InstitutionHomeController implements Initializable {

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

    public void init(String name, String id){
        nameLabel.setText("Name : "+ name);
        idLabel.setText("ID : "+ id);
    }
    
    @FXML
    private void getStudentCertificates(MouseEvent event) {
    }

    @FXML
    private void publishTeacherCircular(MouseEvent event) {
    }

    @FXML
    private void publishAdmissionCircular(MouseEvent event) {
    }

    @FXML
    private void makeExamSeatPlans(MouseEvent event) {
    }

    @FXML
    private void registerBoardExam(MouseEvent event) throws IOException {
        Parent institutionPublicExamOption1Parent = FXMLLoader.load(getClass().getResource("institutionPublicExamOption1.fxml"));
        Scene institutionPublicExamOption1Scene = new Scene(institutionPublicExamOption1Parent);
        Stage institutionPublicExamOption1Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        institutionPublicExamOption1Stage.setScene(institutionPublicExamOption1Scene);
        institutionPublicExamOption1Stage.setTitle("Dhaka Education Board");
        institutionPublicExamOption1Stage.show();
    }

    @FXML
    private void registerInstitute(MouseEvent event) {
    }

    @FXML
    private void budgetExpansion(MouseEvent event) {
    }

    @FXML
    private void scholarshipRequests(MouseEvent event) {
    }

    @FXML
    private void logout(MouseEvent event) {
    }
    
}
