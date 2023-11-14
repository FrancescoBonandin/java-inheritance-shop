package org.lessons.java.shop;

public class Headphones extends Prodotto {
	
	private String color;
	
	private boolean wired;
	
	Headphones(String nome, String descrizione, float prezzo, int iva, String color, boolean wired ){
		
		super(nome, descrizione, prezzo, iva);
		setColor(color);
		setWired(wired);
		
	}

	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public boolean isWired() {
		return wired;
	}

	private void setWired(boolean wired) {
		this.wired = wired;
	}
	
	@Override
	public float getPrezzoIvato (boolean fidelity) {
		
		if(isWired()) {
			
			float discountedPrice = (float) super.getPrezzoIvato()/100*(100-7);
			return discountedPrice;
		}
		
		else return super.getPrezzoIvato(fidelity);
		
	}
	
	@Override
	public String toString() {
		
		return 	super.toString()
				+ "\nSize: " + getColor()
				+ "\nWireless or Wired: " + (isWired()? "wired": "wireless")
				+ "\n*----------*";
	}
	
	
}
