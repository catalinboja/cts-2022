package ro.ase.cts.g1098.clean.stage6.models.marketing;

import ro.ase.cts.g1098.clean.stage6.interfaces.MarketingStrategyInterface;

public class SummerAccountMarketingStrategy implements MarketingStrategyInterface{

	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return 0.2f;
	}

}
