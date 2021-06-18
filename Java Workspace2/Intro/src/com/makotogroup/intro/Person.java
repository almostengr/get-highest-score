package com.makotogroup.intro;

import java.util.Locale;
import java.util.logging.Logger;

public class Person {
	
	// private String name;
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight; 
	private String eyeColor;
	private String gender;
	
	public Person(){
		// do nothing
	} // end public Person()
	
	
	
	public Person(String name, int age, int height, int weight, String eyeColor, String gender){
		this.name = name;
		this.age = age; 
		this.height = height; 
		this.weight = weight; 
		this.eyeColor = eyeColor;
		this.gender = gender;
	} // end public Person(String name, int age, int height, int weight, String eyeColor, String gender)
	
	public static void main(String args[]){
		Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
		
		Logger l = Logger.getLogger(Person.class.getName());
		
		l.info("Name: " + p.getName());
		l.info("Age: " + p.getAge());
		l.info("Height (cm): " + p.getAge());
		l.info("Weight (kg): " + p.getHeight());
		l.info("Eye Color: " + p.getEyeColor());
		l.info("Gender: " + p.getGender());
	} // end public static void main(String args[])



	public String getName() {
		// return name;
		return firstName.concat(" ").concat(lastName);
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getHeight() {
		int ret = height;
		
		// if locale of computer is US
		if (Locale.getDefault().equals(Locale.US)){
			ret /= 2.54;
		}
		// return height;
		return ret;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public String getEyeColor() {
		return eyeColor;
	}



	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
} // end public class Person
