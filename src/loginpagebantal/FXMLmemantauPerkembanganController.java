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
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLmemantauPerkembanganController implements Initializable {

    @FXML
    private Button btambah;

    @FXML
    private CheckBox Mooddeptdkada;
    @FXML
    private CheckBox Mooddepringan;
    @FXML
    private CheckBox Mooddepsedang;
    @FXML
    private CheckBox Mooddepparah;

    @FXML
    private CheckBox Moodtinggitdkada;
    @FXML
    private CheckBox Moodtinggiringan;
    @FXML
    private CheckBox Moodtinggisedang;
    @FXML
    private CheckBox Moodtinggiparah;
    
    @FXML
    private CheckBox rasacemastdkada;
    @FXML
    private CheckBox rasacemasringan;
    @FXML
    private CheckBox rasacemassedang;
    @FXML
    private CheckBox rasacemasparah;
    
    @FXML
    private CheckBox gejalapsiktharini;
    @FXML
    private CheckBox ldknemosi;
    @FXML
    private CheckBox meettenagaahli;
    @FXML
    private CheckBox sulitfokus;
    
    
    @FXML
    private void scene2(ActionEvent event) throws IOException {

        Parent scene2 = FXMLLoader.load(getClass().getResource("FXMLmemantauPerkembanganChart.fxml"));
        Scene scene = new Scene(scene2);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Memantau Perkembangan chart");
        stage.show();
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
