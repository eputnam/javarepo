package beargame;

//import java.util.Scanner;

public class Tools {
	
	public boolean IsString(String n){
		
		if(n.matches("[a-zA-Z]+$")){
			return true;
		}
		else {
			return false;
		}

	}
	
//	public String NameChoice(){
//		Scanner t = new Scanner(System.in);
//		String namechoice;
//		
//		System.out.println("What do you want to name your character?");
//		namechoice = t.nextLine();
//		
//		t.close();
//		
//		return namechoice;
//		}
//		
//	public boolean CheckName(String name){
//		
//		if(IsString(name)){
//			return true;
//		}else
//			return false;
//	}
}
