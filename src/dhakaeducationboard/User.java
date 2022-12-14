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
 * @author anikb
 */
public class User implements Serializable{
    protected String userName;
    protected String userid;
    protected String email;
    protected String password;
    public User() {
    }

    public User(String userName, String userid, String email, String password) {
        this.userName = userName;
        this.userid = userid;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" + "userName=" + userName + ", userid=" + userid + ", password=" + password + '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean verificataion(String id, String pass){
        if(userid.equals(id) && pass.equals(password)){
            return true;
        }
        return false;
    } 
    public void logout(MouseEvent event) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(loginParent);
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(loginScene);
        loginStage.setTitle("Dhaka Education Board");
        loginStage.show();
    }
}

