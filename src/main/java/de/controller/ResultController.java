package de.controller;

import de.Main;
import de.model.Series;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import java.io.IOException;

public class ResultController implements Controller {
    private Series series;

    public ResultController(Series series) {
        this.series = series;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public Parent render() throws IOException {
        final Parent parent = FXMLLoader.load(Main.class.getResource("view/ResultSeries.fxml"));

        final Label name = (Label) parent.lookup("#nameSeries");
        name.setText(series.getNameOV());
        return parent;
    }

    @Override
    public void destroy() {

    }
}

