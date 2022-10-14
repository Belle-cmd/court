package com.example.asn2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


public class AccountUI extends BorderPane implements ModelListener, IModelListener {
    public Stage mainStage;

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
        this.setCenter(slotListView);
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
