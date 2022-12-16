package de.controller;

import de.App;
import de.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuController implements Controller {
    private final App app;

    public MenuController(App app) {
        this.app = app;
    }

    @Override
    public String getTitle() {
        return "Database - Menu";
    }

    @Override
    public void init() {
    }

    @Override
    public Parent render() throws IOException {
        // Load FXML
        final Parent parent = FXMLLoader.load(Main.class.getResource("view/Menu.fxml"));

        // Lookup Leave button
        final Button userButton = (Button) parent.lookup("#userButton");

        // Set action
        userButton.setOnAction(action -> {
            app.show(new UserController(app));
        });

        return parent;
    }

    @Override
    public void destroy() {
    }
}
