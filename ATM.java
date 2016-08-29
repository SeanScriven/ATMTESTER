public class ATM {
	String	currency;
	int[] denom;
	int[] contents;
	
	public ATM(String currency, int[] denom){
		this.currency = currency;
		this.denom = denom;
		contents = new int[denom.length];
	}
	
	public void load(int amount, int note){
		for (int i = 0; i < denom.length; i++){
			if (denom[i] == note ){
				contents[i] += amount;
				return;
			}
		}
			
	}
	
	public void dispense(int amount, int note){
		for (int i = 0; i < denom.length; i++ ){
			if (denom[i] == note && contents[i] >= amount){
				contents[i] -= amount;
				return;
			}
		}
	}
	
	public int getQty(int note){
	
		for (int i = 0; i < denom.length; i++){
			if (denom[i] == note){
				return contents[i];
			}
		}
		return 0;
	}
	
	public int getTotal(){
		int total = 0;
		for (int i = 0; i < denom.length; i++){
			total = total + contents[i]*denom[i];
		}
		return total;
	}
	
	public String getCurrency(){
		return currency;
	}
	
	public String toString(){
		String sent = "";
		for(int i = 0; i < denom.length; i++){
			  sent = sent + contents[i] + " x " + currency + denom[i] + "; ";
		}
		return sent;
	}
	
}
