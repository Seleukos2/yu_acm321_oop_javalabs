
public class ArrayDemo {

	public static void main(String[] args) {
		// String[] cars;
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		System.out.println(cars.length);
		
		String[] other_array = cars;
		
		cars[0] = "Tesla";
		
		System.out.println(other_array[0]);

	}

}
