package com.example.asn2;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
    Model model;
    public Controller() {}

    public void handleSubmitInfo() {
        System.out.println("Pressed!");
    }

    public void setModel(Model model) {this.model = model;}
}
