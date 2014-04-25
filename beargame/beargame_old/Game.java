package beargame;

import java.io.IOException;
import java.util.Scanner;

public class Game {
	
	public static void main (String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int jobchoice, menuchoice;
		Player_Base the_player;
		
		System.out.println("<<< Welcome to BEARGAME >>>");

		menuchoice = s.nextInt(); //input menuchoice
		
		switch(menuchoice){
		case 1:
			System.out.println("Let's Play!");
			System.out.println("You're in a room with two doors, which door do you choose? (1 or 2)");
			
			int doorchoice;
			
			doorchoice = s.nextInt();
			
			if(doorchoice == 1){
				System.out.println("AGH! It's a bear!");
			}else if(doorchoice == 2){
				System.out.println("It's a bum! Weird...");
			}
			break;
				
		case 2:
			System.out.println("Let's change some options!");
//				    Options Menu
			boolean optionsmenu;
			
		    optionsmenu = true;
		    while (optionsmenu){
		        System.out.println("What do you want to change??");
		        System.out.println("1. Name");
		        System.out.println("2. Job");
		        System.out.println("3. I'm done!");
		        
		        menuchoice = s.nextInt();
//				    Menu Choices
		        switch(menuchoice){
		        
				case 1:
		            System.out.println("Someday this section will ask you for a name!\n");
		            break;
				case 2:
					System.out.println("Someday this section will ask you for a job selection!\n");
					break;
		        case 3:
		            optionsmenu = false;
		            break;
		        default:
		        	System.out.println("Invalid Selection\n");
		        }
		    }
			break;
		default:
			break;
		}
		s.close();
	}
	}