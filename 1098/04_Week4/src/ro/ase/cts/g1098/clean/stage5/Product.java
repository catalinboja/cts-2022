package ro.ase.cts.g1098.clean.stage5;


//stage 5
// SOLID - Single Responsibility
// outsource the implementation of the account discount computation

public class Product {
	
	AccountMarketingStrategy accountDiscountStrategy = null;
	
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {	
	    float finalPrice = 0;
	    float accountDiscount = 0;
	    
	    if(productType != ProductType.NEW) {
	    	accountDiscount = accountDiscountStrategy.getAccountDiscount(accountAgeInYears);
	    }
	   
	    finalPrice = (initialPrice - (productType.getDiscount() * initialPrice)) - 
    			accountDiscount * (initialPrice - (productType.getDiscount() * initialPrice));
	    
	    return finalPrice;
	  }
}