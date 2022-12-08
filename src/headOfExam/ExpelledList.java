/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headOfExam;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author mehed
 */
public class ExpelledList {
    SimpleStringProperty id, name, exam, code,title;
    ExpelledList(String s1, String s2, String s3, String s4, String s5) {
        this.id=new SimpleStringProperty(s1);
        this.name=new SimpleStringProperty(s2);
        this.exam=new SimpleStringProperty(s3);
        this.code=new SimpleStringProperty(s4);
        this.title=new SimpleStringProperty(s5);
    }

    public String getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public String getExam() {
        return exam.get();
    }

    public String getCode() {
        return code.get();
    }

    public String getTitle() {
        return title.get();
    }
    
}
