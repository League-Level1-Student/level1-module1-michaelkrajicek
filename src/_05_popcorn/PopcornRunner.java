package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {

	public static void main(String[] args) {

		

		String flavor = JOptionPane.showInputDialog("Popcorn flavor?");
		String time = JOptionPane.showInputDialog("Number of minutes in Microwave?");
		int intTime = Integer.parseInt(time);
		
		Microwave micro = new Microwave();
		Popcorn pop = new Popcorn(flavor);

		micro.putInMicrowave(pop);
		micro.setTime(intTime);
		micro.startMicrowave();
		
		

	}

}
