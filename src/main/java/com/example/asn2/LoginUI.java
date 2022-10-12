
package com.example.asn2;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LoginUI extends BorderPane {

    public LoginUI() {
        VBox root = new VBox();
        root.setSpacing(20);
        root.setPadding(new Insets(20, 100, 20, 100));

        VBox textVBox = new VBox();
        textVBox.setSpacing(10);

        Label nsidLbl = new Label("NSID (abc123)");
        nsidLbl.setFont(new Font("Helvetica", 20));
        TextField nsid = new TextField();
        nsid.setPrefHeight(40);
        nsid.setFont(new Font("Helvetica", 20));
        Label passwordLbl = new Label("Password");
        passwordLbl.setFont(new Font("Helvetica", 20));
        TextField password = new TextField();
        password.setPrefHeight(40);
        password.setFont(new Font("Helvetica", 20));
        Button signInBtn = new Button("Sign in");
        signInBtn.setFont(new Font("Helvetica", 20));
        signInBtn.setOnAction(this::handleSubmit);

        textVBox.getChildren().addAll(nsidLbl, nsid, passwordLbl, password);
        root.getChildren().addAll(textVBox, signInBtn);
        setCenter(root);
        root.setAlignment(Pos.CENTER);
    }

    private void handleSubmit(ActionEvent actionEvent) {

    }
}
