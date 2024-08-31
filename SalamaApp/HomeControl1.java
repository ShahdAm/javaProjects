/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap.ViewControl;

import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author noof9
 */
public class HomeControl1 {
@FXML
Pane firstAid,emergCalls,safetyTips,meanings,prevention;

public void openFirstAid(Event e) throws IOException{

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/FirstAid.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
//
public void openCalls(Event e) throws IOException{

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/EmergencyNumber.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
//
public void openTips(Event e) throws IOException{

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/SafetyAndSecurityTips.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
//
public void openMeanings(Event e) throws IOException{

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/Symbols.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
//
public void openPrevention(Event e) throws IOException{

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/DiseasePrevention.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

}
