/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;
import headOfExam.*;
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
public class HeadOfExaminationHomeController implements Initializable {

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
    private void createInstitutionSeatPlans(MouseEvent event) {
    }

    @FXML
    private void finalizeExamSchedules(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/headOfExam/ExamSchedule.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }

    @FXML
    private void generateStatisticsExam(MouseEvent event) {
    }

    @FXML
    private void assignInvigilators(MouseEvent event) {
    }

    @FXML
    private void viewExpelledStudentInformation(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/headOfExam/ExpelledStudentScene.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }

    @FXML
    private void finalizeQuestionSets(MouseEvent event) {
    }

    @FXML
    private void provideMarkScheme(MouseEvent event) {
    }

    @FXML
    private void processMarksheets(MouseEvent event) {
    }

    @FXML
    private void logout(MouseEvent event) {
    }

    public void init(String name, String id){
        nameLabel.setText("Name : "+ name);
        idLabel.setText("ID : "+ id);
    }
    
}
