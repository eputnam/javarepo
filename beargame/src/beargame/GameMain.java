package beargame;

import java.io.IOException;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) 
	throws IOException {
		
		Scanner i = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int jobchoice, doorchoice;
		String namechoice = "";
		Tools t = new Tools();
		Player_Base the_player = null;
		Villain_Base the_villain = null;
		
		//SET PLAYER JOB
		System.out.println("What type of character do you want to play?");
		System.out.println("1. Soldier \n2. Doctor \n3. Thief \n4. Wizard");
		
		jobchoice = i.nextInt();
		
		switch(jobchoice){
		case 1:
 			the_player = new Soldier(5, namechoice);
			break;
		case 2:
			the_player = new Doctor(5, namechoice);
			break;
		case 3:
			the_player = new Thief(5, namechoice);
			break;
		case 4:
			the_player = new Wizard(5, namechoice);
			break;
		default:
			System.out.print("Invalid input");
			System.exit(0);
			break;
		}
		
		//SET PLAYER NAME
		do {
		System.out.println("What do you want to name your character?");
		
		namechoice = s.nextLine();
		
		if(t.IsString(namechoice)){
			System.out.println("Nice choice.");
		}else
			System.out.println("Only letters please!");
		}while(!t.IsString(namechoice));
		
		//set the player's name attribute to match namechoice
		the_player.playername = namechoice;
		
		//START GAME
		System.out.println();
		System.out.println("Welcome " + the_player.playername + ", it's time to play!");
		System.out.println();
		
		//CHOOSE YOUR DOOR
		boolean playagain = true;
		String playchoice;
		
		while(playagain){
		System.out.println("You're in a room with 2 doors, which one do you choose? (1 or 2)");
		
		doorchoice = i.nextInt();
		
		switch(doorchoice) {
		//THE BEAR
		case 1: 
			System.out.println("Agh, it's a bear!");
			the_villain = new Bear(5);
			the_player.Menu(doorchoice);
			break;
		//THE BUM
		case 2:
			System.out.println("Agh, it's a...bum?");
			the_villain = new Bum(5);
			the_player.Menu(doorchoice);
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		
		//PLAY AGAIN??
		System.out.println();
		System.out.println("Play again? (y or n)");
		
		playchoice = s.nextLine();
		if(playchoice.toLowerCase().equals("y"))
			playagain = true;
		else
			playagain = false;
		}
		
		i.close();
		s.close();
	}
}
