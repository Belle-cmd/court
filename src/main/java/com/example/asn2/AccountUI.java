package com.example.asn2;

import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;


import java.time.LocalDate;
import java.util.Objects;
public class AccountUI extends BorderPane implements ModelListener, IModelListener {
    public Stage mainStage;

    // Use to reference adding layouts dynamically
    private VBox mainContent;
    private final double MAX_FONT_SIZE = 30;
    public AccountUI() {
        Button backBtn = new Button();
        ImageView leftArrowImg = new ImageView(
                Objects.requireNonNull(getClass().getResource("/leftArrow.png")).toExternalForm());
        leftArrowImg.setFitHeight(40);  // set the size of the image
        leftArrowImg.setFitWidth(50);
        backBtn.setGraphic(leftArrowImg);  // set arrow png as the button's image
        this.setTop(backBtn);

        backBtn.setOnAction(e -> {
            CourtUI court = new CourtUI();
            court.mainStage = mainStage;
            Scene courtScene = new Scene(court,  750, 700);
            mainStage.setScene(courtScene);
        });

        // User's booked slots (main content of this page)
        mainContent = new VBox(10);
        mainContent.setAlignment(Pos.CENTER);
        this.setCenter(mainContent);
        this.setStyle("-fx-background-color: white");

        addSlot("7:00 am", 2, "Monday");
        addSlot("8:00 am", 1, "Tuesday");
        addSlot("10:00 am", 6, "Wednesday");
        addSlot("1:00 pm", 4, "Thursday");
        addSlot("5:00 pm", 4, "Friday");



    }

    public void addSlot(String time, int courtNum, String week) {
        VBox container = new VBox();
        container.setPadding(new Insets(10));

        Label courtLbl = new Label("Court " + courtNum);
        courtLbl.setFont(new Font("Helvetica", 30));

        Label timeLbl = new Label(week + " at " + time);
        timeLbl.setFont(new Font("Helvetica", 15));

        LocalDate date = LocalDate.now();
        Label dateLbl = new Label(date.toString());
        dateLbl.setFont(new Font("Helvetica", 15));

        container.getChildren().addAll(courtLbl, dateLbl,timeLbl);
        container.setStyle("-fx-background-color: rgb(237, 237, 237)");
        container.setMaxWidth(300.0);
        mainContent.getChildren().add(container);
    }

    public void setModel(Model model) {
    }

    @Override
    public void modelChanged() {

    }

    @Override
    public void iModelChanged() {
        
    }

    public void setInteractionModel(InteractionModel iModel) {
    }

    public void setController(Controller controller) {
    }
}
