package ro.ase.cst.g1099.clean.code.stage5;

//stage 5 
// - Single Responsibility
// - split the method into multiple simple & stupid methods

public class DiscountStrategy {
	
	public final static int PREMIUM_ACCOUNT_MIN_AGE = 10;
	public final static float PREMIUM_DISCOUNT = 0.15f;
	
	public float getAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > PREMIUM_ACCOUNT_MIN_AGE) ? 
				PREMIUM_DISCOUNT : (float)accountAgeInYears/100;
	}
	
	public float getDiscountValue(ProductType productType, float productPrice) {
		return productType.getDiscount() * productPrice;
	}
	
	public float getPriceWithDiscount(ProductType productType, float productPrice) {
		return productPrice - this.getDiscountValue(productType, productPrice);
	}
	
	public float getFinalPrice(ProductType productType, float productPrice, int accountAgeInYears)
	  {
			
	    float accountDiscount = (productType != ProductType.NEW) ? 
	    		this.getAccountDiscount(accountAgeInYears) : 0;
	      
	    float finalPrice = this.getPriceWithDiscount(productType, productPrice) *(1 - accountDiscount);
	    	    
	    return finalPrice;
	  }
}