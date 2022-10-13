package com.example.asn2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class AccountUI extends BorderPane {
    public AccountUI() {
        Button backBtn = new Button();
        this.setTop(backBtn);
    }
}
