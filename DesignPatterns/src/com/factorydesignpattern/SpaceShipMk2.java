package com.factorydesignpattern;

public class SpaceShipMk2 implements SpaceShip {
	private Engine engine;
	private Dish dish;
	
	public SpaceShipMk2(Engine engine,Dish dish){
			this.engine=engine;
			System.out.println("Mk2 Engine");
			
			this.dish=dish;
			System.out.println("Mk2 Dish");		
	}

	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}

	
	public void setDish(Dish dish) {
		this.dish=dish;

	}

}
