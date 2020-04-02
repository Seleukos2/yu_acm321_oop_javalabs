package lab7;

public class Animal {
    
    // the Animal class has three fields
    private boolean vegetarian;
    private int number_of_legs;
		private String habitat;
        
    // the Aniamal class has one constructor
    public Animal(boolean vegetarian, int number_of_legs, String habitat) {
				this.vegetarian = vegetarian;
				this.number_of_legs = number_of_legs;
				this.habitat = habitat;
    }

    // the Animal class has three set methods
    public void setVegeratian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
        
    public void setNumberofLegs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }
        
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
        
    // the Animal class has three get methods
    public boolean getVegeratian() {
        return this.vegetarian;
    }
        
    public int getNumberofLegs() {
        return this.number_of_legs;
    }
        
    public String getHabitat() {
        return this.habitat;
    }
    
    public void talk() {
    	System.out.println(this.toString());
    }
        
}