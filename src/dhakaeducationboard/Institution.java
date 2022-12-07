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
import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author willi
 */
public class Institution extends User implements Serializable{
    private String rank;

    public Institution(String rank) {
        this.rank = rank;
    }

    public Institution(String rank, String userName, String userid, String email, String password) {
        super(userName, userid, email, password);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
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