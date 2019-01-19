
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteLoader {
	BufferedImage img;
	BufferedImage leftImg;
	public SpriteLoader(){
		loadSpriteSheet();
	}
	public BufferedImage[] standStill(){
		BufferedImage bf[]  = new BufferedImage[4];
		bf[0] = img.getSubimage(16, 13, 35, 40);
		bf[1] = img.getSubimage(53, 13, 31, 40);
		bf[2] = img.getSubimage(90, 14, 34, 39);
		bf[3] = img.getSubimage(144, 13, 25, 40);
		return bf;
	}
	public BufferedImage[] standLeftStill(){
		BufferedImage bf[]  = new BufferedImage[4];
		bf[0] = leftImg.getSubimage(519, 13, 35, 40);
		bf[1] = leftImg.getSubimage(482, 13, 31, 40);
		bf[2] = leftImg.getSubimage(446, 14, 34, 39);
		bf[3] = leftImg.getSubimage(401, 13, 25, 40);
		return bf;
	}
	public BufferedImage[] defaultWalk(){
		BufferedImage bf[]  = new BufferedImage[12];
		bf[0] = img.getSubimage(11, 62, 36, 40);
		bf[1] = img.getSubimage(51, 62, 31, 40);
		bf[2] = img.getSubimage(93, 63, 33, 39);
		bf[3] = img.getSubimage(130, 62, 30, 40);
		bf[4] = img.getSubimage(163, 62, 36, 40);
		bf[5] = img.getSubimage(195, 62, 33, 40);
		bf[6] = img.getSubimage(230, 62, 40, 40);
		bf[7] = img.getSubimage(273, 62, 37, 40);
		bf[8] = img.getSubimage(313, 62, 32, 40);
		bf[9] =  img.getSubimage(348, 61, 30, 41);
		bf[10] = img.getSubimage(380, 61,32, 41);
		bf[11]= img.getSubimage(416, 62, 36, 40);
				return bf;
	}
	public BufferedImage[] defaultLeftWalk(){
		BufferedImage bf[]  = new BufferedImage[12];
		bf[0] = leftImg.getSubimage(523, 62, 36, 40);
		bf[1] = leftImg.getSubimage(483, 62, 36, 40);
		bf[2] = leftImg.getSubimage(444, 63, 33, 39);
		bf[3] = leftImg.getSubimage(410, 62, 30, 40);
		bf[4] = leftImg.getSubimage(376, 62, 31, 40);
		bf[5] = leftImg.getSubimage(342, 62, 33, 40);
		bf[6] = leftImg.getSubimage(300, 62, 40, 40);
		bf[7] = leftImg.getSubimage(260, 62, 37, 40);
		bf[8] = leftImg.getSubimage(225, 62, 32, 40);
		bf[9] =  leftImg.getSubimage(192, 61, 30, 41);
		bf[10] = leftImg.getSubimage(158, 61,32, 41);
		bf[11]= leftImg.getSubimage(118, 62, 36, 40);
				return bf;
	}
	
	public void loadSpriteSheet(){
		try {
			img = ImageIO.read(SpriteLoader.class.getResource("Sprite.png"));
			leftImg=ImageIO.read(SpriteLoader.class.getResource("SpriteLeft.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
