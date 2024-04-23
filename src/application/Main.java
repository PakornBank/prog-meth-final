package application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {
    public void start(Stage primaryStage) {
        // Create a simple UI control
        Label label = new Label("Hello, JavaFX!");

        // Create a Scene with the UI control, specify width and height
        Scene scene = new Scene(label, 300, 100);

        // Set the scene to the primary stage
        primaryStage.setScene(scene);

        // Set the title of the window
        primaryStage.setTitle("JavaFX Test Application");

        // Display the primary stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
