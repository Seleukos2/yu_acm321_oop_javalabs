// class Car
class Car {
	private String car_brand;
	private Engine engine;

	public Car(String brand, String model, String material, String fuel_type) {
		this.car_brand = brand;
		this.engine = new Engine(model, material, fuel_type);
	}

	public String getCarBrand() {
		return this.car_brand;
	}
	
	public String getEngineModel() {
		return this.engine.getModel();
	}
}

//There is a relationship between Engine Class and Car Class

//Engine Class
class Engine {
	private String model;
	private String material;
	private String fuel_type;
 
	public Engine(String model, String material, String fuel_type) {
		this.model = model;
		this.material = material;
		this.fuel_type = fuel_type;
	}

	public String getModel() {
		return this.model;
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		Car car_bmw = new Car("BMW", "V8", "Aliminium", "Petrol");
		
		System.out.println(car_bmw.getEngineModel() + " is the engine model!");
	}
}



