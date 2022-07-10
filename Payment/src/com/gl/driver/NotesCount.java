package com.gl.driver;

public class NotesCount {
	
	public static void notesCountImplementation(int currency[], int amount) {// 50,100,10, amount = 100
		int [] noteCounter = new int[currency.length];
		
		try {
			for(int i=0;i<currency.length;i++) {
				
				if(amount >= currency[i]) {
					noteCounter[i] = amount / currency[i];
					amount = amount  - noteCounter[i]*currency[i];
				}
			}
			
			if(amount>0) {
				System.out.println("Denomination value given is higher");
			}
			else {
				System.out.println("Payment is above the order");
			}
			
			for(int i=0;i<currency.length;i++) {
				if(noteCounter[i] !=0) {
					System.out.println(currency[i] + ":" + noteCounter[i]);
				}
			}
			
		}
		catch(Exception ex) {
			System.out.println("Exception " + ex);
		}
		
		
	}

}
