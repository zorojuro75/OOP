/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class ViewRegCardController implements Initializable {

    @FXML
    private Label examLabel;
    @FXML
    private Label regNumberLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label rollLabel;
    @FXML
    private Label sessionLabel;
    @FXML
    private Label institutionNameLabel;
    private Student s;
    private String e;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        examLabel.setText(e);
        regNumberLabel.setText(Integer.toString(s.getRegCard().getRegID()));
        nameLabel.setText(s.userName);
        rollLabel.setText(Integer.toString(s.getRegCard().getRollNumber()));
        sessionLabel.setText(s.getRegCard().getSessionName());
        institutionNameLabel.setText(s.getInstitutename());
        
    }
    public void init(Student std, String exam){
        e= exam;
        s =std;
    }
    @FXML
    private void logOut(MouseEvent event) throws IOException {
        s.logout(event);
    }

    @FXML
    private void dashboard(MouseEvent event) {
    }

}
