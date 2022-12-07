/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class ViewRankingsController implements Initializable {

    @FXML
    private TableColumn<Institution, String> institutionName;
    @FXML
    private TableColumn<Institution, String> rank;
    @FXML
    private TableView<Institution> tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        institutionName.setCellValueFactory(new PropertyValueFactory<Institution,String>("Name"));
        rank.setCellValueFactory(new PropertyValueFactory<Institution,String>("Rank"));
        try {
            tableView.setItems(getInstitution());
        } catch (IOException ex) { }
    }    

    @FXML
    private void logOut(MouseEvent event) throws IOException {
        Parent loginParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(loginParent);
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(loginScene);
        loginStage.setTitle("Dhaka Education Board");
        loginStage.show();
    }

    @FXML
    private void dashboard(MouseEvent event) throws IOException {
        Parent viewRankingsParent = FXMLLoader.load(getClass().getResource("scholarshipOfficeHome.fxml"));
        Scene viewRankingsScene = new Scene(viewRankingsParent);
        Stage viewRankingsStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        viewRankingsStage.setScene(viewRankingsScene);
        viewRankingsStage.setTitle("Dhaka Education Board");
        viewRankingsStage.show();
    }
    
    public ObservableList<Institution> getInstitution() throws FileNotFoundException, IOException{
        ObservableList<Institution> institution = FXCollections.observableArrayList();
        Institution i;
        File f = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("InstitutionRank.txt");
            sc = new Scanner(f);
            if(f.exists()){
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    System.out.println(tokens[0]);
                    System.out.println(tokens[1]);
                    i = new Institution(tokens[0], tokens[1]);
                    institution.add(i);
                }
            }
        }
        catch (IOException ex) { }
        return institution;
    } 
}