public class Operators {
  public static void main(String[] args) {
	//equal sign is assignment
    int x = 15;
    int y = 3;
    //addition
    System.out.print("addition:");
    System.out.println(x + y);
    
    //subtraction
    System.out.print("subtraction:");
    System.out.println(x - y);
    
    //multiplication
    System.out.print("multiplication:");
    System.out.println(x * y);
    
    //division
    System.out.print("division:");
    System.out.println(x / y);
    
    //modules
    System.out.print("division:");
    System.out.println(x / y);
    
    ++x;
    System.out.println("x is equal:  "+x);
    
    --y;
    System.out.println("y is equal:  "+y);
    
    //comparison
    System.out.println(x == y);
    
    //and operator logical
    System.out.println(x > 3 && y > 10);
    
    //or operator logical
    System.out.println(x > 3 || y > 10);
  }
}

