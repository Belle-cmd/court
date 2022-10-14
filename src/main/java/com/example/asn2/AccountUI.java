package com.example.asn2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


public class AccountUI extends StackPane implements ModelListener, IModelListener {
    public Stage mainStage;

    public AccountUI() {
        // User's booked slots (main content of this page)
        VBox container = new VBox(20);
        Label titleLbl = new Label("Saved Bookings");
        titleLbl.setFont(new Font("Helvetica", 20));

        ArrayList<Slot> slotArray = new ArrayList<>();
        ObservableList<Slot> SlotObservableList = FXCollections.observableArrayList(slotArray);
        ListView<Slot> slotListView = new ListView<>(SlotObservableList);  // stores the slots the user selected

        container.getChildren().addAll(titleLbl, slotListView);
        this.getChildren().addAll(container);
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
