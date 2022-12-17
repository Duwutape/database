package de.controller;

import com.sun.security.auth.UnixNumericUserPrincipal;
import de.App;
import de.Main;
import de.model.User;
import de.service.CodeService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

public class AboutController implements Controller {
    private final App app;
    private final User user;
    private final CodeService codeService;

    public AboutController(App app, User user, CodeService codeService) {
        this.app = app;
        this.user = user;
        this.codeService = codeService;
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
            app.show(new MenuController(app, user, codeService));
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
