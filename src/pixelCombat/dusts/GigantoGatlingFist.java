package pixelCombat.dusts;

import java.util.ArrayList;

import javafx.scene.image.Image;
import pixelCombat.Math.Vector2d;
import pixelCombat.model.Dust;
import pixelCombat.view.Animation;

public class GigantoGatlingFist extends Dust {

	
	
	public GigantoGatlingFist(Vector2d pos, boolean faceRight) {
		super(pos,faceRight);
		ArrayList<Image> images = new ArrayList<Image>();

			images.add(loadImage("/dusts/gigant_1.png"));
			images.add(loadImage("/dusts/gigant_2.png"));
			images.add(loadImage("/dusts/gigant_3.png"));
			images.add(loadImage("/dusts/gigant_4.png"));
			images.add(loadImage("/dusts/gigant_5.png"));
			
	
		
		ArrayList<Float> times = new ArrayList<Float>();
		times.add(0.035f);
		times.add(0.025f);
		times.add(0.035f);
		times.add(0.025f);
		times.add(0.035f);
		this.dustAnimator = new Animation(images,times,false);

	}

}
