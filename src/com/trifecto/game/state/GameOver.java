package com.trifecto.game.state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.trifecto.game.gfx.Background;
import com.trifecto.game.main.MainComponent;

public class GameOver extends State {
	
	//private String endText = partName + ", the game is over.";

	public GameOver(StateManager stateManager) {
		super(stateManager);
	}

	@Override
	public void init() {
		
		//endText = partName + ", the game is over.";
		
		this.backgroundPath = "assets/images/QuakeLogo.jpg";
		
		try {
			
			this.background = new Background(this.backgroundPath, 0.5);
			this.background.setVector(-0.1, 0);
			this.questionColor = new Color(128, 0, 0);
			this.questionFont = new Font("Press Start 2P", Font.PLAIN, 12);
			this.responseFont = new Font("Press Start 2P", Font.PLAIN, 10);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		this.questionsPath = "assets/questions/Questions.txt";
		
	}

	@Override
	public void tick() {
		this.background.tick();
	}

	@Override
	public void render(Graphics2D graphics) {
		
		this.background.render(graphics);
		
		graphics.setColor(this.questionColor);
		graphics.setFont(this.questionFont);
		graphics.drawString(partName + ", the game is over.", 10, 20);
		
		
	}

	@Override
	public void keyPressed(int key) {
		if (key == KeyEvent.VK_ENTER) {
			System.out.println("GameOver partName: " + partName);
			
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(int key) {
		
	}

}
