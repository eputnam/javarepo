package beargame;

public abstract class Player_Base {
	
	int playerhp;
	String playername;
	
	Player_Base(int h, String n){
		playerhp = h;
		playername = n;
	}
	
	public abstract void Menu(int doorchoice);
	public abstract void Attack(int doorchoice);
	public abstract void Escape(int doorchoice);
	public abstract void Special(int doorchoice);
	public abstract void Help(int doorchoice);
	
}
