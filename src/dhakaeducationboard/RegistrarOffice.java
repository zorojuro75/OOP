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
public class RegistrarOffice extends User implements Serializable{

    public RegistrarOffice() {
    }

    public RegistrarOffice(String userName, String userid, String email, String password) {
        super(userName, userid, email, password);
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

    public void confirmEnrollRequests(MouseEvent event) {
    }


    public void registerInstitution(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewInstiReg.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        LoginController controller = loader.getController();
//        controller.init();

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }


    public void prepareRegistrationCards(MouseEvent event) {
        
    }

    public void prepareAdmitCards(MouseEvent event) {
    }


    public void viewStudentInformation(MouseEvent event) {
    }

    public void updateCorrectionRequests(MouseEvent event) {
    }


    private void handleStudentMigrations(MouseEvent event) {
    }


    public void requestBillChange(MouseEvent event) {
    }
}
