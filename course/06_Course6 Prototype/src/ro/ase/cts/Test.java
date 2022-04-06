package ro.ase.cts;

import ro.ase.cts.prototype.Asteroid;
import ro.ase.cts.prototype.Model3D;
import ro.ase.cts.prototype.SpaceShip;
import ro.ase.cts.prototype.factory.PrototypeFactory;

public class Test {

	public static void main(String[] args) {
	
		SpaceShip spaceShip1 = new SpaceShip("Federation");
		//SpaceShip spaceShip2 = new SpaceShip("Federation");
		//SpaceShip spaceShip3 = new SpaceShip("Federation");
		
		//using the Prototype
		SpaceShip spaceShip2 = (SpaceShip) spaceShip1.clone();
		SpaceShip spaceShip3 = (SpaceShip) spaceShip1.clone();
		
		System.out.println("Done");
	}

}
