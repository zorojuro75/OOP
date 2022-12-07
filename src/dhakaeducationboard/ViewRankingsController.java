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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class ViewRankingsController implements Initializable {

    @FXML
    private TableView<Institution> rankTableView;
    @FXML
    private TableColumn<Institution, String> eiin;
    @FXML
    private TableColumn<Institution, String> institutionName;
    @FXML
    private TableColumn<Institution, String> rank;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eiin.setCellValueFactory(new PropertyValueFactory<Institution, String>("EIIN"));
        institutionName.setCellValueFactory(new PropertyValueFactory<Institution, String>("userName"));
        rank.setCellValueFactory(new PropertyValueFactory<Institution, String>("rank"));
        rankTableView.setItems(getInstitutions());
    }    

    @FXML
    private void dashboard(MouseEvent event) {
    }

    @FXML
    private void logOut(MouseEvent event) {
    }

    public ObservableList<Institution> getInstitutions() {
        ObservableList<Institution> institute = FXCollections.observableArrayList();
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
                    institute.add(p);
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
        System.out.println(institute);
        return institute;
    }
    
}
