package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of GameFrame
        GameFrame gameFrame = new GameFrame();

        // Create a new instance of GamePanel
        GamePanel gamePanel = new GamePanel();

        // Add the GamePanel to the GameFrame
        gameFrame.add(gamePanel);
    }
}