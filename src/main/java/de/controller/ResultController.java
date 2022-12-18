package de.controller;

import de.model.Series;
import javafx.scene.Parent;

import java.io.IOException;

public class ResultController implements Controller {
    private final Series series;

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
        return null;
    }

    @Override
    public void destroy() {

    }
}
}
