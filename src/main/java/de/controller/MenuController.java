package de.controller;

import de.App;
import de.Main;
import de.model.User;
import de.service.CodeService;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MenuController implements Controller {
    private final App app;
    private final User user;
    private final CodeService codeService;

    public MenuController(App app, User user, CodeService codeService) {
        this.app = app;
        this.user = user;
        this.codeService = codeService;
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
        final ChoiceBox choiceBox = (ChoiceBox) parent.lookup("#selectType");
        final Button searchButton = (Button) parent.lookup("#searchButton");
        final Button watchlistButton = (Button) parent.lookup("#watchlistButton");
        final Button aboutButton = (Button) parent.lookup("#aboutButton");

        // add choiceBox content
        final String[] filter = {"Series","Anime","Movie","Game","Book"};
        choiceBox.setItems(FXCollections.observableArrayList(filter));
        choiceBox.setValue(filter[0]);

        //set listener

        // set actions
        searchButton.setOnAction(action -> {
            final String search = searchBar.getText();
            final String type = choiceBox.getValue().toString();
        });

        watchlistButton.setOnAction(action -> {
            app.show(new WatchlistController(app, user, codeService));
        });

        aboutButton.setOnAction(action -> {
            app.show(new AboutController(app, user, codeService));
        });

        return parent;
    }

    @Override
    public void destroy() {
    }

}
