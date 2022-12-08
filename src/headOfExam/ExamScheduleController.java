/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headOfExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author mehed
 */
public class ExamScheduleController implements Initializable {

    @FXML
    private TableView<ExamSchedule> tableview;
    @FXML
    private TableColumn<ExamSchedule, String> Tname;
    @FXML
    private TableColumn<ExamSchedule, String> Tcode;
    @FXML
    private TableColumn<ExamSchedule, String> TexamDate;
    @FXML
    private TableColumn<ExamSchedule, String> Ttime;
    @FXML
    private ComboBox examTitleComboBox;
    @FXML
    private ComboBox subjectCode;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField examTime;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        examTitleComboBox.getItems().addAll("HSC","SSC");
        subjectCode.getItems().addAll("101","105","107","109","111");

        // TODO
    }    

    @FXML
    private void addToTableOnClick(MouseEvent event) {
        String time = examTime.getText();
        String Scode= subjectCode.getValue().toString();
        String Exam= examTitleComboBox.getValue().toString();
        LocalDate GDate= datePicker.getValue();
        String examDate=GDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
//        System.out.println("G date:"+GDate);
//        System.out.println("Format:"+examDate);
//        System.out.println("time:"+time);
//        System.out.println("code:"+Scode);
//        System.out.println("exam:"+Exam);
            examTime.clear();
            examTitleComboBox.getEditor().clear();
            datePicker.getEditor().clear();
            subjectCode.getEditor().clear();

        File f = null;
        FileWriter fw = null;

        try {

            f = new File("ExamSchedule.txt");

            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
            String str=Exam+"%%"+Scode+"%%"+examDate+"%%"+time+"\n";
            fw.write(str);
            fw.close();


        } catch (IOException ex) {
            System.out.println("Error in ExamSchedule.txt file");
        } finally {
            System.out.println("Exit from ExamSchedule.txt file ");
        }
        Tname.setCellValueFactory(new PropertyValueFactory<>("ExName"));
        Tcode.setCellValueFactory(new PropertyValueFactory<>("ExCode"));
        TexamDate.setCellValueFactory(new PropertyValueFactory<>("ExDate"));
        Ttime.setCellValueFactory(new PropertyValueFactory<>("Extime"));

        tableview.setItems(getListData());

    }
    public ObservableList<ExamSchedule> getListData(){
        ObservableList<ExamSchedule> obList = FXCollections.observableArrayList();
        File f = null;
        Scanner sc;
        String s1,s2,s3,s4;
        String str;
        String[] tokens;
        try {
            f = new File("ExamSchedule.txt");
            sc = new Scanner(f);
            if (f.exists()) {

                while (sc.hasNextLine()) {
                    str = sc.nextLine();
                    tokens = str.split("%%");
                    s1=tokens[0];
                    s2=tokens[1];
                    s3=tokens[2];
                    s4=tokens[3];

                    obList.add(new ExamSchedule(s1, s2, s3, s4));
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
    private void saveOnClick(MouseEvent event) {
    }

    @FXML
    private void homeOnClick(MouseEvent event) {
    }

    @FXML
    private void LogOutOnClick(MouseEvent event) {
    }
    
}
