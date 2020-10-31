package com.giris.main.math;

public class Matematik {
	private String name;
	
	public Matematik (String name){
		this.name = name;
	}
	public int toplama(int sayi1, int sayi2){
		int sonuc = sayi1 + sayi2;
		return sonuc;
		
	}
	public void show(int sonuc) {
		System.out.println("Sonuc Degeri: " + sonuc);
	}

}
