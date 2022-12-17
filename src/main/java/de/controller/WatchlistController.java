package de.controller;

import de.App;
import de.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WatchlistController implements Controller {

    private final App app;

    public WatchlistController(App app) {
        this.app = app;
    }

    @Override
    public String getTitle() {
        return "Database - Watchlist";
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
            app.show(new MenuController(app));
        });

        aboutButton.setOnAction(event -> {
            app.show(new AboutController(app));
        });

        return parent;
    }

    @Override
    public void destroy() {

    }
}
