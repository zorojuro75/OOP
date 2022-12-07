/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userIdTextField;
    @FXML
    private TextField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginOnClick(MouseEvent event) {
        ObjectInputStream ois = null;
        String userid = userIdTextField.getText();
        Character ch = userid.charAt(0);
        if (ch.equals('1')) {
            try {
                Student s;
                ois = new ObjectInputStream(new FileInputStream("Student.bin"));
                while (true) {
                    s = (Student) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("studentHome.fxml"));
                            Parent registrationFormParent = loader.load();

                            //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
                            Scene registrationFormScene = new Scene(registrationFormParent);

                            //access the controller
                            StudentHomeController controller = loader.getController();

                            //controller = new PersonViewSceneController();
                            controller.init(s.getName(), s.getUserID());

                            Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            registrationFormStage.setScene(registrationFormScene);
                            registrationFormStage.setTitle("Dhaka Education Board");
                            registrationFormStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        } else if (ch.equals('2')) {
            try {
                Institution s;
                ois = new ObjectInputStream(new FileInputStream("Institution.bin"));
                while (true) {
                    s = (Institution) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            Parent institutionHomeParent = FXMLLoader.load(getClass().getResource("instituitionHome.fxml"));
                            Scene institutionHomeScene = new Scene(institutionHomeParent);
                            Stage institutionHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            institutionHomeStage.setScene(institutionHomeScene);
                            institutionHomeStage.setTitle("Dhaka Education Board");
                            institutionHomeStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        } else if (ch.equals('3')) {
            try {
                Teacher s;
                ois = new ObjectInputStream(new FileInputStream("Teacher.bin"));
                while (true) {
                    s = (Teacher) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            Parent teacherHomeParent = FXMLLoader.load(getClass().getResource("teacherHome.fxml"));
                            Scene teacherHomeScene = new Scene(teacherHomeParent);
                            Stage teacherHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            teacherHomeStage.setScene(teacherHomeScene);
                            teacherHomeStage.setTitle("Dhaka Education Board");
                            teacherHomeStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        } else if (ch.equals('4')) {
            try {
                HeadOfExamination s;
                ois = new ObjectInputStream(new FileInputStream("Head Of Examination.bin"));
                while (true) {
                    s = (HeadOfExamination) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            Parent headOfExaminationHomeParent = FXMLLoader.load(getClass().getResource("headOfExaminationHome.fxml"));
                            Scene headOfExaminationHomeScene = new Scene(headOfExaminationHomeParent);
                            Stage headOfExaminationHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            headOfExaminationHomeStage.setScene(headOfExaminationHomeScene);
                            headOfExaminationHomeStage.setTitle("Dhaka Education Board");
                            headOfExaminationHomeStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        } else if (ch.equals('5')) {
            try {
                RegistrarOffice s;
                ois = new ObjectInputStream(new FileInputStream("Registrar Office.bin"));
                while (true) {
                    s = (RegistrarOffice) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            Parent registrarOfficeHomeParent = FXMLLoader.load(getClass().getResource("registrarOfficeHome.fxml"));
                            Scene registrarOfficeHomeScene = new Scene(registrarOfficeHomeParent);
                            Stage registrarOfficeHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            registrarOfficeHomeStage.setScene(registrarOfficeHomeScene);
                            registrarOfficeHomeStage.setTitle("Dhaka Education Board");
                            registrarOfficeHomeStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        } else if (ch.equals('6')) {
            try {
                OfficeAdministrator s;
                ois = new ObjectInputStream(new FileInputStream("Office Administrator.bin"));
                while (true) {
                    s = (OfficeAdministrator) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            Parent officeAdministratorHomeParent = FXMLLoader.load(getClass().getResource("officeAdministratorHome.fxml"));
                            Scene officeAdministratorHomeScene = new Scene(officeAdministratorHomeParent);
                            Stage officeAdministratorHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            officeAdministratorHomeStage.setScene(officeAdministratorHomeScene);
                            officeAdministratorHomeStage.setTitle("Dhaka Education Board");
                            officeAdministratorHomeStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        } else if (ch.equals('7')) {
            try {
                EducationMinister s;
                ois = new ObjectInputStream(new FileInputStream("Education Minister.bin"));
                while (true) {
                    s = (EducationMinister) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            Parent educationMinisterHomeParent = FXMLLoader.load(getClass().getResource("educationMinisterHome.fxml"));
                            Scene educationMinisterHomeScene = new Scene(educationMinisterHomeParent);
                            Stage educationMinisterHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            educationMinisterHomeStage.setScene(educationMinisterHomeScene);
                            educationMinisterHomeStage.setTitle("Dhaka Education Board");
                            educationMinisterHomeStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        } else if (ch.equals('8')) {
            try {
                ScholarshipOffice s;
                ois = new ObjectInputStream(new FileInputStream("Scholarship Office.bin"));
                while (true) {
                    s = (ScholarshipOffice) ois.readObject();
                    System.out.println(s.getName());
                    System.out.println(s.getEmail());
                    System.out.println(s.getPassword());
                    System.out.println(s.getUserID());
                    if (Integer.parseInt(userIdTextField.getText()) == s.getUserID()) {
                        if (passwordTextField.getText().equals(s.getPassword())) {
                            Parent scholarshipOfficeHomeParent = FXMLLoader.load(getClass().getResource("scholarshipOfficeHome.fxml"));
                            Scene scholarshipOfficeHomeScene = new Scene(scholarshipOfficeHomeParent);
                            Stage scholarshipOfficeHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            scholarshipOfficeHomeStage.setScene(scholarshipOfficeHomeScene);
                            scholarshipOfficeHomeStage.setTitle("Dhaka Education Board");
                            scholarshipOfficeHomeStage.show();
                        }
                    }
                }
            } catch (Exception ex) {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex1) {
                }
            }
        }
    }

    @FXML
    private void signUpHome(MouseEvent event) throws IOException {
        Parent signUpHomeParent = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        Scene signUpHomeScene = new Scene(signUpHomeParent);
        Stage signUpHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpHomeStage.setScene(signUpHomeScene);
        signUpHomeStage.setTitle("Dhaka Education Board");
        signUpHomeStage.show();
    }
}
