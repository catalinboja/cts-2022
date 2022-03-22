package ro.ase.cst.g1099.clean.code.stage7.models;

import ro.ase.cst.g1099.clean.code.stage6.exceptions.MissingMarketingStrategyException;
import ro.ase.cst.g1099.clean.code.stage7.interfaces.MarketingStrategyInterface;
import ro.ase.cst.g1099.clean.code.stage7.models.marketing.MarketingStrategy;

//stage 7 
// - Dependency Inversion Principle - DIP
// - remove the dependency on the MarketingStrategy class

public class DiscountStrategy {
	
	//dip
	MarketingStrategyInterface marketingStrategy;
	
	
	//dependency injection by constructor
	public DiscountStrategy(MarketingStrategyInterface marketingStrategy) {
		super();
		if(marketingStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
		this.marketingStrategy = marketingStrategy;
	}
	
	public DiscountStrategy() {
		
	}
	
	
	//dependency injection by a set method
	public void setMarketingStrategy(MarketingStrategyInterface marketingStrategy) {
		if(marketingStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
		this.marketingStrategy = marketingStrategy;
	}



	public float getDiscountValue(ProductType productType, float productPrice) {
		return productType.getDiscount() * productPrice;
	}
	
	public float getPriceWithDiscount(ProductType productType, float productPrice) {
		return productPrice - this.getDiscountValue(productType, productPrice);
	}
	
	public float getFinalPrice(ProductType productType, float productPrice, int accountAgeInYears)
	  {
		if(this.marketingStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
			
	    float accountDiscount = (productType != ProductType.NEW) ? 
	    		marketingStrategy.getAccountDiscount(accountAgeInYears) : 0;
	      
	    float finalPrice = this.getPriceWithDiscount(productType, productPrice) *(1 - accountDiscount);
	    	    
	    return finalPrice;
	  }
}