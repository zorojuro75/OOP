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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class InstitutionPublicExamOption1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    private String user;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void init(String institutionName){
        user = institutionName;
    }
    @FXML
    private void sscOption(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("checkRegistrationApplications.fxml"));
        Parent checkRegistrationApplicationsParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene checkRegistrationApplicationsScene = new Scene(checkRegistrationApplicationsParent);

        //access the controller
        CheckRegistrationApplicationsController controller = loader.getController();

        //controller = new PersonViewSceneController();
        controller.init("SSC", user);

        Stage checkRegistrationApplicationsStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        checkRegistrationApplicationsStage.setScene(checkRegistrationApplicationsScene);
        checkRegistrationApplicationsStage.setTitle("Dhaka Education Board");
        checkRegistrationApplicationsStage.show();
    }

    @FXML
    private void hscOption(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("checkRegistrationApplications.fxml"));
        Parent checkRegistrationApplicationsParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene checkRegistrationApplicationsScene = new Scene(checkRegistrationApplicationsParent);

        //access the controller
        CheckRegistrationApplicationsController controller = loader.getController();

        //controller = new PersonViewSceneController();
        controller.init("HSC", user);

        Stage checkRegistrationApplicationsStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        checkRegistrationApplicationsStage.setScene(checkRegistrationApplicationsScene);
        checkRegistrationApplicationsStage.setTitle("Dhaka Education Board");
        checkRegistrationApplicationsStage.show();
    }
    
}
