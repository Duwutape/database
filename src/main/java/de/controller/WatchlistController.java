package de.controller;

import de.App;
import de.Main;
import de.model.User;
import de.service.CodeService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WatchlistController implements Controller {

    private final App app;
    private final User user;
    private final CodeService codeService;

    public WatchlistController(App app, User user, CodeService codeService) {
        this.app = app;
        this.user = user;
        this.codeService = codeService;
    }

    @Override
    public String getTitle() {
        return "Watchlist";
    }

    @Override
    public void init() {
    }

    @Override
    public Parent render() throws IOException {

        // load fxml
        final Parent parent = FXMLLoader.load(Main.class.getResource("view/Watchlist.fxml"));

        // lookup elements
        final Button backButton = (Button) parent.lookup("#backButton");
        final Button aboutButton = (Button) parent.lookup("#aboutButton");

        //set action
        backButton.setOnAction(event -> {
            app.show(new MenuController(app, user, codeService));
        });

        aboutButton.setOnAction(event -> {
            app.show(new AboutController(app, user, codeService));
        });

        return parent;
    }

    @Override
    public void destroy() {

    }
}
