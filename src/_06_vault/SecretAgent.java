package _06_vault;

public class SecretAgent {

	public int findCode(Vault vault){
		
		for(int i = 999999; i<1000001; i++) {
			
			vault.tryCode(i);
	
			if (vault.tryCode(i) == true) {
				
				//System.out.println(i);
				return i; 
				
			} 
			
		}
		return -1;
		
	}
}

