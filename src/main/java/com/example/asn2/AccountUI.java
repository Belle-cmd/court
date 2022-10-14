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

        LocalDate date = LocalDate.now();

        slotArray.add(new Slot(date, date.getDayOfWeek(), 2, "7:00 am"));
        slotArray.add(new Slot(date.plusDays(2), date.plusDays(2).getDayOfWeek(), 1, "10:00 am"));
        slotArray.add(new Slot(date.plusDays(3), date.plusDays(3).getDayOfWeek(), 6, "11:00 am"));
        slotArray.add(new Slot(date.plusDays(3), date.plusDays(3).getDayOfWeek(), 6, "1:00 pm"));
        slotArray.add(new Slot(date.plusDays(3), date.plusDays(3).getDayOfWeek(), 6, "11:00 am"));
        slotArray.add(new Slot(date.plusDays(3), date.plusDays(3).getDayOfWeek(), 6, "11:00 am"));

        ObservableList<Slot> SlotObservableList = FXCollections.observableArrayList(slotArray);
        ListView<Slot> slotListView = new ListView<>(SlotObservableList);

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
