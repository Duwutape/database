package de;

import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import static org.junit.Assert.assertEquals;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.util.NodeQueryUtils.hasText;

public class AppTest extends ApplicationTest
{
	private App app;
	private Stage stage;

	@Override
	public void start(Stage stage) throws Exception
	{
		this.stage = stage;
		app = new App();
		app.start(stage);
	}

	@Test
	public void changeView()
	{
		assertEquals("Menu", stage.getTitle());
		clickOn("#watchlistButton");
		assertEquals("Watchlist", stage.getTitle());
		clickOn("#aboutButton");
		assertEquals("About", stage.getTitle());
		clickOn("#backButton");
		assertEquals("Menu", stage.getTitle());
		clickOn("#aboutButton");
		assertEquals("About", stage.getTitle());
		clickOn("#backButton");
		assertEquals("Menu", stage.getTitle());
	}

	@Test
	public void search(){
		assertEquals("Menu", stage.getTitle());
		clickOn("#searchBar");
		write("Test");
		clickOn("searchButton");
	}
}
