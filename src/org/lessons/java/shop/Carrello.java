package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean stop = false;
		
		Prodotto[] carrello = new Prodotto[100];
		
		float totalPrice = 0f;
		
		int x = 0;
		
		System.out.println("hai la carta fedeltà? (y/n)");
		String strFidelity = in.nextLine();
		boolean fidelity=strFidelity.toLowerCase().equals("y")? true : false;
		
		
		do{
			System.out.println("cosa vuoi inserire?"
					+ "\n 1. Smartphone"
					+ "\n 2. Television"
					+ "\n 3. Headphones");
			
			String userChoice = in.nextLine();
			
			if(Integer.valueOf(userChoice) > 0 && Integer.valueOf(userChoice) <= 3) {
				
					String chosenProduct = Integer.valueOf(userChoice)>1? (Integer.valueOf(userChoice)>2? "headphones" : "television") :"smartphone" ;
					System.out.println("hai scelto " + chosenProduct );
					
					System.out.println("come si chiama il tuo prodotto " + chosenProduct + " ?");
					String nome = in.nextLine();
					
					System.out.println("imposta una descrizione");
					String descrizione = in.nextLine();
					
					System.out.println("imposta un prezzo");
					String strPrezzo = in.nextLine();
					float prezzo = Float.valueOf(strPrezzo);
					
					System.out.println("imposta l'iva");
					String strIva = in.nextLine();
					int iva = Integer.valueOf(strIva);
					
				if(Integer.valueOf(userChoice) == 1) {
					
					System.out.println("imposta l'imei");
					String imei = in.nextLine();
					
					System.out.println("imposta la memoria");
					String strStorageSize = in.nextLine();
					int storageSize = Integer.valueOf(strStorageSize);
					
					carrello[x] = new Smartphone(nome, descrizione, prezzo, iva, imei, storageSize);
					x++;
				}
				
				
				else if(Integer.valueOf(userChoice) == 2) {
					
					System.out.println("imposta la dimensione");
					String strSize = in.nextLine();
					int size = Integer.valueOf(strSize);
					
					System.out.println("è una smartTV (y/n)");
					String strSmartTV = in.nextLine();
					boolean smartTV=strSmartTV.toLowerCase().equals("y")? true : false;
			
					
					carrello[x] = new Television(nome, descrizione, prezzo, iva, size, smartTV);
					x++;
				}
				
				else if(Integer.valueOf(userChoice) == 3) {
					
					System.out.println("imposta il colore");
					String color = in.nextLine();
					
					
					System.out.println("sono cablate? (y/n)");
					String strWired = in.nextLine();
					boolean wired=strWired.toLowerCase().equals("y")? true : false;
					
					
					carrello[x] = new Headphones(nome, descrizione, prezzo, iva, color, wired);
					x++;
				}
				
			}
			
			else {
				
				System.out.println("Selezione non valida, riprova");
				continue;
			}
			
		System.out.println("vuoi proseguire ? (y/n)");
		String keepGoing=in.nextLine();
			
		stop = keepGoing.toLowerCase().equals("y")? false : true;
		
		}while(!stop && carrello.length > x);

		in.close();
		
		for(int y = 0; y<carrello.length;y++) {
			
			if (carrello[y] != null) {
				
				System.out.println(carrello[y].toString());
				float unitCost = 0;
				
				if(fidelity) {
					
					unitCost = carrello[y].getPrezzoIvato(fidelity);
					System.out.println("costo unitario + sconto " + String.format("%.02f", unitCost) + "\n*----------*");
				}
				
				else {
					
					unitCost = carrello[y].getPrezzoIvato();
					System.out.println("costo unitario " + String.format("%.02f", unitCost) + "\n*----------*");
					
				}
				
				totalPrice+=unitCost;
				
			}
			
		}
		System.out.println("il totale è :" + String.format("%.02f", totalPrice));
	}
	

}
