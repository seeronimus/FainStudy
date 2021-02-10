
public class Fish extends Pet {
	int currentDepth = 0;
	
	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
		System.out.println("Diving on " + howDeep + " feet.");
		System.out.println("I`m on " + currentDepth + " feet under the sea surface.");
		return currentDepth;
	}
	public String say(String something) {
		return "Fish don`t talk";
	}
	

}
