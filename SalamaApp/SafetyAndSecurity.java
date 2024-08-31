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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author noof9
 */
public class SafetyAndSecurity {
 
     @FXML
    ImageView back2;
    @FXML
Button InHouse;
    @FXML
Button InCar;
    @FXML
Button InFactories;
    @FXML
Button InShcool;
   
    
    
    public void goHome(Event e) throws IOException{

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/Home1.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    //SafetyAndSecurity
    public void goBack(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/Home1.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   
}
  public void InHouse(Event e) throws IOException{

   
    Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/InHouse.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   

}public void InCar(Event e) throws IOException{

   
    Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/InCar.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   

}public void InFactories(Event e) throws IOException{

   
    Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/InFactories.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   

}public void InShcool(Event e) throws IOException{

   
    Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/InShcool.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   

}  
    
}
