package ro.ase.cst.g1099.clean.code.stage4;

//stage 4 
// - remove the switch by writing the first case using the same pattern as the others

public class DiscountStrategy {
	
	public final static int PREMIUM_ACCOUNT_MIN_AGE = 10;
	public final static float PREMIUM_DISCOUNT = 0.15f;
	
	public float getFinalPrice(ProductType productType, float productPrice, int accountAgeInYears)
	  {
		
	    float finalPrice = 0;
	    float accountDiscount = 0;
	    
	    if(productType != ProductType.NEW) {
	    	accountDiscount = 
	    		(accountAgeInYears > PREMIUM_ACCOUNT_MIN_AGE) ? PREMIUM_DISCOUNT : (float)accountAgeInYears/100; 
	    }
	    
		finalPrice = (productPrice - (productType.getDiscount() * productPrice)) - 
	    		  accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
	    
	    return finalPrice;
	  }
}