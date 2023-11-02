package _06_vault;

import javax.swing.JOptionPane;

public class VaultRunner {

	public static void main(String[] args) {
		
		Vault vualt = new Vault();
		//vualt.tryCode(0);
		System.out.println(vualt.tryCode(0));
		
		SecretAgent agent = new SecretAgent();
		int foundCode = agent.findCode(vualt);
		
		if (foundCode >= 0) {
			System.out.println("The agent discovered the code is " + foundCode);
		} else {
			System.out.println("The agent did not discover the code");
		}
		
		

		
		
	}
	
}
