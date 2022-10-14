package com.example.asn2;

public class MvcManager {
    public MvcManager() {
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
    }
}
