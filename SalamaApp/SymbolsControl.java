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
import javafx.stage.Stage;

/**
 *
 * @author noof9
 */
public class SymbolsControl {
@FXML
ImageView back1,home1;

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
}
