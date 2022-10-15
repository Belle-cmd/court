package com.example.asn2;

import java.util.ArrayList;

public class InteractionModel {
    // if true, the button is booked by the user and its colour should be green
    private boolean buttonStatus;

    // if true, the button is booked by another student and its colour should be red
    private boolean studentStatus;

    private ArrayList<IModelListener> subscribers;

    /**
     * Constructor Method
     */
    public InteractionModel() {
        subscribers = new ArrayList<>();
    }

    private void notifySubscribers() {
        subscribers.forEach(IModelListener::iModelChanged);
    }

    public void addSubscriber(IModelListener sub) { // for version 2
        subscribers.add(sub);
    }

    /**
     * Toggles the change in button colour by notifying all the subscribers
     */
    public void setSlotStatus(boolean status) {
        buttonStatus = status;
        notifySubscribers();
    }

    public void setDummySlotStatus(boolean status) {
        studentStatus = status;
        notifySubscribers();
    }

    public boolean getSlotStatus() {
        return buttonStatus;
    }

    public boolean getStudentStatus() {
        return studentStatus;
    }
}
