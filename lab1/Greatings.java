public class Greatings {
	public static void main(String[] args) {
	/*
	in eclipse, select the (run configuration/arguments option)
	in order to give parameters to main() function.
	*/
		String name = "-";
		String surname = "-";
		String org = "-";
		
		if(args.length > 0) {
			name = args[0];
			surname = args[1];
			org = args[2];
		}
		
		System.out.print("Welcome " + name + " " + surname + " " + org);

	}

}
