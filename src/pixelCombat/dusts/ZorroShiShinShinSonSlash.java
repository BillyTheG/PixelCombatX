package pixelCombat.dusts;

import java.util.ArrayList;

import javafx.scene.image.Image;
import pixelCombat.Math.Vector2d;
import pixelCombat.model.Dust;
import pixelCombat.view.animation.Animation;

public class ZorroShiShinShinSonSlash extends Dust {

	
	
	public ZorroShiShinShinSonSlash(Vector2d pos, boolean faceRight) {
		super(pos,faceRight);
		ArrayList<Image> images = new ArrayList<Image>();
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_1.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_2.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_3.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_4.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_5.png"));
	
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_6.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_7.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_8.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_9.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_10.png"));
		
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_11.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_12.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_13.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_14.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_15.png"));
		
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_16.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_17.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_18.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_19.png"));
		images.add(loadImage("/dusts/IMG_Dust_Shin_Son_Son_Slash_20.png"));
		
		
		
		ArrayList<Float> times = new ArrayList<Float>();
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		times.add(0.03f);
		
		this.dustAnimator = new Animation(images,times,true);

	}

}
