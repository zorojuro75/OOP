/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.IOException;
import java.io.Serializable;
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
public class Student extends User implements Serializable {
    Address address;
    private RegistrationCard regCard;
    public Student(){
    }

    public Student(String userName, String userid, String email, String password, Address a) {
        super(userName, userid, email, password);
        this.address = a;
        regCard= new RegistrationCard();
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
    public void applyRegistration(MouseEvent event) throws IOException {
        Parent studentPublicExamOption1Parent = FXMLLoader.load(getClass().getResource("studentPublicExamOption1.fxml"));
        Scene studentPublicExamOption1Scene = new Scene(studentPublicExamOption1Parent);
        Stage studentPublicExamOption1Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        studentPublicExamOption1Stage.setScene(studentPublicExamOption1Scene);
        studentPublicExamOption1Stage.setTitle("Dhaka Education Board");
        studentPublicExamOption1Stage.show();
    }


    public void applyRechecking(MouseEvent event) {
    }


    public void viewSeatPlan(MouseEvent event) {
    }


    public void editPersonalInformation(MouseEvent event) {
    }


    public void applyCollege(MouseEvent event) {
    }

    public void changeInstitution(MouseEvent event) {
    }


    public void applyScholarship(MouseEvent event) {
    }
}
