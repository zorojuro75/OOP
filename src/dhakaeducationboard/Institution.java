/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
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
public class Institution extends User implements Serializable {

    private String rank;
    private String EIIN;
    private ArrayList<Campus> campus = new ArrayList();

    public Institution(String rank, String userName, String userid, String email, String password, String EIIN, Campus campus) {
        super(userName, userid, email, password);
        this.rank = rank;
        this.EIIN = EIIN;
        this.campus.add(campus);
    }

    public Institution() {
    }

    public String getEIIN() {
        return EIIN;
    }

    public void setEIIN(String EIIN) {
        this.EIIN = EIIN;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getStudentCertificates(MouseEvent event) {
    }

    public void publishTeacherCircular(MouseEvent event) {
    }

    public void publishAdmissionCircular(MouseEvent event) {
    }

    public void makeExamSeatPlans(MouseEvent event) {
    }

    public void registerBoardExam(MouseEvent event, Institution I) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("checkRegistrationApplications.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        CheckRegistrationApplicationsController controller = loader.getController();
        controller.init(I);

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }

    public void registerInstitute(MouseEvent event) {
    }

    public void budgetExpansion(MouseEvent event) {
    }

    public void scholarshipRequests(MouseEvent event) {
    }
}
