/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap.ViewControl;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author noof9
 */
public class InHouseControl {
    @FXML
    ImageView back7;
    
     @FXML
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    
    @FXML
    Button bt;
    
    public void doneMsg(ActionEvent e ){
    bt.setOnAction(event -> {
            if(c1.isSelected() && c2.isSelected()&& c3.isSelected()&& c4.isSelected()&& c5.isSelected() && c6.isSelected()&& c7.isSelected()&& c8.isSelected()){
                String s = new String("Good job, now your house is safe");
                JOptionPane.showMessageDialog(null,s);}
                else if (c1.isSelected() || c2.isSelected()|| c3.isSelected()|| c4.isSelected()|| c5.isSelected() || c6.isSelected()|| c7.isSelected()|| c8.isSelected()){
                       String s1 = new String("Good, but be sure to complete the safety precautions");
                       JOptionPane.showMessageDialog(null,s1); }
          
        }   
        );
    };

    public void goBack(Event e) throws IOException{

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/SafetyAndSecurityTips.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    
    }}

