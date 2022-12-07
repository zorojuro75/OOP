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
    private void logout(MouseEvent event) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(loginParent);
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(loginScene);
        loginStage.setTitle("Dhaka Education Board");
        loginStage.show();
    }

    @FXML
    private void viewBoardExamResults(MouseEvent event) {
    }

    @FXML
    private void applyRegistration(MouseEvent event) throws IOException {
        Parent studentPublicExamOption1Parent = FXMLLoader.load(getClass().getResource("studentPublicExamOption1.fxml"));
        Scene studentPublicExamOption1Scene = new Scene(studentPublicExamOption1Parent);
        Stage studentPublicExamOption1Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        studentPublicExamOption1Stage.setScene(studentPublicExamOption1Scene);
        studentPublicExamOption1Stage.setTitle("Dhaka Education Board");
        studentPublicExamOption1Stage.show();
    }

    @FXML
    private void applyRechecking(MouseEvent event) {
    }

    @FXML
    private void viewSeatPlan(MouseEvent event) {
    }

    @FXML
    private void editPersonalInformation(MouseEvent event) {
    }

    @FXML
    private void applyCollege(MouseEvent event) {
    }

    @FXML
    private void changeInstitution(MouseEvent event) {
    }

    @FXML
    private void applyScholarship(MouseEvent event) {
    }

}
