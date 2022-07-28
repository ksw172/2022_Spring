package com.example;

public class RegisterDTO {
	private String id;
	private String name;
	private String pass;
	private int age;
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public RegisterDTO(String id, String name, String pass, int age) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.age = age;
	}


	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", name=" + name + ", pass=" + pass + ", age=" + age + "]";
	}
	
	
}
