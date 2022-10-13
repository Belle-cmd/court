package com.example.asn2;

public class MvcManager {
    public MvcManager() {
        // create MVC components
        LoginUI loginView = new LoginUI();
        CourtUI courtView = new CourtUI();
        AccountUI accountView = new AccountUI();
        Model model = new Model();
        Controller controller = new Controller();

        // connect components
        controller.setModel(model);

        loginView.setModel(model);
        model.addSubscriber(loginView);
        loginView.setController(controller);

        courtView.setModel(model);
        model.addSubscriber(courtView);
        courtView.setController(controller);

//        accountView.setModel(model);
//        model.addSubscriber(accountView);
//        accountView.setController(controller);
    }
}
