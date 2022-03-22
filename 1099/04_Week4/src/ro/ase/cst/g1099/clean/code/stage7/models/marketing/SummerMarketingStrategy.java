package ro.ase.cst.g1099.clean.code.stage7.models.marketing;

import ro.ase.cst.g1099.clean.code.stage7.interfaces.MarketingStrategyInterface;

public class SummerMarketingStrategy implements MarketingStrategyInterface{

	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return 0.3f;
	}

}
