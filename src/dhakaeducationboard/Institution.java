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
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author willi
 */
public class Institution {

    private String name;
    private String email;
    private String password;
    private int userID;
    private String rank;

    public Institution(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public Institution(String name, String email, String password, int userID, String rank) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userID = userID;
        this.rank = rank;
        createRankFile(name, rank);
    }

    public Institution() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    private void createRankFile(String name, String rank) {
        try {
                File f = new File("InstitutionRank.txt");
                FileWriter fw;
                if(f.exists())
                    fw = new FileWriter(f,true);
                else 
                    fw = new FileWriter(f);
                String str = "";
                str += name+","+rank+"\n";
                fw.write(str);
                fw.close();
            } 
        catch (IOException ex) { }
    }
}