package com.example.asn2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import java.util.ArrayList;


public class AccountUI extends StackPane implements ModelListener, IModelListener {
    private ListView<Slot> slotListView;

    private Model model;

    private InteractionModel interactionModel;

    public AccountUI() {
        // User's booked slots (main content of this page)
        VBox container = new VBox(20);
        Label titleLbl = new Label("Saved Bookings");
        titleLbl.setFont(new Font("Helvetica", 20));

        ArrayList<Slot> slotArray = new ArrayList<>();
        ObservableList<Slot> SlotObservableList = FXCollections.observableArrayList(slotArray);
        slotListView = new ListView<>(SlotObservableList);  // stores the slots the user selected

        container.getChildren().addAll(titleLbl, slotListView);
        this.getChildren().addAll(container);
    }


    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void modelChanged() {
        slotListView.getItems().clear();
        slotListView.getItems().addAll(model.slotArrayList);  // populate the list view
    }

    @Override
    public void iModelChanged() {

    }

    public void setInteractionModel(InteractionModel iModel) {
        this.interactionModel = iModel;
    }

    public void setController(Controller controller) {

    }
}
