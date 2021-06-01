package com.factorydesignpattern;

public class SpaceShipManufacturer {

	public static void main(String[] args) {
		SpaceShipFactory factory=new SpaceShipFactory();
		
		Engine engine1= new Engine("Mk1");
		Dish dish1= new Dish("Mk1");
		
		Engine engine2= new Engine("Mk2");
		Dish dish2= new Dish("Mk2");
		
		SpaceShip spaceShipmk1= factory.getSpaceShip(engine1, dish1);
		SpaceShip spaceShipmk2= factory.getSpaceShip(engine2, dish2);

	}

}
