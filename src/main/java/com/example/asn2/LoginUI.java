
package com.example.asn2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginUI extends BorderPane implements ModelListener, IModelListener {
     private Model model;
     private Controller controller;
     private InteractionModel iModel;
     Button signInBtn;
     Stage mainStage;

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
        signInBtn = new Button("Sign in");
        signInBtn.setFont(new Font("Helvetica", 20));
        signInBtn.setOnAction(e -> {
            CourtUI court = new CourtUI();
            court.mainStage = mainStage;
            Scene courtScene = new Scene(court,  750, 700);
            mainStage.setScene(courtScene);
        });

        textVBox.getChildren().addAll(nsidLbl, nsid, passwordLbl, password);
        root.getChildren().addAll(textVBox, signInBtn);
        setCenter(root);
        root.setAlignment(Pos.CENTER);
        this.setStyle("-fx-background-color: white");
    }


    @Override
    public void modelChanged() {}

    public void setModel(Model newModel) {
        this.model = newModel;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setInteractionModel(InteractionModel iModel) {
        this.iModel = iModel;
    }

    @Override
    public void iModelChanged() {

    }
}
