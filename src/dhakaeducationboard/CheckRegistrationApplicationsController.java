/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class CheckRegistrationApplicationsController implements Initializable {
    private String exam;
    @FXML
    private TextArea applicationsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    public void init(String s) {
        exam =s;
        if (exam.equals("HSC")) {
            File file = new File("HSC.txt");
            Scanner sc;
            String str = null;
            try {
                sc = new Scanner(file);
                applicationsTextArea.setText(null);
                while (sc.hasNextLine()) {
                    str = sc.nextLine();
                    applicationsTextArea.appendText(str+"\n");
                }
            } catch (FileNotFoundException ex) {

            }
        }
        else{
            File file = new File("SSC.txt");
            Scanner sc;
            String str = null;
            try {
                sc = new Scanner(file);
                applicationsTextArea.setText(null);
                while (sc.hasNextLine()) {
                    str = sc.nextLine();
                    applicationsTextArea.appendText(str+"\n");
                }
            } catch (FileNotFoundException ex) {

            }
        }
    }

    @FXML
    private void sendApplications(MouseEvent event) {
    }

}
