package com.example.asn2;

import java.util.ArrayList;

public class InteractionModel {

    private boolean buttonStatus;
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

    public boolean getSlotStatus() {
        return buttonStatus;
    }
}
