package com.giris.main.person;

public class Person {
	private String name;
	private String lastName;
	private String department;
	private int age;
	
	public Person(String name, String lastName, String department, int age ){
		this.name = name;
		this.lastName = lastName;
		this.department = department;
		this.age = age;
		
			
	}
	
	public void defineYourSelf(){
		String description = "Isim: " + name;
		description += " Soyisim: " + lastName;
		description += " Departman: " + department;
		description += " Yasi: " + age;
		System.out.println(description);
		
	}
	public void sayHello(){
		System.out.println("Merhaba!");
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	}
	

	
