package com.example.asn2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MainUI extends BorderPane {
    public MainUI() {
        // widget for the top of the application where user information is
        HBox navContainer = new HBox();
        navContainer.setSpacing(20);
        navContainer.setPadding(new Insets(20));

        Label nameLbl = new Label("Ari");
        nameLbl.setFont(new Font("Helvetica", 15));
        Button userBtn = new Button("User");
        userBtn.setFont(new Font("Helvetica", 15));
        navContainer.getChildren().addAll(nameLbl, userBtn);
        navContainer.setAlignment(Pos.TOP_RIGHT);
        this.setTop(navContainer);

    }
}
