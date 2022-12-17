package de;

import de.controller.Controller;
import de.controller.MenuController;
import de.model.User;
import de.service.CodeService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private Stage stage;
    private Controller controller;
    private final CodeService codeService = new CodeService();
    private final User user = codeService.load();

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        primaryStage.setScene(new Scene(new Label("Loading...")));
        primaryStage.setTitle("Database");

        show(new MenuController(this, user, codeService));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        controller.destroy();
        codeService.save(user);
    }

    public void show(Controller controller) {
        controller.init();
        try {
            stage.getScene().setRoot(controller.render());
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }

        if (this.controller != null) {
            this.controller.destroy();
        }
        this.controller = controller;
        stage.setTitle(controller.getTitle());
    }
}
