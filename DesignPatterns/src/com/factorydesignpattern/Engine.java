package com.factorydesignpattern;

public class Engine {
	private String model;
	
	public Engine(String model){
		this.model=model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
