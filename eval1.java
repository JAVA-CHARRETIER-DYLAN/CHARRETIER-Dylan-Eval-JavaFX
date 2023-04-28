package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class eval1 extends Application {

    private static Scene scene;
    private static Scene scene2;
    private static Scene scene3;
    private static Scene scene4;
    Stage window;
    Button button;

   
    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        
        window = primaryStage;
        window.setTitle("form");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(0);
        grid.setHgap(10);
        
        Button loginButton = new Button("Consulter les données");
        GridPane.setConstraints(loginButton, 1, 0);
        loginButton.setOnAction((e -> window.setScene(scene2)));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(loginButton);
        scene2 = new Scene(layout1, 200, 200);

        StackPane layout2 = new StackPane();
        scene2 = new Scene(layout2, 600, 300 );


        Button loginButton1 = new Button("télécharger le fichier");
        GridPane.setConstraints(loginButton1, 1, 1);

        Button loginButton2 = new Button("Proposer une station");
        GridPane.setConstraints(loginButton2, 1, 2);
        loginButton2.setOnAction((e -> window.setScene(scene3)));

        VBox layout3 = new VBox(20);
        layout3.getChildren().addAll(loginButton2);
        scene3 = new Scene(layout3, 200, 200);

        StackPane layout4 = new StackPane();
        scene3 = new Scene(layout4, 600, 300 );

        Button loginButton3 = new Button("Supprimer une proposition");
        GridPane.setConstraints(loginButton3, 1, 3);
        loginButton3.setOnAction((e -> window.setScene(scene4)));

        VBox layout5 = new VBox(20);
        layout5.getChildren().addAll(loginButton3);
        scene = new Scene(layout5, 200, 200);

        StackPane layout6 = new StackPane();
        scene4 = new Scene(layout6, 600, 300 );


        grid.getChildren().addAll(loginButton,loginButton1,loginButton2,loginButton3);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
}
