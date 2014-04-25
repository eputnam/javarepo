package beargame;

public abstract class Villain_Base {

	static int villainhp;
	int vtype;
	
	Villain_Base(int h){
		villainhp = h;
	}
	
	public abstract void attack();
	public abstract void heal();
	
	
}
