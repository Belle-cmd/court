package com.example.asn2;

import java.time.LocalDate;

public class Controller {
    Model model;

    InteractionModel iModel;

    public Controller() {}


    public void setModel(Model model) {this.model = model;}

    public void setInteractionModel(InteractionModel iModel) {this.iModel = iModel;}


    /**
     * Method used in the court grid to select/unselect a button slot indicating that the
     * user has booked/cancelled that particular slot
     * @param btnStatus boolean value indicating if the button has been booked by the user already or not
     *                  true = slot just recently booked by the user
     *                  false = slot is canceled by the user
     */
    public void handleSlotClick(boolean btnStatus) {
        iModel.setSlotStatus(btnStatus);
        }

    /**
     * Stores the slot the user just booked into the model
     * @param date date the slot is created
     * @param courtNum the court the slot belongs to
     * @param time the time of the slot to be booked
     */
    public void handleSlotStorage(LocalDate date, int courtNum, String time) {
        model.setBookedSlots(new Slot(date, date.getDayOfWeek(), courtNum, time));
    }

    public void handleDummySlot(boolean btnStatus) {
        iModel.setDummySlotStatus(btnStatus);
    }
}
