package com.example.asn2;

import javafx.scene.control.Button;

public class ButtonSlot extends Button {

    private String selectedBG;

    private String unselectedBG;

    // indicates if the button has been selected (booked), if so, it's colour should be green (selectedBG)
    public boolean selected;

    /**
     * Constructor method that automatically sets the background colour to
     */
    public ButtonSlot(String time, boolean status) {
        super(time);
        this.setPrefSize(20, 10);
        this.setMaxWidth(Double.MAX_VALUE);
        this.selected = status;
        selectedBG = "-fx-background-color: rgb(104, 212, 158);";
        unselectedBG = "-fx-background-color: rgb(212, 212, 212);";
        this.setStyle(unselectedBG);
    }

    public void select() {
        this.setStyle(selectedBG);
    }

    public void unselect() {
        this.setStyle(unselectedBG);
    }
}
