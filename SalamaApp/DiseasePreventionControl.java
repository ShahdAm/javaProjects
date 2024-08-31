/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap.ViewControl;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author noof9
 */
public class DiseasePreventionControl {
 @FXML
    ImageView back3;
 
 @FXML
     ComboBox <String> cbo;

    @FXML
     TextArea txt1;
        ObservableList<String> dis = FXCollections.observableArrayList("Infection Viruses, Bacteria","Diabetic","Asthma","Cancer","Pregnancy and childbirth depression");
 
     
        //String[] dis = {"Infection Viruses, Bacteria","Diabetic","Asthma","Cancer"};

    public void display(ActionEvent event) {
      cbo.getItems().addAll(dis);
        if (cbo.equals("Infection Viruses, Bacteria")) {
                txt1.setText("The best way to prevent infection is to wash your hands often with soap and water. An alcohol-based hand sanitizer can also be used. Healthcare providers and caregivers should follow good hand hygiene procedures when providing care.");
            } else if (cbo.equals("Diabetic")) {
                txt1.setText("maintaining a healthy weight,\n" +
"Practicing physical activity at a rate of at least 30 minutes of moderate and regular physical activity during the days of the week,\n" +
"Follow a healthy diet while limiting sugary substances and saturated fats.\n" +
"Avoid tobacco use, as smoking increases the risk of cardiovascular disease.");
            } else if (cbo.equals("Asthma")){
                txt1.setText("Get vaccinated against influenza and pneumonia. Getting vaccinations up to date can prevent influenza and pneumonia from triggering asthma flare-ups. Identify and avoid asthma triggers. Recognize and treat attacks early. If you act quickly, you'll be less likely to have a severe attack.");
            } else if (cbo.equals("Cancer")) {
                txt1.setText("Quit Smoking,\n" +
"Avoid obesity and maintain a normal weight.\n" +
"Avoid prolonged exposure to harmful sunlight.\n" +
"Eating fruits, vegetables, and healthy foods rich in fiber.\n" +
"exercise regularly,\n" +
"Consult a doctor when any abnormal changes occur in the body.");
            }else if (cbo.equals("Pregnancy and childbirth depression")) {
                txt1.setText("Care of the mother medically and psychologically from the time of fertilization, during pregnancy, at birth and after, especially the mother who previously gave birth to children with underdeveloped children or children with brain damage or disabilities.\n" +
" Protecting children from diseases, developing their immunity, immunizing them against known diseases, and providing them with appropriate nutrition during childhood.\n" +
" Formation of body care and hygiene habits.\n" +
" Eliminate hazardous factors in the environment and take into account the safety needs and avoid accidents.");
            }};

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
}
