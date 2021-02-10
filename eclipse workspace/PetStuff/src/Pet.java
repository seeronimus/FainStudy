
public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	final public void sleep() {
		System.out.println("Good night, see you tomorrow!");
	}
	
	public void eat() {
		System.out.println("I am so hungry, lets eat chips!");
	}
	
	public String say(String aWord) {
		String petResponse = "Ok!! " + aWord;
		return petResponse;
	}
	
	

}
