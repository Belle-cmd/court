package com.example.asn2;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainUI extends StackPane {
    Stage mainStage;

    public MainUI() {
        BorderPane root = new BorderPane();

        // create MVC components
        LoginUI loginView = new LoginUI();
        CourtUI courtView = new CourtUI();
        AccountUI accountView = new AccountUI();
        Model model = new Model();
        Controller controller = new Controller();
        InteractionModel iModel = new InteractionModel();

        // connect components
        controller.setModel(model);
        controller.setInteractionModel(iModel);

        loginView.setModel(model);
        loginView.setInteractionModel(iModel);
        loginView.setController(controller);

        courtView.setModel(model);
        courtView.setInteractionModel(iModel);
        courtView.setController(controller);

        accountView.setModel(model);
        accountView.setInteractionModel(iModel);
        accountView.setController(controller);

        model.addSubscriber(courtView);
        model.addSubscriber(accountView);

        iModel.addSubscriber(courtView);

        // set up the layout
        BorderPane.setAlignment(courtView, Pos.CENTER);
        root.setCenter(courtView);
        BorderPane.setAlignment(accountView, Pos.CENTER_RIGHT);
        root.setRight(accountView);
        this.getChildren().add(root);

        this.setStyle("-fx-background-color: white;");

        courtView.init();  // sets initial state of the button slots
    }
}
