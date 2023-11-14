package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
		private	String imei;
		
		private int storageSize;
	
		Smartphone( String nome, String descrizione, float prezzo, int iva, String imei, int storageSize){
			
			super(nome, descrizione, prezzo, iva);
			setImei(imei);
			setStorageSize(storageSize);
			
		}

		public String getImei() {
			return imei;
		}

		private void setImei(String imei) {
			this.imei = imei;
		}

		public int getStorageSize() {
			return storageSize;
		}

		private void setStorageSize(int storageSize) {
			this.storageSize = storageSize;
		}
		
		@Override
		public String toString() {
			
			return 	super.toString()
					+ "\nimei: " + getImei()
					+ "\nstorage: " + getStorageSize() ;
		}
	
		

}
