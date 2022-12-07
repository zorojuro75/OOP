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
    private String id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeCombo.getItems().addAll("Student", "Institution", "Teacher", "Head Of Examination", "Registrar Office", "Office Administrator", "Education Minister", "Scholarship Office");
        userTypeCombo.setValue("Student");
    }

    @FXML
    private void createAccountOnClick(MouseEvent event) throws IOException {
        Random R = new Random();
        String str = userTypeCombo.getValue();
        if (str.equals("Student")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File("Student.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                Student s = new Student(
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText()   
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("Institution")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File("Institution.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                Institution s;
                s = new Institution(
                        Integer.toString(R.nextInt(100)),
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText(),
                        Integer.toString(R.nextInt(10000))
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("Registrar Office")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File(str+".bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                RegistrarOffice s;
                s = new RegistrarOffice(
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText()
                        
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("Teacher")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File(str+".bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                Teacher s;
                s = new Teacher(
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText()
                        
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("Scholarship Office")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File(str+".bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                ScholarshipOffice s;
                s = new ScholarshipOffice(
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText()
                        
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("Education Minister")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File(str+".bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                EducationMinister s;
                s = new EducationMinister(
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText()
                        
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("Head Of Examination")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File(str+".bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                HeadOfExamination s;
                s = new HeadOfExamination(
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText()
                        
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("Office Administrator")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File(str+".bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                OfficeAdministrator s;
                s = new OfficeAdministrator(
                        nameTextField.getText(),
                        id = Integer.toString(R.nextInt(10000)),
                        emailTextField.getText(),
                        passwordTextField.getText()
                        
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent registrationFormParent = loader.load();
        Scene registrationFormScene = new Scene(registrationFormParent);

        LoginController controller = loader.getController();
        controller.init(id);

        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        registrationFormStage.setScene(registrationFormScene);
        registrationFormStage.setTitle("Dhaka Education Board");
        registrationFormStage.show();
    }

}
