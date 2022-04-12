package ro.ase.csie.cts.g1099.design.patterns.models;

import java.util.ArrayList;
import java.util.Random;

import ro.ase.csie.cts.g1099.design.patterns.interfaces.WeaponInterface;

public class Superhero3DModel implements Cloneable{

	String name;
	boolean isPositive;
	boolean isCriticalWounded;
	
	int lifepoints;
	
	WeaponInterface leftHandWeapon;
	WeaponInterface rightHandWeapon;
	
	SuperPower superPower;
	SuperPower ultimatePower;
	
	String modelFileName;
	ArrayList<Point3D> points;
	
	private Superhero3DModel(String name, String modelFile) {
		//we read the file and we create the points list
		System.out.println("Loading the model file ...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		Random random = new Random();
		int noPoints = random.nextInt(1000);
		
		this.points = new ArrayList<>(noPoints);
		
		for(int i = 0; i < noPoints; i++) {
			points.add(new Point3D(
					random.nextInt(Point3D.LIMIT),
					random.nextInt(Point3D.LIMIT),
					random.nextInt(Point3D.LIMIT)
					));
		}
	}
	
	private Superhero3DModel() {
	}

	@Override
	public Object clone()  {
		
		//it's a mistake
		//Superhero3DModel copy = new Superhero3DModel(this.name, this.modelFileName);
		
		Superhero3DModel copy = new Superhero3DModel();
		copy.name = this.name;
		copy.isPositive = this.isPositive;
		copy.isCriticalWounded = this.isCriticalWounded;
		copy.lifepoints = this.lifepoints;
		
		//copy.points = this.points;
		copy.points = (ArrayList<Point3D>) this.points.clone();
		
		copy.leftHandWeapon = this.leftHandWeapon.clone();
		copy.rightHandWeapon = this.rightHandWeapon.clone();
		
		return copy;
		
	}
	
	
	
	private void setName(String name) {
		this.name = name;
	}

	private void setPositive() {
		this.isPositive = true;
	}
	
	private void setNegative() {
		this.isPositive = false;
	}

	private void setCriticalWounded() {
		this.isCriticalWounded = true;
	}

	private void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}

	private void setLeftHandWeapon(WeaponInterface leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon.clone();
	}

	private void setRightHandWeapon(WeaponInterface rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon.clone();
	}

	private void setSuperPower(SuperPower superPower) {
		this.superPower = superPower;
	}

	private void setUltimatePower(SuperPower ultimatePower) {
		this.ultimatePower = ultimatePower;
	}



	public static class SuperheroBuilder {
		
		private Superhero3DModel superhero;
		
		public SuperheroBuilder(String name, String fileName) {
			this.superhero = new Superhero3DModel(name, fileName);
		}
		
		public SuperheroBuilder setPozitive() {
			this.superhero.setPositive();
			return this;
		}
		
		public SuperheroBuilder setCriticalWounded() {
			this.superhero.setCriticalWounded();
			return this;
		}
		
		//the other methods for lifepoints, weapons, super powers
		
		public SuperheroBuilder setRightHandWeapon(WeaponInterface weapon) {
			this.superhero.setRightHandWeapon(weapon);
			return this;
		}
		
		public SuperheroBuilder setLeftHandWeapon(WeaponInterface weapon) {
			this.superhero.setLeftHandWeapon(weapon);
			return this;
		}
		
		public SuperheroBuilder setSuperPower(SuperPower superPower) {
			this.superhero.setSuperPower(superPower);
			return this;
		}
		
		public SuperheroBuilder setUltimatePower(SuperPower ultimatePower) {
			this.superhero.setUltimatePower(ultimatePower);
			return this;
		}
		
		public Superhero3DModel build() {
			return this.superhero;
		}
		
	}
	
	
	
	
}
