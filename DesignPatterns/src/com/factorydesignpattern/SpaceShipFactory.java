package com.factorydesignpattern;

public class SpaceShipFactory {

	public static SpaceShip getSpaceShip(Engine engine,Dish dish){
		
		if(engine.getModel().equalsIgnoreCase("Mk1") 
				&& dish.getModel().equalsIgnoreCase("Mk1")){
			return new SpaceShipMk1(engine,dish);
		}else if(engine.getModel().equalsIgnoreCase("Mk2") 
				&& dish.getModel().equalsIgnoreCase("Mk2")){
			return new SpaceShipMk2(engine,dish);
		}else{
			System.out.println("Incomaptible model");
		}
		return null;
	}
}
