package com.example.asn2;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainUI extends StackPane {
    Stage mainStage;

    public MainUI() {
        AnchorPane root = new AnchorPane();

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

        iModel.addSubscriber(courtView);

        // set up the layout
        AnchorPane.setTopAnchor(courtView, 40.0);
        AnchorPane.setLeftAnchor(courtView, 10.0);
        AnchorPane.setRightAnchor(accountView, 10.0);
        AnchorPane.setTopAnchor(accountView, 10.0);
        root.getChildren().addAll(courtView, accountView);
        this.getChildren().add(root);

        this.setStyle("-fx-background-color: white;");

        courtView.init();  // sets initial state of the button slots
    }
}
