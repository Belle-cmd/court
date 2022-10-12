package com.example.asn2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class MainUI extends BorderPane {

    // grid used to store court slots
    private GridPane courtGrid;

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


        // setting up main layouts for the courts and date
        VBox mainContainer = new VBox();
        HBox dateContainer = new HBox();
        DatePicker datePicker = new DatePicker();
        dateContainer.getChildren().add(datePicker);

        courtGrid = new GridPane();
        this.populateCourt(1);
        this.populateCourt(2);
        this.populateCourt(3);
        this.populateCourt(4);
        this.populateCourt(5);
        this.populateCourt(6);



        dateContainer.setAlignment(Pos.TOP_CENTER);
        courtGrid.setAlignment(Pos.BOTTOM_CENTER);
        mainContainer.getChildren().addAll(dateContainer, courtGrid);
        this.setCenter(mainContainer);
    }

    /**
     * Populate the grid based on the specified court number
     * @param courtNum the number of the court to populate with buttons as booking slots
     */
    private void populateCourt(int courtNum) {
        ArrayList<String> timeArray = new ArrayList<>();
        timeArray.add("7:00 am");
        timeArray.add("8:00 am");
        timeArray.add("9:00 am");
        timeArray.add("10:00 am");
        timeArray.add("11:00 am");
        timeArray.add("12:00 pm");
        timeArray.add("1:00 pm");
        timeArray.add("2:00 pm");
        timeArray.add("3:00 pm");
        timeArray.add("4:00 pm");
        timeArray.add("5:00 pm");
        timeArray.add("6:00 pm");
        timeArray.add("7:00 pm");

        for (String time : timeArray) {
            Button btn = new Button(time);

            // court -1 bc the parameter for court starts at 1 while the array starts at 0
            // indexOf(time)+1 bc the y coordinate of x,y in grid is the placeholder for the court number
            courtGrid.add(btn, courtNum-1, timeArray.indexOf(time)+1);  // populates each court
        }
    }
}
