/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.Serializable;

/**
 *
 * @author anikb
 */
public class User implements Serializable{
    private String userName;
    private String userid;
    private String email;

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
    private String password;

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
}

