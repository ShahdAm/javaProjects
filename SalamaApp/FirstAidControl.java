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
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author noof9
 */
public class FirstAidControl {
@FXML
ImageView back1,home1;
@FXML
Pane drVideo,blVideo,stVideo,burns,choking,CPR,broken,fire,seizure;

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
    //
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
    
    public void goVideo1(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/drowning.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    public void goBleeding(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/bleeding.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    public void goStroke(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/stroke.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    public void goBurns(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/burns.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    public void goChoking(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/choking.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
       public void goCPR(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/CPR.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
public void goBroken(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/broken.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
public void goFire(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/fire.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
public void goSeizure(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/seizure.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
}
