/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headOfExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author mehed
 */
public class ExpelledStudentSceneController implements Initializable {

    @FXML
    private TableView<ExpelledList> tableview;
    @FXML
    private TableColumn<ExpelledList, String> studentid;
    @FXML
    private TableColumn<ExpelledList, String> name;
    @FXML
    private TableColumn<ExpelledList, String> examName;
    @FXML
    private TableColumn<ExpelledList, String> subjectCode;
    @FXML
    private TableColumn<ExpelledList, String> subjectTitle;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentid.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        examName.setCellValueFactory(new PropertyValueFactory<>("exam"));
        subjectCode.setCellValueFactory(new PropertyValueFactory<>("code"));
        subjectTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        tableview.setItems(getListData());
        // TODO
    }    
    public ObservableList<ExpelledList> getListData(){
        ObservableList<ExpelledList> obList = FXCollections.observableArrayList();
          File f = null;
        Scanner sc;
        String s1,s2,s3,s4,s5;
        String str;
        String[] tokens;
        try {
            f = new File("ExpelledStudent.txt");
            sc = new Scanner(f);
            if (f.exists()) {

                while (sc.hasNextLine()) {
                    str = sc.nextLine();
                    tokens = str.split("%%");
                    s1=tokens[0];
                    s2=tokens[1];
                    s3=tokens[2];
                    s4=tokens[3];
                    s5=tokens[4];
                    obList.add(new ExpelledList(s1, s2, s3, s4,s5));
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error in getTableViewInfo!!File reading failed!!");
        }finally {
            System.out.println(" getTableViewInfo!!File reading done!!");
        }

        return obList;
    }

    @FXML
    private void logOutOnClick(MouseEvent event) {
    }

    @FXML
    private void homeOnClick(MouseEvent event) {
    }
    
    
}
