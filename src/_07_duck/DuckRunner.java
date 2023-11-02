package _07_duck;

public class DuckRunner {

	public static void main(String[] args) {
		
		Duck daffy = new Duck("seeds",56);
		
		daffy.quack();
		daffy.waddle();
		
		Cephalopod seth = new Cephalopod(8, "crab", "Octopus");
		
		seth.grab();
		
	}
	
}
