package com.coreSpring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [name=" + name + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("starting");
	}
	@PreDestroy
	public void end() {
		System.out.println("ending");
	}
}
