package ro.ase.csie.cts.g1099.design.patterns.interfaces;

public interface WeaponInterface extends Cloneable{
	
	public abstract void pewPew();
	public abstract void reload();
	public abstract WeaponInterface clone();

}
