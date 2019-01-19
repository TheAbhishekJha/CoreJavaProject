
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends Sprite implements GameConstant,PlayerState{
	int currentState;
	SpriteLoader sloader = new SpriteLoader();
	BufferedImage defaultWalk[]=sloader.defaultWalk();
	BufferedImage standStill[]=sloader.standStill();
	BufferedImage standLeftStill[]=sloader.standLeftStill();
	BufferedImage defaultLeftWalk[]=sloader.defaultLeftWalk();
	public Player(){
		h=100;
		w=75;
		x=50;
		y=215;
		speed=5;
	}
	public void upMove(){
		
	}
	public void rightMove(){
		x+=speed;
	}
	public void leftMove(){
		int leftSpeed=-5;
		x+=leftSpeed;
	}
	public void drawPlayer(Graphics g){
		if(currentState == DEFAULT_WALK){
		drawWalkMove(g);
		}
		else if(currentState==STAND_STILL){	
		drawStandStill(g);
		}
		else if(currentState==STANDLEFT_STILL){	
			drawStandLeftStill(g);
			}
		else if(currentState==DEFAULTLEFT_WALK){
			drawWalkLeftMove(g);
			}
	}
	int walkMove = 0;
	public void drawWalkMove(Graphics g){
		g.drawImage(defaultWalk[walkMove],x,y,w,h,null);
		walkMove++;
		if(walkMove>11){
			walkMove=0;
			//speed = 0;
			currentState = STAND_STILL;
			standMove=0;
		}
	}
	
	int standMove = 0;
	public void drawStandStill(Graphics g){
		g.drawImage(standStill[standMove],x,y,w,h,null);
		standMove++;
		if(standMove>3){
			standMove=0;
		}
	}
	int walkLeftMove = 0;
	public void drawWalkLeftMove(Graphics g){
		g.drawImage(defaultLeftWalk[walkLeftMove],x,y,w,h,null);
		walkLeftMove++;
		if(walkLeftMove>11){
			walkLeftMove=0;
			currentState = STANDLEFT_STILL;
			standLeftMove = 0;
		}
	}
	int standLeftMove = 0;
	public void drawStandLeftStill(Graphics g){
		g.drawImage(standLeftStill[standLeftMove],x,y,w,h,null);
		standLeftMove++;
		if(standLeftMove>3){
			standLeftMove=0;
		}
	}
	

}
