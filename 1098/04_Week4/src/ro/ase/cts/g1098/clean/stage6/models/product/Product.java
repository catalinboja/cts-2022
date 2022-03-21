package ro.ase.cts.g1098.clean.stage6.models.product;

import ro.ase.cts.g1098.clean.stage6.exceptions.MissingMarketingStrategyException;
import ro.ase.cts.g1098.clean.stage6.interfaces.MarketingStrategyInterface;
import ro.ase.cts.g1098.clean.stage6.models.marketing.AccountMarketingStrategy;

//stage 6
// SOLID - DIP Dependency inversion principle
// replace the AccountMarketingStrategy by a an interface type
// refactor the project structure

public class Product {
	
	MarketingStrategyInterface accountDiscountStrategy = null;
	
	
	public void setAccountDiscountStrategy(MarketingStrategyInterface accountDiscountStrategy) {
		if(accountDiscountStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
		this.accountDiscountStrategy = accountDiscountStrategy;
	}

	public float getPriceDiscount(float initialPrice, ProductType productType) {
		return initialPrice * productType.getDiscount();
	}
	
	public float getPriceWithDiscount(float initialPrice, ProductType productType) {
		return initialPrice - this.getPriceDiscount(initialPrice, productType);
	}
	
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {	
	    float finalPrice = 0;
	    float accountDiscount = 0;
	    
	    if(productType != ProductType.NEW) {
	    	if(this.accountDiscountStrategy == null) {
	    		throw new MissingMarketingStrategyException();
	    	}
	    	accountDiscount = accountDiscountStrategy.getAccountDiscount(accountAgeInYears);
	    }
	   
	    finalPrice = this.getPriceWithDiscount(initialPrice, productType) *(1 - accountDiscount);
	    
	    return finalPrice;
	  }
}