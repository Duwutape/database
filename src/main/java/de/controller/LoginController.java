package de.controller;

import de.App;
import de.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoginController implements Controller {
    private final App app;

    public LoginController(App app) {
        this.app = app;
    }

    @Override
    public String getTitle() {
        return "Database - Login";
    }

    @Override
    public void init() {
    }

    @Override
    public Parent render() throws IOException {
        // Load FXML
        Parent parent = FXMLLoader.load(Main.class.getResource("view/Login.fxml"));

        // Lookup buttons
        Button startButton = (Button) parent.lookup("#loginButton");

        // Set button actions
        startButton.setOnAction(event -> {
            app.show(new MenuController(app));
        });


        return parent;
    }

    @Override
    public void destroy() {
    }
}
