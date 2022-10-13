package com.example.asn2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;


import java.util.Objects;
public class AccountUI extends BorderPane {
    // Use to reference adding layouts dynamically
    private VBox mainContent;
    public AccountUI() {
        Button backBtn = new Button();
        ImageView leftArrowImg = new ImageView(
                Objects.requireNonNull(getClass().getResource("/leftArrow.png")).toExternalForm());
        leftArrowImg.setFitHeight(40);  // set the size of the image
        leftArrowImg.setFitWidth(50);
        backBtn.setGraphic(leftArrowImg);  // set arrow png as the button's image
        this.setTop(backBtn);

        // User's booked slots (main content of this page)
        mainContent = new VBox(10);
        mainContent.setAlignment(Pos.CENTER);
        this.setCenter(mainContent);
    }

    public void addSlot(String time, int courtNum, String week) {
        VBox container = new VBox();
        Label courtLbl = new Label("Court " + courtNum);
        courtLbl.setFont(new Font("Helvetica", 30));
        Label timeLbl = new Label(week + " at " + time);
        timeLbl.setFont(new Font("Helvetica", 15));
        container.getChildren().addAll(courtLbl, timeLbl);
        container.setStyle("-fx-background-color: rgba(111, 175, 252,0.5)");
        mainContent.getChildren().add(container);
    }
}
