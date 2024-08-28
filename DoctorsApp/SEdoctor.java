/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sedoctor;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SEdoctor extends Application {
    // Constants for doctor experience
    final int CARDIOLOGIST_EXPERIENCE = 10;
    final int PEDIATRICIAN_EXPERIENCE = 8;
    final int DERMATOLOGIST_EXPERIENCE = 12;
    final int GYNECOLOGIST_EXPERIENCE = 9;
    final int ORTHOPEDIC_SURGEON_EXPERIENCE = 15;

    // Array of doctors' names
    String[] doctors = {
        "Dr. Sara Ahmed", "Dr. Mohammed Ahmed", "Dr. Omer Ali", "Dr. Amail Ali", "Dr. Khaled Ali", "none"
    };

    @Override
    public void start(Stage primaryStage) {
        // Create a ComboBox for doctor selection
        ComboBox<String> doctorComboBox = new ComboBox<>();
        doctorComboBox.getItems().addAll(doctors);
        doctorComboBox.setPromptText("Select a doctor");

        // Create a TextArea for displaying the doctor's profile
        TextArea profileTextArea = new TextArea();
        profileTextArea.setPromptText("Doctor's profile");

        // Create a TextField for adding comments
        TextField commentTextField = new TextField();
        commentTextField.setPromptText("Add a comment");

        // Create a Button for adding comments
        Button addCommentButton = new Button("Add Comment");

        // Disable the "Add Comment" button initially
        addCommentButton.setDisable(false);

        // Event handler for doctor selection from ComboBox
        doctorComboBox.setOnAction(e -> {
            String selectedDoctor = doctorComboBox.getValue();
            String doctorProfile;
            String grettingMessage = docrotgreet(selectedDoctor);     
        switch (selectedDoctor) {
            case "Dr. Sara Ahmed":
    doctorProfile = "Doctor Name: Dr. Sara Ahmed\nSpecialization: Cardiologist\nExperience: "+ CARDIOLOGIST_EXPERIENCE + " years";
                break;
            case "Dr. Mohammed Ahmed":
   doctorProfile = "Doctor Name: Dr. Mohammed Ahmed\nSpecialization: Pediatrician\nExperience: " + PEDIATRICIAN_EXPERIENCE + " years";
                break;
            case "Dr. Omer Ali":
   doctorProfile = "Doctor Name: Dr. Omer Ali\nSpecialization: Dermatologist\nExperience: " + DERMATOLOGIST_EXPERIENCE + " years";
                break;
            case "Dr. Amail Ali":
    doctorProfile = "Doctor Name: Dr. Amail Ali\nSpecialization: Gynecologist\nExperience: " + GYNECOLOGIST_EXPERIENCE + " years";
                break;
            case "Dr. Khaled Ali":
 doctorProfile = "Doctor Name: Dr. Khaled Ali\nSpecialization: Orthopedic Surgeon\nExperience: " + ORTHOPEDIC_SURGEON_EXPERIENCE 
         + " years";
                break;
            case "none":
     doctorProfile = "\"Error\", \"Please select a valid doctor.\""; // No profile for "none"
                break;
            default:
                doctorProfile = ""; // otherwise
                break;
        }
           profileTextArea.setText(grettingMessage +"\n \n"+doctorProfile);
        });

        // Event handler for adding comments
    addCommentButton.setOnAction(e -> {
        String comment = commentTextField.getText();
        if (!comment.isEmpty()) {
            String currentProfile = profileTextArea.getText();
            String updatedProfile = currentProfile + "\nComment: " + comment + "\n";
            profileTextArea.setText(updatedProfile);
            commentTextField.clear();
        }
    });


        // Create the layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(doctorComboBox, profileTextArea, commentTextField, addCommentButton);

        // Create the scene
        Scene scene = new Scene(layout, 400, 400);

        // Set the scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Health Care App");
        primaryStage.show();
    }


// Duplicate a method to generate a greeting message
private String docrotgreet(String selectedDoctor) {
    String greetingMessage;
       if (!selectedDoctor.isEmpty() && !selectedDoctor.equals("none")){
           greetingMessage ="Hello" +selectedDoctor + "Welcoms you.";
       }
       else
       {
           greetingMessage = "";
       }
    return greetingMessage;
}


    public static void main(String[] args) {
        launch(args);
    }

}










