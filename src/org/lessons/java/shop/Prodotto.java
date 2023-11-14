package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
		Random rnd = new Random();

		
		protected int codice;
		protected String nome;
		protected String descrizione;
		protected float prezzo;
		protected int iva;
		
		Prodotto( String nome, String descrizione, float prezzo, int iva){
			
			setCodice(rnd.nextInt(9_999_999));
			setNome(nome);
			setDescrizione(descrizione);
			setPrezzo(prezzo);
			setIva(iva);
			
		}
		
		public int getCodice() {
			
			return this.codice;
		
		}
		
		
		private  void setCodice(int codice) {
			
			this.codice = codice;
		
		}
		

		public String getCodicePaddato() {
			
			
			String strCodice = String.valueOf(this.codice);
			String pad ="";
			for(int x =strCodice.length(); x<8; x++) {
				
				pad+="0";
				
			}
			
			String codicePaddato = pad + strCodice;
			
			return codicePaddato;
			
		}
		
		public String getNome() {
			
			return this.nome;
		}
		
		protected void setNome(String nome) {
			
			this.nome = nome;
		}
	
		
		public String getDescrizione() {
			
			return this.descrizione;
		}
		
		protected  void setDescrizione(String descrizione) {
			
			this.descrizione = descrizione;
		}
		
		public float getPrezzo() {
			
			return this.prezzo;
		}
		
		protected  void setPrezzo(float prezzo) {
			
			this.prezzo = prezzo;
		}
		
		public int getIva() {
			
			return this.iva;
		}
		
		protected  void setIva(int iva) {
			
			this.iva = iva;
		}
		
		public float getPrezzoIvato () {
			
			float prezzoIvato = this.prezzo + (this.prezzo * (this.iva / 100.0f));
			
			return prezzoIvato;
			
		}
		
		public float getPrezzoIvato (boolean fidelity) {
			
			float discountedPrice = (float) getPrezzoIvato() /100 *(100-2);
			return discountedPrice;
			
		}
		
		public String getCodiceENome() {
			
			String codiceENome = String.valueOf(this.codice) + "-" + this.nome;
			
			return codiceENome;
		}
		
		
		@Override
		public String toString() {
			
			return "[" + getCodiceENome() + "] " + getNome() + "\n"
					+ "prezzo: " + getPrezzo() + " --> " + getPrezzoIvato() + "\n"
					+ "iva: " + ((int) getIva()) + "%\n"
					+ "descrizione:\n" + getDescrizione();				
		}
		
		
	
		
		
		
		
	}
