package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        // Create Foods
        Planets[] planets = new Planets[7];

        // List of Fruits
        planets[0] = new Planets("Mercury", 77, 6, 1, 6);
        planets[1] = new Planets("Venus", 77, 6, 1, 6);
        planets[2] = new Planets("Earth", 77, 6, 1, 6);
        planets[3] = new Planets("Mars", 77, 6, 1, 6);
        planets[4] = new Planets("Jupiter", 77, 6, 1, 6);
        planets[5] = new Planets("Saturn", 77, 6, 1, 6);
        planets[6] = new Planets("Uranus", 77, 6, 1, 6);
        planets[7] = new Planets("Neptune", 77, 6, 1, 6);
    }
}
