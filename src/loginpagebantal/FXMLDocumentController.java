/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package loginpagebantal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author HakWork
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button daftar;

    @FXML
    private Button login;

    @FXML
    ObservableList datalogin = observableArrayList();

    @FXML
    private TextField nama;

    @FXML
    private TextField password;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        String first = nama.getText();
        String second = password.getText();
        datalogin.add(new Login(first, second));
        nama.setText(" ");
        password.setText(" ");
        nama.getText();
        password.getText();
    }

    @FXML
    private void scene2(ActionEvent event) throws IOException {
        
        Parent scene2 = FXMLLoader.load(getClass().getResource("FXMLmemantauPerkembangan.fxml"));
        Scene scene = new Scene(scene2);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Memantau Perkembangan");
        stage.show();
    }

    @FXML
    private void scene3(ActionEvent event) throws IOException {
        Parent scene2 = FXMLLoader.load(getClass().getResource("FXMLpendaftaran.fxml"));
        Scene scene = new Scene(scene2);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Daftar");
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
