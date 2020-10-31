package com.giris.main;

import java.util.Scanner;

import com.giris.main.math.Matematik;
import com.giris.main.person.Person;

public class Application {

	static int sayi1 = 4;
	static int sayi2 = 5;

	public static void main(String[] args) {
		
		Person  salesPerson = new Person("Ali", "Veli", "Satis", 32);
		Person  engineerPerson = new Person("Ayse", "Fatma", "Muhendislik", 23);
		salesPerson.defineYourSelf();
		engineerPerson.defineYourSelf();
		
		salesPerson.setName("Mehmet");
		salesPerson.defineYourSelf();
		
		
		
		
		
		
		
		
		
		/*Matematik math = new Matematik("Basic Math-1");
		int sonuc = math.toplama(sayi1, sayi2);
		math.show(sonuc);*/

	}
}
