// class Car
class Car {
	private String car_brand;
	private Engine engine;
	
	public Car(String brand, Engine engine) {
		this.car_brand = brand;
		this.engine = engine;
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

public class AssociationDemo {

	public static void main(String[] args) {
		Engine enginev8 = new Engine("BMW M622134","Aliminium", "Petrol");
		Car car_bmw = new Car("BMW",enginev8);
		
		System.out.println(car_bmw.getEngineModel() + " is the engine model!");

	}

}













