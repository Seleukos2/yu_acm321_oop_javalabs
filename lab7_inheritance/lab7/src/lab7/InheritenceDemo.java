package lab7;

public class InheritenceDemo {

	public static void main(String[] args) {

		Animal animal_obj = new Animal(false, 2, "Land");
		
		//pigeon means guvercin
		Bird pigeon = new Bird(true, 2, "Air", "Grey", 97);
		
		animal_obj.talk();
		
		pigeon.talk();

	}

}
