/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLmemantauPerkembanganChartController implements Initializable {
    ObservableList<PieChart.Data> datapc = FXCollections.observableArrayList();
    XYChart.Series databc = new XYChart.Series<>();
    XYChart.Series datalc = new XYChart.Series<>();
    
    @FXML
    private LineChart lcDurasi;
    
    @FXML
    private BarChart bcGejalaKunjung;
    
    
    @FXML
    private PieChart pcMood;
    
    @FXML
    private Button b1;
    
    @FXML
    private Button b2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //piechart mood
        datapc.add(new PieChart.Data("Depresi", 33));
        datapc.add(new PieChart.Data("Tinggi", 27));
        datapc.add(new PieChart.Data("Cemas", 40));
        
        pcMood.setData(datapc);
        
        //linechar durasi tidur
        datalc.setName("Durasi tidur");
        datalc.getData().add(new XYChart.Data("1" , 8));
        datalc.getData().add(new XYChart.Data("2" , 7));
        datalc.getData().add(new XYChart.Data("3" , 4));
        datalc.getData().add(new XYChart.Data("4" , 6));
        datalc.getData().add(new XYChart.Data("5" , 8));
        datalc.getData().add(new XYChart.Data("6" , 9));
        datalc.getData().add(new XYChart.Data("7" , 12));
        
        lcDurasi.getData().addAll(datalc);
        
        //Bar chart gejala psikotik dan kunjungan tenaga ahli
        databc.getData().add(new XYChart.Data("1" , 8));
        databc.getData().add(new XYChart.Data("2" , 7));
        
        bcGejalaKunjung.getData().addAll(databc);
        
    }
    
}

