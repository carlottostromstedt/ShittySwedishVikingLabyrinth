package shittyLabyrinth;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
    	
    	Ascii ascii1 = new Ascii(140,15, "SHI T T Y SWEDISH");
    	ascii1.printAscii();
    	
    	Ascii ascii2 = new Ascii(140,15, "VIKING LABYRINTH");
    	ascii2.printAscii();
    	
    	System.out.println();
    	
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Viking's Labyrinth, please enter your name:");
        
        String name = "Michi";
        int input1 = 0;
		int tries = 0;
		while(tries < 3)
			if (input.hasNext("[a-zA-Z][a-zA-Z ]+")){ 
				name = input.nextLine(); 
				break;
			} else { 
			System.err.println("ERROR: not a valid Input");
			System.out.println("Welcome to the Viking's Labyrinth, please enter your name:");
			input.nextLine();
			tries++;
		} 
        Labyrinth labyrinth = new Labyrinth();
        Player player = new Player(labyrinth, name);
        boolean gameWon = false;

        System.out.println("You are " + player.getName() + " and you enter the labyrinth.");
        while (!gameWon) {
            System.out.println("You are in the " + player.getCurrentRoomName());
            System.out.println("Choose a direction (north, south, east, west): ");
            String direction = input.nextLine();
            gameWon = player.move(direction);
        }

        System.out.println("You have reached Valhalla, " + player.getName() + "! You have proven yourself as a true Viking Warrior!");
        Ascii ascii3 = new Ascii(140,15, "WELCOME TO VALHALLA");
    	ascii3.printAscii();
    }
}