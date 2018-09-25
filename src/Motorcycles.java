
public class Motorcycles {
	//instance variables
	private String make; // brand
	private String model; // model
	private int ccs; // engine displacement
	
	//methods
	//constructor I. no parameters provided
	public Motorcycles(){
		make = "unknown";
		model = "unknown";
		ccs = 250;
	}
	// constructor II. parameters provided
	public Motorcycles(String make, String model, int ccs){
		this.make = make;
		this.model = model;
		this.ccs = ccs;
	}
	// getter methods
	public String getMake(){
		return make;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getCcs(){
		return ccs;
	}
	
	public String toString (){
		return this. make + " " + model + " with a "+ ccs + "cc engine";
	}
}

