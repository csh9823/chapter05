package com.javaex.ex05;

public class Person {
	
	//필드
	private String name;
	private String hp;
	private String company;
	
	
	
	//생성자
	
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}



	public Person() {
		
	}



	public String getName() {
		return name;
	}



	public String getHp() {
		return hp;
	}



	public String getCompany() {
		return company;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setHp(String hp) {
		this.hp = hp;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	
	
	
	
	//메소드
}
