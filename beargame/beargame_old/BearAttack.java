package beargame;

import java.io.IOException;
import java.util.Scanner;

public class BearAttack {
	//SCANNER FOR ATTACKS
	Scanner s = new Scanner(System.in);
	
	//SOLDIER ATTACK
	void soldier()
	throws IOException{
	
		//initialize hitpoints
		int bearhp = 3;
		int playerhp = 5;
		int attacktype;
		
		System.out.println("Attack!");
		
		while(bearhp > 0){
			
			System.out.println("What do you do? \n1. Punch! \n2. Kick! \n");
			attacktype = s.nextInt();
			
			switch(attacktype){
			case 1:
				bearhp =- 1;
				if (bearhp > 0){
					System.out.println("Bear takes a punch! \nBear punches back!");
					playerhp =- 1;
				}
				else{ 
					System.out.println("Bear takes a fatal blow! \nYou killed the bear!");
				}
				break;
			case 2:
				bearhp =- 1;
				if (bearhp > 0){
					System.out.println("Bear takes a kick and he's stunned!");
				}
				else {
					System.out.println("Bear takes a kick and he's stunned...permanently...");
				}
				break;
			}
		System.out.println("You made it out alive with " + playerhp + " hit points to spare!");
		}
		s.close();
	}
	void doctor() 
	throws IOException{
		System.out.println("Doctor! NO!");
		
		int bearhp = 3;
		int playerhp = 5;
		int attacktype;
		
		while (bearhp > 0){
			
			System.out.println("You've got a lot of syringes! Which one to use...");
			System.out.println("1. Epinephrine");
			System.out.println("2. Potassium Chloride");
			System.out.println("3. Insulin");
			
			attacktype = s.nextInt();
			
			switch(attacktype){
			case 1: 
				if(bearhp >= 1){
					System.out.println("Uh oh, looks like that just gave him a boost!");
					bearhp+=1;
					}
				else {
					break;
				}
				break;
			case 2:
				if(bearhp >= 1){
					System.out.println("Hmmm, he doesn't look so good. I'd try some more!");
					bearhp-=1;
				}
				else {
					break;
				}
				break;
			}
		}
	}
	void thief(){}
	void wizard(){}
}
					
			

