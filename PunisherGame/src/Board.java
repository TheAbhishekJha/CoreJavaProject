
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstant,PlayerState{
	Player player;
	Camera camera;
	Timer timer;
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		player = new Player();
		setFocusable(true);
		camera = new Camera();
		
		setFocusable(true);
		bindEvents();
		//prepareEnemy();
		gameLoop();
		
	}
	private void gameLoop(){
		timer= new Timer(GAME_SPEED, (e)->{
			repaint();
	});
	timer.start();

	}
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_UP){
					camera.up();
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					camera.down();
				}
	
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					//camera.right();
					player.currentState=1;
					player.rightMove();
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					//camera.left();
					player.currentState=3;
					player.leftMove();
				}
			
			}
		});
	}
	@Override
	public void paintComponent(Graphics g){
		camera.drawBG(g);
		player.drawPlayer(g);
		
	}


}
