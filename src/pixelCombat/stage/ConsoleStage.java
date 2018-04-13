package pixelCombat.stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pixelCombat.view.gamephases.GamePlayView;


/**
 * Representation of the game
 * 
 * @author BillyG
  * @version 0.1
 */

@SuppressWarnings("unused")
public class ConsoleStage extends Stage {

	private MyScene MainmenueScene;
	private Pane MainmenueGroup;
	private Group rootGroup;
	public MyScene rootScene;

	private Scene winScene;
	private Group winGroup;


	/**
	 * Creates a game
	 */
	public ConsoleStage() {
		super();
		setTitle("Pixel Combat Console");
		setHeight(GamePlayView.SCREEN_HEIGHT + 23);
		setWidth(GamePlayView.SCREEN_WIDTH + 1);
		rootScene = initGameScene();
		setScene(rootScene);
		// display GameStage
	}

	/**
	 * Creates a scene for the root node / group
	 * 
	 * @return scene game scene
	 */
	private MyScene initGameScene() {
		MainmenueGroup = new Pane();
		return new MyScene(MainmenueGroup,"Mainmenue");
	}

	/**
	 * Returns the group
	 * 
	 * @return group
	 */
	public Pane getGroup() {
		return MainmenueGroup;
	}

	/**
	 * Sets the game view
	 */
	public void setMenueView() {
		setScene(MainmenueScene);
	}

	
	public void setGameView() {
		setScene(rootScene);
	}

	/**
	 * Sets the win view
	 */
	public void setWinView() {
		setScene(winScene);
	}

}