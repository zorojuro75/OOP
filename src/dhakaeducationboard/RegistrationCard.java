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
public class RegistrationCard implements Serializable {
    private int regID;
    private int rollNumber;
    private String studentName;
    private String institutionName;
    private String sessionName;

    public RegistrationCard() {
        
    }

    public RegistrationCard(int regID, int rollNumber, String studentName, String institutionName, String sessionName) {
        this.regID = regID;
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.institutionName = institutionName;
        this.sessionName = sessionName;
    }

    public int getRegID() {
        return regID;
    }

    public void setRegID(int regID) {
        this.regID = regID;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }
    
}
