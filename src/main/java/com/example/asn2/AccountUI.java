package com.example.asn2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.util.Objects;

public class AccountUI extends BorderPane {
    public AccountUI() {
        Button backBtn = new Button();
        ImageView leftArrowImg = new ImageView(
                Objects.requireNonNull(getClass().getResource("/leftArrow.png")).toExternalForm());
        leftArrowImg.setFitHeight(50);  // set the size of the image
        leftArrowImg.setFitWidth(60);
        backBtn.setGraphic(leftArrowImg);
        this.setTop(backBtn);
    }
}
