package com.example.asn2;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
//        LoginUI root = new LoginUI();
        MainUI root = new MainUI();
//        AccountUI root = new AccountUI();
        Scene scene = new Scene(root, 750, 700);
        stage.setTitle("Assignment 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}