package com.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label; // ✅ Import the Label class

import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage window) {
        Label textComponent = new Label("Text element");

        Button button1 = new Button("First Button");
        Button button2 = new Button("Second Button");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().addAll(button1, button2);

        Scene scene = new Scene(componentGroup, 300, 100);

        window.setTitle("Koos pealkirjaga");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}
