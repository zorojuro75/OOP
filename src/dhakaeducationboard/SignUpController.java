/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.EOFException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Random;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private ComboBox<String> userTypeCombo;
    
    private ArrayList<Student> studentArr;
    private ArrayList<Institution> institutionArr;
    private ArrayList<Teacher> teacherArr;
    private ArrayList<HeadOfExamination> headOfExaminationArr;
    private ArrayList<RegistrarOffice> registrarArr;
    private ArrayList<OfficeAdministrator> adminArr;
    private ArrayList<EducationMinister> emArr;
    private ArrayList<ScholarshipOffice> scholarshipArr;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeCombo.getItems().addAll("Student","Institution","Teacher","Head Of Examination","Registrar Office","Office Administrator", "Education Minister", "Scholarship Office");
        userTypeCombo.setValue("Student");
        studentArr = new ArrayList<Student>();
        institutionArr = new ArrayList<Institution>();
        teacherArr = new ArrayList<Teacher>();
        headOfExaminationArr = new ArrayList<HeadOfExamination>();
        registrarArr = new ArrayList<RegistrarOffice>();
        adminArr = new ArrayList<OfficeAdministrator>();
        emArr = new ArrayList<EducationMinister>();
        scholarshipArr = new ArrayList<ScholarshipOffice>();
    }    

    @FXML
    private void createAccountOnClick(MouseEvent event) throws IOException {
        String filename = userTypeCombo.getValue()+".bin";
        File file = new File (filename);
        ObjectOutputStream oos = null;
        boolean append = true; 
        try {
            if (file.exists()) {
                oos = new AppendableObjectOutputStream (new FileOutputStream (filename, append));
            }
            else {
                oos = new ObjectOutputStream (new FileOutputStream (filename));
            }
            switch (userTypeCombo.getValue()) {
                case "Student":
                    {
                        int userID = 1000000;
                        studentArr.add(new Student(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID));
                        for (Student s:studentArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
                case "Institution":
                    {     
                        Random r = new Random();
                        int userID = 2000000;
                        int random = r.nextInt(100);
                        String rank = "";
                        rank += random;
                        institutionArr.add(new Institution(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID, rank));
                        for (Institution s:institutionArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
                case "Teacher":
                    {     
                        int userID = 3000000;
                        teacherArr.add(new Teacher(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID));
                        for (Teacher s:teacherArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
                case "Registrar Office":
                    {
                        int userID = 5000000;
                        registrarArr.add(new RegistrarOffice(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID));
                        for (RegistrarOffice s:registrarArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
                case "Head Of Examination":
                    {
                        int userID = 4000000;
                        headOfExaminationArr.add(new HeadOfExamination(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID));
                        for (HeadOfExamination s:headOfExaminationArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
                case "Office Administrator":
                    {
                        int userID = 6000000;
                        adminArr.add(new OfficeAdministrator(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID));
                        for (OfficeAdministrator s:adminArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
                case "Education Minister":
                    {
                        int userID = 7000000;
                        emArr.add(new EducationMinister(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID));
                        for (EducationMinister s:emArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
                case "Scholarship Office":
                    {
                        int userID = 8000000;
                        scholarshipArr.add(new ScholarshipOffice(nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), userID));
                        for (ScholarshipOffice s:scholarshipArr){
                            oos.writeObject(s);
                        }       
                        break;
                    }
            }
            oos.flush();
        }
        catch (Exception e){ }
        finally{
            try{
                if (oos != null) oos.close ();
            }catch (Exception e){ }
        }
        Parent loginHomeParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene loginHomeScene = new Scene(loginHomeParent);
        Stage loginHomeStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        loginHomeStage.setScene(loginHomeScene);
        loginHomeStage.setTitle("Dhaka Education Board");
        loginHomeStage.show();
    }
    
    private static class AppendableObjectOutputStream extends ObjectOutputStream {
          public AppendableObjectOutputStream(OutputStream oos) throws IOException {
            super(oos);
          }
    }
}
