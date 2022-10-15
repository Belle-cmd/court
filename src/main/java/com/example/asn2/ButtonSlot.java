package com.example.asn2;

import javafx.scene.control.Button;

public class ButtonSlot extends Button {

    private String selectedBG;

    private String unselectedBG;

    private String otherStudentSelected;

    // indicates if the button has been selected (booked), if so, it's colour should be green (selectedBG)
    public boolean userSelected;

    public boolean studentSelected;

    /**
     * Constructor method that automatically sets the background colour to
     */
    public ButtonSlot(String time, boolean status, boolean studentSelected) {
        super(time);
        this.setPrefSize(20, 10);
        this.setMaxWidth(Double.MAX_VALUE);
        this.userSelected = status;
        this.studentSelected = studentSelected;
        selectedBG = "-fx-background-color: rgb(104, 212, 158);";
        unselectedBG = "-fx-background-color: rgb(212, 212, 212);";
        otherStudentSelected = "-fx-background-color: rgb(255, 120, 131);";
        this.setStyle(unselectedBG);
    }

    public void select() {
        this.setStyle(selectedBG);
    }

    public void unselect() {
        this.setStyle(unselectedBG);
    }

    /**
     * Creates selection made by other students. User can't book these slots
     */
    public void selectOtherStudent() {
        this.setStyle(otherStudentSelected);
    }
}
