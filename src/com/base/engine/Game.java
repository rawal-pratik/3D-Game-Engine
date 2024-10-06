package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {
	
	private Mesh mesh;
	
	public Game() {
		mesh = new Mesh();
		Vertex[] data = new Vertex[] {new Vertex(new Vector3f(-1,-1,0)),
										new Vertex(new Vector3f(0, 1, 0)),
										new Vertex(new Vector3f(1, -1, 0))};
		mesh.addVertices(data);
	}
	
	public void input() {
		if(Input.getKeyDown(Keyboard.KEY_W))
			System.out.println("Pressed W");
		
		if(Input.getKeyUp(Keyboard.KEY_W))
			System.out.println("Released W");
		
		if(Input.getMouseDown(1))
			System.out.println("Pressed Right Click at " + Input.getMousePosition().toString());
		
		if(Input.getMouseUp(1))
			System.out.println("Released Right Click");
	}
	
	public void update() {
		
	}
	
	public void render() {
		mesh.draw();
	}
	
}
