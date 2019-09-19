import java.util.Comparator;


class Dog extends Animal{
	
	String name;
	int numLegs;
	
	public Dog(String dogName, int dogLegs) {
		name = dogName;
		numLegs = dogLegs;
	}
	
	@Override
	public String toString() {
		return name + ": " + numLegs + ", ";
		
	}
	
	//class AnimalCompare implements Comparator<Dog>
	
public class AnimalCompare implements Comparator<Animal>{

	@Override
	public int compare(Animal d1, Animal d2) {
		int result = d1.name.compareToIgnoreCase(d2.name);
		if(result > 0) {
			result = 1;
		}
		if(result < 0) {
			result = -1;
		}
		else if (result == 0) {  //if names are equal, compare legs next
			if(d1.numLegs > d2.numLegs) {
				result = 1;
			}
			if(d1.numLegs < d2.numLegs) {
				result = -1;
			}
			else if(d1.numLegs == d2.numLegs) {
				result = 0;
			}
			return result;
		}
		return result;
	}
	
}
}