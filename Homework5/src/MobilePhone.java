class SimCard {
	private  String type;
	
	//SimCard constructor
	public SimCard(String type) {
		this.type = type;
	}
	
	//type getter
	public String get_type() {
		return this.type;
	}
}

class SdCard {
	private  String brand;
	private int memory;
	private String size_type;
	
}

class Screen {
	private String resolution;
	
	//Screen constructor
	public Screen(String resolution) {
		this.resolution = resolution;
	}
	
	//resolution getter
	public String get_resolution() {
		return this.resolution;
	}
	
}

class Battery {
	private String name;
	private String capacity;
	
	//Battery constructor
	public Battery(String name, String capacity) {
		//fill the ???
		
		//this.name = ????
		//this.capacity = ?????
	}
	
}

public class MobilePhone {
	private String brand;
	private  boolean is_wifi;
	public SimCard simcard;
	public Screen screen;
	
	//composition relation with Battery, fill the ???
	
	//public Battery battery = new Battery("liquid", "????");
	
	//MobilePhone constructor
	public MobilePhone(String brand, boolean is_wifi){
		this.brand = brand;
		this.is_wifi = is_wifi;
	}
	
	//brand getter
	public String get_brand() {
		return this.brand;
	}
	
	
	//simcard getter
	public SimCard get_simcard() {
		return this.simcard;
	}
	
	//simcard setter
	public void set_simcard(SimCard simcard) {
		this.simcard = simcard;
	}
	
	//screen getter
	public Screen get_screen() {
		return this.screen;
	}
	//screen setter
	public void set_screen(Screen screen) {
		this.screen = screen;
	}
	
	
	public static void main(String[] args) {
		MobilePhone my_iphone = new MobilePhone("Apple", true);
		SimCard simcard1 = new SimCard("micro");
		Screen touchscreen = new Screen("375x812");
		
		my_iphone.set_simcard(simcard1);
		my_iphone.set_screen(touchscreen);
		
		System.out.println(my_iphone.get_brand());
		
		System.out.println(my_iphone.get_simcard().get_type());
		System.out.println(my_iphone.get_screen().get_resolution());
		
		//print here what is the battery name of my_iphone.
		//System.out.println(?????)
	}

}
