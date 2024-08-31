/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectap.ViewControl;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.File;
import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author noof9
 */
public class video1 implements Initializable {
@FXML
private MediaView video1;
@FXML
private Button play,pause,reset;
@FXML
    ImageView back;


private File file;
private Media media;
private MediaPlayer mp;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
     String vurl="file:/C:/Users/noof9/Documents/NetBeansProjects/FXProject/projectAP/src/projectap/video/videoplayback.mp4";
      media= new Media(vurl);
      mp= new MediaPlayer(media);
      video1.setMediaPlayer(mp);
    }
   
public void playMedia(){mp.play();}  
public void pauseMedia(){mp.pause();}     
public void resetMedia(){mp.seek(Duration.seconds(0.0));} 
public void goBack(Event e) throws IOException{
                

 // FirstAid2.setStyle("-fx-background-color:#ffffff;");
Node node= (Node) e.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    //
    Parent root = FXMLLoader.load(getClass().getResource("/projectap/View/FirstAid.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
}
