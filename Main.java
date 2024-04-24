package com.example.hangmandemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        File fxmlFile = new File("C:\\Users\\berot\\IdeaProjects\\HangmanDemo\\src\\main\\sample.fxml");
        Parent root = FXMLLoader.load(fxmlFile.toURI().toURL());
        primaryStage.setTitle("Hangman");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);   
    }
}
