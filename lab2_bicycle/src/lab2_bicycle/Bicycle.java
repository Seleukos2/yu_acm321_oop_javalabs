package lab2_bicycle;

public class Bicycle {
	 // the Bicycle class has
    // three fields
    public String brand;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(String startBrand, int startSpeed, int startGear) {
        gear = startGear;
        brand = startBrand;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setBrand(String newValue) {
        brand = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1 = new Bicycle("Bianchi",1,0);
		Bicycle bike2 = new Bicycle("Flying Scot",1,0);
		
		bike1.setBrand("Pacific Cycle");
		//bike1.speed = 10;
		System.out.println(bike1.brand);
	}

}
