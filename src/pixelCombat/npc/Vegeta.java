package pixelCombat.npc;

import java.util.ArrayList;

import javafx.scene.image.Image;
import pixelCombat.Math.Vector2d;
import pixelCombat.view.animation.Animation;

public class Vegeta extends NPC {

	
	
	public Vegeta(Vector2d pos, boolean faceRight) {
		super(pos);
		ArrayList<Image> images = new ArrayList<Image>();
		
		images.add(loadImage("/npc/IMG_NPC_Vegeta_1.png"));
		images.add(loadImage("/npc/IMG_NPC_Vegeta_2.png"));

		ArrayList<Float> times = new ArrayList<Float>();
		times.add(0.155f);
		times.add(0.155f);
		
		this.animator = new Animation(images,times,false);

	}

}
