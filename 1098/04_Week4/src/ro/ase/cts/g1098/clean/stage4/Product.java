package ro.ase.cts.g1098.clean.stage4;


//stage 4
// use the received productType and not the generic enum symbol
// remove the switch because all branches do the same stuff (except NEW)

public class Product {
	
	static final int MAX_ACCOUNT_AGE = 10;
	static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {	
	    float finalPrice = 0;
	    float accountDiscount = 0;
	    
	    if(productType != ProductType.NEW) {
	    accountDiscount = 
	    		(accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT : (float)accountAgeInYears/100; 
	    }
	   
	    finalPrice = (initialPrice - (productType.getDiscount() * initialPrice)) - 
    			accountDiscount * (initialPrice - (productType.getDiscount() * initialPrice));
	    
	    return finalPrice;
	  }
}