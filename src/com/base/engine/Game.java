package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {
	
	public Game() {
		
	}
	
	public void input() {
		if(Input.getKeyDown(Keyboard.KEY_W))
			System.out.println("Pressed W");
		
		if(Input.getKeyUp(Keyboard.KEY_W))
			System.out.println("Released W");
		
		if(Input.getMouseDown(1))
			System.out.println("Pressed Right Click");
		
		if(Input.getMouseUp(Keyboard.KEY_W))
			System.out.println("Released Right Click");
	}
	
	public void update() {
		
	}
	
	public void render() {
		
	}
	
}
