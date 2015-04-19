package com.trifecto.game.state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import com.trifecto.game.gfx.Background;

public class ParticipantQ2 extends State {
	
	public ParticipantQ2(StateManager stateManager) {
		super(stateManager);
	}

	@Override
	public void init() {
		
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
		
	}

	@Override
	public void tick() {
		this.background.tick();
	}

	@Override
	public void render(Graphics2D graphics) {
		
	}

	@Override
	public void keyPressed(int key) {
		
	}

	@Override
	public void keyReleased(int key) {
		
	}

}
