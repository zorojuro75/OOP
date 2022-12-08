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
    private String userName="";
    Institution I = new Institution();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void init(String name, String id, Institution i){
        I=i;
        nameLabel.setText("Name : "+ name);
        idLabel.setText("ID : "+ id);
    }

    @FXML
    private void getStudentCertificatesOnClick(MouseEvent event) {
        I.getStudentCertificates(event);
    }

    @FXML
    private void publishTeacherCircularOnClick(MouseEvent event) {
        I.publishTeacherCircular(event);
    }

    @FXML
    private void publishAdmissionCircularOnClick(MouseEvent event) {
        I.publishAdmissionCircular(event);
    }

    @FXML
    private void makeExamSeatPlansOnClick(MouseEvent event) {
        I.makeExamSeatPlans(event);
    }

    @FXML
    private void registerBoardExamOnClick(MouseEvent event) throws IOException {
        I.registerBoardExam(event, I);
    }

    @FXML
    private void registerInstituteOnClick(MouseEvent event) {
        I.registerInstitute(event);
    }

    @FXML
    private void budgetExpansionOnClick(MouseEvent event) {
        I.budgetExpansion(event);
    }

    @FXML
    private void scholarshipRequestsOnClick(MouseEvent event) {
        I.scholarshipRequests(event);
    }

    @FXML
    private void logoutOnClick(MouseEvent event) throws IOException {
        I.logout(event);
        
    }
    
}
