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
public class RegistrationForm implements Serializable {
    private String name;
    private int rollNumber;
    private String instituteName;
    private String session;

    public RegistrationForm(String name, int rollNumber, String instituteName, String Session) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.instituteName = instituteName;
        this.session = Session;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String Session) {
        this.session = Session;
    }

    @Override
    public String toString() {
        return "RegistrationForm{" + "name=" + name + ", rollNumber=" + rollNumber + ", instituteName=" + instituteName + ", Session=" + session + '}';
    }
}
