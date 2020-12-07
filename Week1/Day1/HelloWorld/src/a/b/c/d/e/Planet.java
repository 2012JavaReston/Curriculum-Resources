package a.b.c.d.e;

public class Planet {

	public String name;
	public boolean rings;
	public double mass;
	
	//I want to be able to create a new instance of planet with specific attribute values. 
	public Planet(String name, boolean rings , double superMass) { //This is a constructor, this is what allocates space in the memory to create an instance. 
		
		//When I use the "this" keyword, I'm talking aout variables that belong to the object - lines 5-7
		//If I don't use the "this" keyword, it will reference the method scope. 
		
		this.name = name;
		this.rings = rings;
		this.mass = superMass;
		
	}
	
	public Planet() {
		
	}
	
	public void orbit(String randomValue, double randomDouble) {
		
		
		System.out.println(randomValue);
	}
	
	
}
