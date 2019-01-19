
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Camera implements GameConstant{
	Player player=new Player();
	BufferedImage bi;
	int xspeed;
	int yspeed;
	int x;
	int y;
	public Camera(){
		try {
			bi  = ImageIO.read(Camera.class.getResource(BG_IMG1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Background not found ");
			//e.printStackTrace();
		}
		
		}
	public void drawBG(Graphics g){
		BufferedImage subI = bi.getSubimage(x, y, GAME_WIDTH, GAME_HEIGHT);
		g.drawImage(subI,0,0,GAME_WIDTH,GAME_HEIGHT,null);
	}
	public void xmove(){
		x+=xspeed;
	}
	public void ymove(){
		y+=yspeed;
	}
//	public void left(){
//		if((x<130&&x>60||x>345&&x<610)&&(y>275-player.h&&y<380-player.h)){
//		xspeed = -10;
//		xmove();
//		}
//	}
//	public void right(){
//		if((x>60&&x<130||x>345&&x<610)&&(y>275-player.h&&y<380-player.h)){
//			xspeed=10;
//			xmove();
//		}
		
	//}
	public void up(){
		if((x>60&&x<130||x>345&&x<610)&&(y>275-player.h&&y<380-player.h)){
			yspeed=-10;
			ymove();
		}
	}
	public void down(){
		if((x>60&&x<130||x>345&&x<610)&&(y>275-player.h&&y<380-player.h)){
			yspeed=10;
			ymove();
		
		
	}
		
	}

}
