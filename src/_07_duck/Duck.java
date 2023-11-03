package _07_duck;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	void quack() {
		System.out.println("The duck quacks about "+favoriteFood);
	}
	void waddle() {
		System.out.println("The duck waddles towards his " + numberOfFriends + " friend(s).");
	}
	
	void greet(Cephalopod pod) {
		System.out.println("The duck says hi to the " + pod.typeOfAnimal);
	}
	
}

class Cephalopod {
	
	int numberOfTenticles;
	String favoriteFood;
	String typeOfAnimal;
	
	Cephalopod(int numberOfTenticles, String favoriteFood, String typeOfAnimal){
		
		this.numberOfTenticles = numberOfTenticles;
		this.favoriteFood = favoriteFood;
		this.typeOfAnimal = typeOfAnimal;
	}
	
	void grab() {
		System.out.println("The " + typeOfAnimal + " grabs the " + favoriteFood + " with its " + numberOfTenticles + " tenticles to eat for dinner.");
	}
	

	
}
