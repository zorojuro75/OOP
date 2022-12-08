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
public class ExaminerForm implements Serializable{
    private int teacherId;
    private String exam;
    private String institutionName;
    private String subject;

    public ExaminerForm() {
    }

    public ExaminerForm(int teacherId, String exam, String institutionName, String subject) {
        this.teacherId = teacherId;
        this.exam = exam;
        this.institutionName = institutionName;
        this.subject = subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
