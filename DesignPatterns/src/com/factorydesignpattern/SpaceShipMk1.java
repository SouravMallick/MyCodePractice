package com.factorydesignpattern;

public class SpaceShipMk1 implements SpaceShip {
	private Engine engine;
	private Dish dish;
	
	public SpaceShipMk1(Engine engine,Dish dish){
		this.engine=engine;
		System.out.println("Mk1 Engine");
		
		this.dish=dish;
		System.out.println("Mk1 Dish");
	}

	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}

	
	public void setDish(Dish dish) {
		this.dish=dish;

	}

}
