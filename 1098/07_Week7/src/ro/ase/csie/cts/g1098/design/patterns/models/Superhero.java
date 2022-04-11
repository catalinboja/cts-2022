package ro.ase.csie.cts.g1098.design.patterns.models;

import java.util.List;

import ro.ase.csie.cts.g1098.design.patterns.interfaces.WeaponInterface;

public class Superhero {

	String name;
	boolean isPositive;
	int lifePoints;
	boolean isCriticalWounded;
	
	WeaponInterface leftHandWeapon;
	WeaponInterface rightHandWeapon;
	
	SuperPower superPower;
	SuperPower ultimatePower;
	

	List<Point3D> points = null;
	
}
