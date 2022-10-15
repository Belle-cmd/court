package com.example.asn2;

import java.util.ArrayList;

public class Model {

    private ArrayList<ModelListener> subscribers;

     ArrayList<Slot> slotArrayList = new ArrayList<>();

    public Model() {
        subscribers = new ArrayList<>();
    }

    private void notifySubscribers() {
        subscribers.forEach(ModelListener::modelChanged);
    }

    public void addSubscriber(ModelListener sub) { // for version 2
        subscribers.add(sub);
    }

    public void setBookedSlots(Slot slot) {
        slotArrayList.add(slot);
        notifySubscribers();
    }
}
