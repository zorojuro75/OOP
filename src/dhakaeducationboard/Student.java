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
    private String institutename;

    public Student() {
    }

    public Student(String userName, String userid, String email, String password, Address a) {
        super(userName, userid, email, password);
        this.address = a;
        regCard = new RegistrationCard();
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

    public RegistrationCard getRegCard() {
        return regCard;
    }

    public void setRegCard(RegistrationCard regCard) {
        this.regCard = regCard;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void applyRegistration(MouseEvent event, Student s) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("registrationForm.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        RegistrationFormController controller = loader.getController();
        controller.init(s);

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
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
