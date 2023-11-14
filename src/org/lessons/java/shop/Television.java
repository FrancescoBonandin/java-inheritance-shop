package org.lessons.java.shop;

public class Television extends Prodotto {
	
	private int size;
	
	private boolean smartTV;
	
	Television( String nome, String descrizione, float prezzo, int iva, int size, boolean smartTV) {
		
		super( nome, descrizione, prezzo, iva);
		setSize(size);
		setSmartTV(smartTV);
		
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	private void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	
	@Override
	public float getPrezzoIvato (boolean fidelity) {
		
		if(!isSmartTV()) {
			
			float discountedPrice = (float) super.getPrezzoIvato()/100*(100-10);
			return discountedPrice;
		}
		
		else return super.getPrezzoIvato(fidelity);
		
	}
	

	@Override
	public String toString() {
		
		return 	super.toString()
				+ "\nSize: " + getSize()
				+ "\nSmartTV: " + (isSmartTV()? "yes": "no") ;
	}
	
}
