package com.example.asn2;

import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

public class CourtUI extends BorderPane implements ModelListener, IModelListener {

    // grid used to store court slots
    private GridPane courtGrid;

    InteractionModel iModel;

    ArrayList<ButtonSlot> buttonSlots;

    public CourtUI() {
        // initialize to store button slots for easier access
        this.buttonSlots = new ArrayList<>();

        // setting up main layouts for the courts and date
        VBox mainContainer = new VBox();
        HBox dateContainer = new HBox();
        DatePicker datePicker = new DatePicker();
        dateContainer.getChildren().add(datePicker);

        courtGrid = new GridPane();  // store buttons
        courtGrid.setHgap(25);
        courtGrid.setPadding(new Insets(50,0,50,0));

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
        this.setStyle("-fx-background-color: white");


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

        Label courtName = new Label("Court " + courtNum);
        courtName.setFont(new Font("Helvetica", 25));
        courtGrid.add(courtName, courtNum-1, 0);  // Add court name
        GridPane.setHalignment(courtName, HPos.RIGHT);

        for (String time : timeArray) {
            ButtonSlot btn = new ButtonSlot(time, false);
            buttonSlots.add(btn);  // gives easy access to all the buttons in the grid

            // court -1 bc the parameter for court starts at 1 while the array starts at 0
            // indexOf(time)+1 bc the y coordinate of x,y in grid is the placeholder for the court number
            courtGrid.add(btn, courtNum-1, timeArray.indexOf(time)+1);  // populates each court
        }
    }

    /**
     * fire() is invoked when a user gesture indicates that an event for this ButtonBase should occur.
     * When a button is fired, the button's onAction event is involed
     */
    public void init() {
        buttonSlots.get(0).fire();
    }

    public void setModel(Model model) {}

    public void setInteractionModel(InteractionModel iModel) {this.iModel = iModel;}

    public void setController(Controller controller) {
        buttonSlots.forEach(b -> {
            b.setOnAction(e -> {
                b.selected = !b.selected;  // enable chosen slots to be unselected
                controller.handleSlotClick(true);
            });
        });
    }

    @Override
    public void iModelChanged() {
        buttonSlots.forEach(b -> {
            b.unselect();
            // if the status of the button matches the imodel's change the color of the slot
            if (b.selected == iModel.getSlotStatus()) {
                b.select();
            } else {
                b.unselect();
            }
        });
    }

    @Override
    public void modelChanged() {

    }


}
