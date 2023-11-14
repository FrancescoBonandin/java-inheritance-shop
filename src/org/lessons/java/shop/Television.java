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
	
}
