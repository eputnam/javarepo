package beargame;

import java.util.Scanner;

public class Soldier extends Player_Base {

	String swordname;
	
	Soldier(int h, String n) {
		super(h, n);
	}

	Scanner s = new Scanner(System.in);
	
	@Override
	public void Menu(int doorchoice) {
		switch(doorchoice){
		case 1:
			System.out.println("Looks like a threat, what do you do??");
			System.out.println("1. Fisticuffs!");
			System.out.println("2. Run!");
			System.out.println("3. Unsheath your sword!");
			System.out.println("4. He looks hungry...help him hunt!");
			
			int menuchoice = s.nextInt();
			switch(menuchoice){
			case 1:
				Attack(1);
				break;
			case 2:
				Escape(1);
				break;
			case 3:
				Special(1);
				break;
			case 4:
				Help(1);
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
			break;
			
		case 2:
			System.out.println("What's he doing here??");
			System.out.println("1. Fisticuffs!");
			System.out.println("2. Looks shady. Continue on your way.");
			System.out.println("3. Unsheath your sword!");
			System.out.println("4. He looks hungry...head to the ATM.");
			
			menuchoice = s.nextInt();
			switch(menuchoice){
			case 1:
				Attack(2);
				break;
			case 2:
				Escape(2);
				break;
			case 3:
				Special(2);
				break;
			case 4:
				Help(2);
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
			break;
		default:
			System.out.println("Invalid input.");
			break;
		}
		
	}

	@Override
	public void Attack(int doorchoice) {
		//initialize hitpoints
		int bearhp = Villain_Base.villainhp;
		int playerhp = this.playerhp;
		int attacktype;
		
		switch(doorchoice){
		case 1:
			System.out.println("Attack!");
//			System.out.println("Bear has " + bearhp + " hitpoints.");
			
			while(bearhp > 0){
				System.out.println("What do you do? \n1. Punch! \n2. Kick! \n");
				attacktype = s.nextInt();
//				System.out.println("Attacktype = " + attacktype);
			
				switch(attacktype){
				case 1:
					bearhp -= 1;
					if (bearhp > 0){
						System.out.println("Bear takes a punch! \nBear punches back!");
						playerhp -= 1;
					}
					else{ 
						System.out.println("Bear takes a fatal blow! \nYou killed the bear!");
					}
					System.out.println("Now Bear has " + bearhp + " hitpoints.");
					break;
				case 2:
					bearhp -= 1;
					if (bearhp > 0){
						System.out.println("Bear takes a kick and he's stunned!");
					}
					else {
						System.out.println("Bear takes a kick and he's stunned...permanently...");
					}
					break;
				}
			}
			System.out.println("You made it out alive with " + playerhp + " hit points to spare!");
		break;
		case 2:
			System.out.println("Attack!");
			while(bearhp > 0){
				
				System.out.println("What do you do? \n1. Punch! \n2. Kick! \n");
				attacktype = s.nextInt();
				
				switch(attacktype){
				case 1:
					bearhp -= 1;
					if (bearhp > 0){
						System.out.println("Bum takes a punch! \nBum punches back!");
						playerhp =- 1;
					}
					else{ 
						System.out.println("Bum takes a fatal blow! \nYou killed the bum!");
					}
					break;
				case 2:
					bearhp -= 1;
					if (bearhp > 0){
						System.out.println("Bum takes a kick and he's stunned!");
					}
					else {
						System.out.println("Bum takes a kick and he's stunned...permanently...");
					}
					break;
				}
			}
			System.out.println("You made it out alive with " + playerhp + " hit points to spare!");
		break;
		}
		s.close();
}
		
	@Override
	public void Escape(int doorchoice) {
		
		String runchoice;
		int runchance;
		
		switch(doorchoice) {
		case 1:
			System.out.println("Better get moving, he looks hungry!");
			System.out.println("Get outta there?(y or n)");
			
			runchoice = s.next();
			
			switch(runchoice.toLowerCase()){
			case "y":
				runchance = (int)Math.random()*10;
				if(runchance <= 5)
					System.out.println("You made it!");
				else if(runchance > 5)
					System.out.println("Yikes, you didn't quite make it...");
				break;
			case "n":
				System.out.println("Ok, so what do you want to do then?");
				break;
			default:
				System.out.println("Invalid input");
			}
			break;
		case 2:
			System.out.println("Yeah, good call. You can never be too careful these days...");
			break;
		}
		
	}

	@Override
	public void Special(int doorchoice) {
		//initialize hitpoints
			int bearhp = Villain_Base.villainhp;
			int playerhp = this.playerhp;
			int attacktype;
			
			switch(doorchoice){
			case 1:
				System.out.println("En garde!");
//					System.out.println("Bear has " + bearhp + " hitpoints.");
				
				while(bearhp > 0){
					System.out.println("What do you do? \n1. Slash! \n2. Jab! \n");
					attacktype = s.nextInt();
//						System.out.println("Attacktype = " + attacktype);
				
					switch(attacktype){
					case 1:
						bearhp -= 2;
						if (bearhp > 0){
							System.out.println("You cut bear! \nBear returns with a scratch!");
							playerhp -= 2;
						}
						else{ 
							System.out.println("Bear takes a fatal blow! \nYou killed the bear!");
						}
						break;
					case 2:
						bearhp -= 1;
						if (bearhp > 0){
							System.out.println("Bear takes a jab and he's stunned!");
						}
						else {
							System.out.println("Bear takes a jab and he's stunned...permanently...");
						}
						break;
					}
				}
				System.out.println("You made it out alive with " + playerhp + " hit points to spare!");
				break;
			case 2:
				System.out.println("En garde!");
//				System.out.println("Bear has " + bearhp + " hitpoints.");
			
			while(bearhp > 0){
				System.out.println("What do you do? \n1. Slash! \n2. Jab! \n");
				attacktype = s.nextInt();
//					System.out.println("Attacktype = " + attacktype);
			
				switch(attacktype){
				case 1:
					bearhp -= 2;
					if (bearhp > 0){
						System.out.println("You cut bear! \nBear returns with a scratch!");
						playerhp -= 2;
					}
					else{ 
						System.out.println("Bear takes a fatal blow! \nYou killed the bear!");
					}
					break;
				case 2:
					bearhp -= 1;
					if (bearhp > 0){
						System.out.println("Bear takes a jab and he's stunned!");
					}
					else {
						System.out.println("Bear takes a jab and he's stunned...permanently...");
					}
					break;
				}
			}
				break;
		}
	}

	@Override
	public void Help(int doorchoice) {
		System.out.println("Alright, dinner time.");
		

		int dinnerchoice = (int)(Math.random()*10);
		if(dinnerchoice > 5) {
			System.out.println("Look! A wild rabbit has appeared!");
		}
		else {
			System.out.println("Look! A wild deer has appeared!");
		}
		
		System.out.println("What to do...");
		System.out.println("1. Slash 'em!");
		System.out.println("2. Ask for the bear's help!");
		
		int action = s.nextInt();
		
		if(action == 1){
			System.out.println("Nice slashing! You killed it!");
		}
		else if(action == 2){
			System.out.println("Mauled into little pieces. Nice going, bear!");
		}
		else {
			System.out.println("Eh?");
		}
		
		
		
	}
	

}
