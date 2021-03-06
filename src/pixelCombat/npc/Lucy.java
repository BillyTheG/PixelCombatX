package pixelCombat.npc;

import java.util.ArrayList;

import javafx.scene.image.Image;
import pixelCombat.Math.Vector2d;
import pixelCombat.view.animation.Animation;

public class Lucy extends NPC {

	
	
	public Lucy(Vector2d pos, boolean faceRight) {
		super(pos);
		ArrayList<Image> images = new ArrayList<Image>();
		
		images.add(loadImage("/npc/IMG_NPC_Lucy_1.png"));
		images.add(loadImage("/npc/IMG_NPC_Lucy_2.png"));
		images.add(loadImage("/npc/IMG_NPC_Lucy_3.png"));
		images.add(loadImage("/npc/IMG_NPC_Lucy_4.png"));
		images.add(loadImage("/npc/IMG_NPC_Lucy_5.png"));
		images.add(loadImage("/npc/IMG_NPC_Lucy_6.png"));
		images.add(loadImage("/npc/IMG_NPC_Lucy_7.png"));
		images.add(loadImage("/npc/IMG_NPC_Lucy_8.png"));
		
		
		ArrayList<Float> times = new ArrayList<Float>();
		times.add(0.15f);
		times.add(0.15f);
		times.add(0.15f);
		times.add(0.15f);
		times.add(0.15f);
		times.add(0.15f);
		times.add(0.15f);
		times.add(0.15f);
		
		this.animator = new Animation(images,times,false);

	}

}
