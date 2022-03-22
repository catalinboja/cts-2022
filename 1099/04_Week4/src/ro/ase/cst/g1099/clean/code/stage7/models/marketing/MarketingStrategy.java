package ro.ase.cst.g1099.clean.code.stage7.models.marketing;

import ro.ase.cst.g1099.clean.code.stage7.interfaces.MarketingStrategyInterface;

public class MarketingStrategy implements MarketingStrategyInterface{
	
	public final static int PREMIUM_ACCOUNT_MIN_AGE = 10;
	public final static float PREMIUM_DISCOUNT = 0.15f;
	
	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > PREMIUM_ACCOUNT_MIN_AGE) ? 
				PREMIUM_DISCOUNT : (float)accountAgeInYears/100;
	}
}
