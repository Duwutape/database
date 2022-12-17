package de.controller;

import de.App;
import de.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AboutController implements Controller {
    private final App app;

    public AboutController(App app) {
        this.app = app;
    }

    @Override
    public String getTitle() {
        return "About";
    }

    @Override
    public void init() {
    }

    @Override
    public Parent render() throws IOException {

        // load fxml
        final Parent parent = FXMLLoader.load(Main.class.getResource("view/About.fxml"));

        // lookup elements
        final Button backButton = (Button) parent.lookup("#backButton");
        final Hyperlink linkGit = (Hyperlink) parent.lookup("#hyperlinkGit");
        final Hyperlink linkIcon = (Hyperlink) parent.lookup("#hyperlinkIcon");

        // set actions
        backButton.setOnAction(action -> {
            app.show(new MenuController(app));
        });

        linkGit.setOnAction(action -> {
            try {
                Desktop.getDesktop().browse(new URI("www.github.com/Duwutape"));
            } catch (IOException | URISyntaxException e) {
                throw new RuntimeException(e);
            }
        });

        linkIcon.setOnAction(action -> {
            try {
                Desktop.getDesktop().browse(new URI("www.icons8.com"));
            } catch (IOException | URISyntaxException e) {
                throw new RuntimeException(e);
            }
        });

        return parent;
    }

    @Override
    public void destroy() {

    }
}
