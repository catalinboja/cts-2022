package ro.ase.csie.cts.g1098.design.patterns.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ro.ase.csie.cts.g1098.design.patterns.interfaces.WeaponInterface;

public class Superhero implements Cloneable{

	String name;
	boolean isPositive;
	int lifePoints;
	boolean isCriticalWounded;
	
	WeaponInterface leftHandWeapon;
	WeaponInterface rightHandWeapon;
	
	SuperPower superPower;
	SuperPower ultimatePower;
	

	ArrayList<Point3D> points = null;
	String modelFile;
	
	
	private Superhero() {
		
	}
	
	private Superhero(String fileName) {
		System.out.println("Opening file " + fileName);
		
		final int noPoints = 50;
		Random random = new Random();
		this.points = new ArrayList<>();
		this.modelFile = fileName;
		
		for(int i = 0; i < noPoints; i++) {
			this.points.add(
					new Point3D(
							random.nextInt(Point3D.LIMIT),
							random.nextInt(Point3D.LIMIT),
							random.nextInt(Point3D.LIMIT)
							));
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Model generated");
	}
	
	
	
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return new Superhero(this.modelFile);
		
		Superhero clone = new Superhero();
		clone.isCriticalWounded = this.isCriticalWounded;
		clone.isPositive = this.isPositive;
		clone.modelFile = this.modelFile;
		clone.points = (ArrayList<Point3D>) this.points.clone();
		clone.superPower = this.superPower;
		clone.ultimatePower = this.ultimatePower;
		if(this.leftHandWeapon != null)
			clone.leftHandWeapon = this.leftHandWeapon.clone();
		if(this.rightHandWeapon != null)
			clone.rightHandWeapon = this.rightHandWeapon.clone();
		return clone;
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



	private void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	


	private void setCriticalWounded() {
		this.isCriticalWounded = true;
	}



	private void setLeftHandWeapon(WeaponInterface leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}



	private void setRightHandWeapon(WeaponInterface rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}



	private void setSuperPower(SuperPower superPower) {
		this.superPower = superPower;
	}



	private void setUltimatePower(SuperPower ultimatePower) {
		this.ultimatePower = ultimatePower;
	}



	private void setPoints(ArrayList<Point3D> points) {
		//this.points = points; not OK
		this.points = (ArrayList<Point3D>) points.clone();
	}



	private void setModelFile(String modelFile) {
		this.modelFile = modelFile;
	}
	
	



	public static class SuperheroBuilder{
		private Superhero superhero;
		
		public SuperheroBuilder(String name, String modelFile) {
			this.superhero = new Superhero(modelFile);
			this.superhero.setName(name);				
		}
		
		public SuperheroBuilder setPositive() {
			this.superhero.setPositive();
			return this;
		}
		
		public SuperheroBuilder setCriticalWounded() {
			this.superhero.setCriticalWounded();
			return this;
		}
		
		public SuperheroBuilder setLifePoints(int points) {
			this.superhero.setLifePoints(points);
			return this;
		}
		
		public SuperheroBuilder setLeftHandWeapon(WeaponInterface weapon) {
			this.superhero.setLeftHandWeapon(weapon);
			return this;
		}
		
		public SuperheroBuilder setRightHandWeapon(WeaponInterface weapon) {
			this.superhero.setRightHandWeapon(weapon);
			return this;
		}
		
		public SuperheroBuilder setSuperPower(SuperPower power) {
			this.superhero.setSuperPower(power);
			return this;
		}
		
		public SuperheroBuilder setUltimatePower(SuperPower power) {
			this.superhero.setUltimatePower(power);
			return this;
		}
		
		public Superhero build() {
			return this.superhero;
		}
		
	}
	
}
