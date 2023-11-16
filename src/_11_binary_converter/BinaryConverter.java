package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	public static void main(String[] args) {
		
		new BinaryConverter().run();
		
	}
	
	JTextField input = new JTextField(20);
	
	JLabel output = new JLabel();
	
	JFrame frame = new JFrame("Convert 8 bits of binary to ASCII");
	
	public void run() {
		
		
		frame.setVisible(true);
		
		JButton button = new JButton("convert");
		
		button.addActionListener(this);
		
		
		
		JPanel panel = new JPanel();
		
		panel.add(input);
		
		panel.add(button);
		
		
		frame.add(panel);
		
		
		
		panel.add(output);
		
		
		frame.pack();
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String binary = convert(input.getText());
		output.setText(binary);
		frame.pack();
	}
	
}
