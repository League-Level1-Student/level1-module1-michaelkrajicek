package _07_duck;

public class DuckRunner {

	public static void main(String[] args) {
		
		Duck daffy = new Duck("seeds",56);
		Cephalopod seth = new Cephalopod(8, "crab", "Octopus");
		
		daffy.quack();
		daffy.waddle();
		daffy.greet(seth);
		
		
		
		seth.grab();
		
	}
	
}
