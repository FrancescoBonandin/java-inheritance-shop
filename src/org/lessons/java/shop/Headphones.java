package org.lessons.java.shop;

public class Headphones extends Prodotto {
	
	private String color;
	
	private boolean wired;
	
	Headphones(String nome, String descrizione, float prezzo, int iva, String color, boolean wired){
		
		super(nome, descrizione, prezzo, iva);
		
	}
}
