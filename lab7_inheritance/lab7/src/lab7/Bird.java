package lab7;

public class Bird extends Animal {
    
    // the Bird subclass adds one field
    private String color;
		private int speed;

    // the Birds subclass has one constructor
    public Bird(boolean vegetarian,
				int number_of_legs,
                String habitat,
                String color,
                int speed) {
        super(vegetarian, number_of_legs, habitat);
        this.color = color;
		this.speed = speed;
    }   
        
    // the Bird subclass adds two set methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // the Bird subclass adds two get methods
    public String getColor() {
        return this.color;
    }

    public int getSpeed() {
        return this.speed;
    }
    
    public static void testClassMethod() {
    	System.out.println("The static method in Bird");
    }
    
    public void testInstanceMethod() {
    	System.out.println("The instance method in Bird");
    }
    
    @Override
    public void talk() {
    	System.out.println("Cik cik");
    }
    
    
    
    
}