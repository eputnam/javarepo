package beargame;

import java.io.IOException;
import java.util.Scanner;

public class BearAction {

	void soldier() throws IOException {
		int action;
		Scanner actionin = new Scanner(System.in);
		BearAttack batt = new BearAttack();
		
		System.out.println("What's your move?");
		System.out.println("1. Fisticuffs!");
		System.out.println("2. Scream!");
		System.out.println("3. Run Awayy!!!");
		
		action = actionin.nextInt(); //Accept choice
		
		System.out.println(action);
		
		switch(action){
		case 1:
			System.out.println("Not your best idea to date...");
			batt.doctor();
		
		break;
		case 2:
			System.out.println("Seems reasonable, but you get eaten.");
			
		break;
		case 3:
			System.out.println("Seems like a good idea, but he catches you and eats you.");
			
		break;
		default:
			System.out.println("That wasn't an option...");
			
		break;
		}
		actionin.close(); //close Scanner
	

	}
	
	public static void doctor() {
		int action;
		Scanner actionin = new Scanner(System.in);
		
		System.out.println("What's your move?");
		System.out.println("1. Run away!");
		System.out.println("2. Syringe Strike!");
		System.out.println("3. Bandage his wounds...");
		
		action = actionin.nextInt(); //Accept choice
		
		System.out.println(action);
		
		switch(action){
		case 1:
			System.out.println("Not your best idea to date...");
		
		break;
		case 2:
			System.out.println("He goes down in a druggy haze.");
			
		break;
		case 3:
			System.out.println("'Thanks', he says.");
			
		break;
		default:
			System.out.println("That wasn't an option...");
			
		break;
		}
		actionin.close(); //close Scanner
	

	}

	public static void thief() {
		int action;
		Scanner actionin = new Scanner(System.in);
		
		System.out.println("What's your move?");
		System.out.println("1. Steal her honeypot!");
		System.out.println("2. Choke him out...real quiet like...!");
		System.out.println("3. Sneak away...!");
		
		action = actionin.nextInt(); //Accept choice
		
		System.out.println(action);
		
		switch(action){
		case 1:
			System.out.println("She's not happy and kills you. In the face.");
		
		break;
		case 2:
			System.out.println("Nice try. She's a 900 pound grizzly bear, you're dead.");
			
		break;
		case 3:
			System.out.println("You're so slick.");
			
		break;
		default:
			System.out.println("That wasn't an option...");
			
		break;
		}
		actionin.close(); //close Scanner
	

	}

	public static void wizard() {
		int action;
		Scanner actionin = new Scanner(System.in);
		
		System.out.println("What's your move?");
		System.out.println("1. Disappear in a cloud of smoke!");
		System.out.println("2. Pull a bunny out of a hat!");
		System.out.println("3. Zap its dumb ass!");
		
		action = actionin.nextInt(); //Accept choice
		
		System.out.println(action);
		
		switch(action){
		case 1:
			System.out.println("Whew! Good move!");
		
		break;
		case 2:
			System.out.println("She eats the bunny. Now what??");
			
		break;
		case 3:
			System.out.println("You're so slick.");
			
		break;
		default:
			System.out.println("Toasted bear. Sounds like breakfast to me!");
			
		break;
		}
		actionin.close(); //close Scanner
	

	}

}
