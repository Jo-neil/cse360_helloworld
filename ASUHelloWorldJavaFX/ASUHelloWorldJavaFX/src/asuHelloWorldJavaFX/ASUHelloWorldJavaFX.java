package asuHelloWorldJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ASUHelloWorldJavaFX extends Application {
    private static final String MESSAGE = "Joseph Says: Hello, World";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        // Print initial messages to the console
        System.out.println("ASU Hello World!");
        System.out.println("It started!");

        // Set the title of the window
        primaryStage.setTitle("In-class activity.");

        // Create a button with the required text
        Button btn = new Button();
        btn.setText("Display: 'Joseph's commit'");

        // Set the button's action to show an alert and print the message 3 times
        btn.setOnAction(new EventHandler<>() {
            public void handle(ActionEvent event) {
                // Show the message in a pop-up dialog
                showMessage();

                // Print the message 3 times in the console
                printMessage();
            }
        });

        // Create the layout and add the button
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Set the scene and show the stage (window)
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    // Method to display the message in an alert dialog
    private void showMessage() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setHeaderText(null);
        alert.setContentText(MESSAGE);
        alert.showAndWait();
    }

    // Method to print the message 3 times to the console
    private void printMessage() {
        for (int i = 0; i < 3; i++) {
            System.out.println(MESSAGE);
        }
    }
}
