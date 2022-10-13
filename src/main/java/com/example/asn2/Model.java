package com.example.asn2;

import java.util.ArrayList;

public class Model {
    private ArrayList<ModelListener> subscribers;
    public Model() {
        subscribers = new ArrayList<>();
    }

    private void notifySubscribers() {
//        view.modelChanged(); // v1
        subscribers.forEach(ModelListener::modelChanged); // v2
    }

    public void addSubscriber(ModelListener sub) { // for version 2
        subscribers.add(sub);
    }
}
