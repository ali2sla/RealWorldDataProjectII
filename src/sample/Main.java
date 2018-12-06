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
        planets[0] = new Planets("Mercury", 0.330, 4879, 5427, 3.7);
        planets[1] = new Planets("Venus", 4.87, 12104, 5243, 8.9);
        planets[2] = new Planets("Earth", 5.97, 12756, 5514, 9.8);
        planets[3] = new Planets("Mars", 0.642, 6792, 3933, 3.7);
        planets[4] = new Planets("Jupiter", 1898, 142984, 1326, 23.1);
        planets[5] = new Planets("Saturn", 568, 120536, 687, 9.0);
        planets[6] = new Planets("Uranus", 86.8, 51118, 1271, 8.7);
        planets[7] = new Planets("Neptune", 102, 49528, 1638, 11.0);
    }
}
