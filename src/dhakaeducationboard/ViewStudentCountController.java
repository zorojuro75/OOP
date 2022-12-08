/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class ViewStudentCountController implements Initializable {

    @FXML
    private ComboBox<String> institutionNameCombo;
    @FXML
    private TableView<Student> studentTableView;
    @FXML
    private TableColumn<Student, String> id;
    @FXML
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> email;
    @FXML
    private Label institutionStudentCount;
    private EducationMinister edumini = new EducationMinister();
    private int count = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("Institution.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Institution p;
            try {
                while (true) {
                    p = (Institution) ois.readObject();
                    institutionNameCombo.getItems().add(p.getUserName());
                }
            }//end of nested try
            catch (Exception e) {
                //
            }//nested catch             
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    @FXML
    private void dashboard(MouseEvent event) {
    }

    @FXML
    private void logOut(MouseEvent event) throws IOException {
        edumini.logout(event);
    }

    @FXML
    private void showList(MouseEvent event) {
        
        id.setCellValueFactory(new PropertyValueFactory<Student, String>("userid"));
        name.setCellValueFactory(new PropertyValueFactory<Student, String>("userName"));
        email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        studentTableView.setItems(getStudents(institutionNameCombo.getValue()));
        institutionStudentCount.setText("Number of Students: "+count);
        count=0;
    }

    public ObservableList<Student> getStudents(String str) {
        ObservableList<Student> student = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File(str + ".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Student p;
            try {
                while (true) {
                    p = (Student) ois.readObject();
                    student.add(p);
                    count++;
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
        return student;
    }

}
