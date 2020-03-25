
public class ArrayDefinition {

	public static void main(String[] args) {
		int[] values = {1,2,54,5,25,26,2,27,883,78};
		
		//int[] new_values = new Array[3]
		
		String[] market_basket = {"Egg","Milk","Danone","Gofret"};
		//travelling through in array
		
		for(int i=0; i<values.length; i++) {
			//System.out.println(values[i]);
		}
		
		for(int i=0; i<market_basket.length; i++) {
			//System.out.println(market_basket[i]);
		}
		//////////////////////////////////////////////
		
		for(int number : values) {
			System.out.println(number);
		}
		
		for(String item : market_basket) {
			System.out.println(item);
		}
		
		

	}

}
