package com.coreSpring.ci;

public class Person {
	private int id;
	private String name;
	private Certificate certificate;
	public Person(int id, String name,Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.certificate=certificate;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certificate=" + certificate + "]";
	}
	

}
