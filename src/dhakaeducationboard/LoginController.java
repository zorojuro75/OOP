/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.awt.Color;
import java.io.File;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

    public void init(String id) {
        Alert a = new Alert(AlertType.INFORMATION);
        a.setContentText("Your User id is :" + id);
        a.showAndWait();
    }

    @FXML
    private void loginOnClick(MouseEvent event) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Student.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (p.verificataion(userIdTextField.getText(), passwordTextField.getText()) == true) {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("studentHome.fxml"));
                        Parent registrationFormParent = loader.load();
                        Scene registrationFormScene = new Scene(registrationFormParent);

                        StudentHomeController controller = loader.getController();
                        controller.init(p.getUserName(), p.getUserid());

                        Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        registrationFormStage.setScene(registrationFormScene);
                        registrationFormStage.setTitle("Dhaka Education Board");
                        registrationFormStage.show();
                    }
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
    private void signUpHome(MouseEvent event) throws IOException {
        Parent signUpHomeParent = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        Scene signUpHomeScene = new Scene(signUpHomeParent);
        Stage signUpHomeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpHomeStage.setScene(signUpHomeScene);
        signUpHomeStage.setTitle("Dhaka Education Board");
        signUpHomeStage.show();
    }
}
