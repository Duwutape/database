package de.controller;

import de.App;
import de.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class UserController implements Controller {
    private final App app;

    public UserController(App app) {
        this.app = app;
    }

    @Override
    public String getTitle() {
        return "Database - User";
    }

    @Override
    public void init() {
    }

    @Override
    public Parent render() throws IOException {
        // Load FXML
        final Parent parent = FXMLLoader.load(Main.class.getResource("view/User.fxml"));

        // Lookup Leave button
        final Button leaveButton = (Button) parent.lookup("#logoutButton");

        //set window size

        // Set Leave button onAction
        leaveButton.setOnAction(action -> {
            app.show(new LoginController(app));
        });

        return parent;
    }

    @Override
    public void destroy() {
    }
}