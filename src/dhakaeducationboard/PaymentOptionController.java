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
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author anikb
 */
public class PaymentOptionController implements Initializable {

    @FXML
    private ComboBox<String> paymentComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        paymentComboBox.getItems().addAll("Bkash", "Rocket", "Nagad", "Credit/Debit Card");
        paymentComboBox.setValue("Bkash");
    }

    @FXML
    private void confirmPayment(MouseEvent event) throws IOException {
        Parent viewRegCardParent = FXMLLoader.load(getClass().getResource("viewRegCard.fxml"));
        Scene viewRegCardScene = new Scene(viewRegCardParent);
        Stage viewRegCardStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        viewRegCardStage.setScene(viewRegCardScene);
        viewRegCardStage.setTitle("Dhaka Education Board");
        viewRegCardStage.show();
    }

}
