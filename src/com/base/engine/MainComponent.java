package com.base.engine;

public class MainComponent {
	
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;
	public static final String TITLE = "3D Engine";
	
	public MainComponent() {
		
	}
	
	public void start() {
		run();
	}
	
	public void stop() {
		
	}
	
	private void run() {
		while(!Window.isCloseRequested()) {
			render();
		}
	}
	
	private void render() {
		Window.render();
	}
	
	private void cleanUp() {
		
	}
	
	public static void main(String[] args) {
		
		Window.createWindow(WIDTH, HEIGHT, TITLE);
		
		MainComponent game = new MainComponent();
		game.start();
	}
}
