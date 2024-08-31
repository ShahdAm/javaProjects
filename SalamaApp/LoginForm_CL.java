/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap.ViewControl;

//import static javafx.application.ConditionalFeature.FXML;
import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author noof9
 */
public class LoginForm_CL {
@FXML
TextField txtUser;
@FXML
PasswordField txtPass;
@FXML
Label lblMSG;
@FXML
Button btSign;
@FXML
Button btSignup;

public void isSignIn(Event e) throws IOException{

   
    Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/Home1.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   

}
public void isSignUp(Event e) throws IOException{

   
    Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root1 = FXMLLoader.load(getClass().getResource("/projectap/View/signup.fxml"));
    Scene scene = new Scene(root1);
    stage.setScene(scene);
    stage.show();
   

}
}
