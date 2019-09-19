import java.util.*; 

class Animal{
	
	String name;
	int numLegs;
	
	//getter
	public String getName() {
		return name;
	}
	
	public int getLegs() {
		return numLegs;
	}
	
	//setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setLegs(int newLegs) {
		this.numLegs = newLegs;
	}
	
}