import java.util.Arrays;

public class MissingInArray {

	public static void main(String[] args) {
		int n = 10;
		int result_should_be = (n * (n+1)) / 2;
		
		int[] values = {1,6,3,2,5,10,7,4,9};
		
		int total = 0;
		for(int i = 0; i < values.length; i++) {
			total += values[i];
		}
		
		int missing = result_should_be - total;
		System.out.print(missing);
		
		
		//Exercise 2
		/*
		int[] org = new int[] {1, 2 ,3}; 
        System.out.println("Original Array"); 
        for (int i = 0; i < org.length; i++) 
            System.out.print(org[i] + " "); 
  
        // copying array org to copy 
        int[] copy = Arrays.copyOf(org, 6); 

  
        System.out.println("\nNew array copy after modifications:"); 
        for (int i = 0; i < copy.length; i++) 
            System.out.print(copy[i] + " "); 
            */

	}

}
