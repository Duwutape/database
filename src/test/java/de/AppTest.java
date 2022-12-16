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
		// check window name
		assertEquals("Database - Login", stage.getTitle());

		// click on start button
		clickOn("#loginButton");

		// check window name
		assertEquals("Database - Menu", stage.getTitle());

		// set window size so that everything is visible
		stage.setWidth(640);
		stage.setHeight(420);
		sleep(1000);

		// click on user button
		clickOn("#userButton");

		// check window name
		assertEquals("Database - User", stage.getTitle());

		// set window size so that everything is visible
		stage.setWidth(154);
		stage.setHeight(200);
		sleep(1000);

		// click on logout button
		clickOn("#logoutButton");


	}
}
