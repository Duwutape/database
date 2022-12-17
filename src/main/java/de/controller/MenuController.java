package de.controller;

import de.App;
import de.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MenuController implements Controller {
    private final App app;

    public MenuController(App app) {
        this.app = app;
    }

    @Override
    public String getTitle() {
        return "Menu";
    }

    @Override
    public void init() {
    }

    @Override
    public Parent render() throws IOException {

        // load FXML
        final Parent parent = FXMLLoader.load(Main.class.getResource("view/Menu.fxml"));

        // lookup elements
        final TextField searchBar = (TextField) parent.lookup("#searchBar");
        final Button searchButton = (Button) parent.lookup("#searchButton");
        final Button watchlistButton = (Button) parent.lookup("#watchlistButton");
        final Button aboutButton = (Button) parent.lookup("#aboutButton");

        // set actions
        watchlistButton.setOnAction(action -> {
            app.show(new WatchlistController(app));
        });

        aboutButton.setOnAction(action -> {
            app.show(new AboutController(app));
        });

        return parent;
    }

    @Override
    public void destroy() {
    }
}
