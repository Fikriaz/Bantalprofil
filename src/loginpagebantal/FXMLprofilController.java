/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLprofilController implements Initializable {
    
    @FXML
    private Button bTambahs;
    
    @FXML
    private void scene2(ActionEvent event) throws IOException {
        
        Parent scene2 = FXMLLoader.load(getClass().getResource("FXMLmemantauPerkembangan.fxml"));
        Scene scene = new Scene(scene2);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Memantau Perkembangan");
        stage.show();
    }
   
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
