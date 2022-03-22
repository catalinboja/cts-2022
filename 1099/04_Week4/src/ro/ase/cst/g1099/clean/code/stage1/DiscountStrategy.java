package ro.ase.cst.g1099.clean.code.stage1;

//stage 1 
// - refactor it by using a proper naming convention
// - remove "magic" numbers 

public class DiscountStrategy {
	
	public final static int PREMIUM_ACCOUNT_MIN_AGE = 10;
	public final static float PREMIUM_DISCOUNT = 0.15f;
	
	public final static int NEW_PRODUCT_TYPE = 1;
	public final static int NORMAL_PRODUCT_TYPE = 2;
	public final static int ON_SALE_PRODUCT_TYPE = 3;
	public final static int ON_FINAL_SALE_PRODUCT_TYPE = 4;
	
	public final static float NEW_PRODUCT_DISCOUNT = 0.0f;
	public final static float NORMAL_PRODUCT_DISCOUNT = 0.1f;
	public final static float ON_SALE_DISCOUNT = 0.25f;
	public final static float ON_FINAL_SALE_DISCOUNT = 0.35f;
	
	public float getFinalPrice(int productType, float productPrice, int accountAgeInYears)
	  {
		
		//final float newProductDiscount = 0.1f;
		
		
	    float finalPrice = 0;
	    float accountDiscount = 
	    		(accountAgeInYears > PREMIUM_ACCOUNT_MIN_AGE) ? PREMIUM_DISCOUNT : (float)accountAgeInYears/100; 
	    
	    if (productType == NEW_PRODUCT_TYPE)
	    {
	      finalPrice = productPrice;
	    }
	    else if (productType == NORMAL_PRODUCT_TYPE)
	    {
	      finalPrice = (productPrice - (NORMAL_PRODUCT_DISCOUNT * productPrice)) - 
	    		  accountDiscount * (productPrice - (NORMAL_PRODUCT_DISCOUNT * productPrice));
	    }
	    else if (productType == ON_SALE_PRODUCT_TYPE)
	    {
	      finalPrice = (productPrice - (ON_SALE_DISCOUNT * productPrice)) - 
	    		  accountDiscount * (productPrice - (ON_SALE_DISCOUNT * productPrice));
	    }
	    else if (productType == ON_FINAL_SALE_PRODUCT_TYPE)
	    {
	      finalPrice = (productPrice - (ON_FINAL_SALE_DISCOUNT * productPrice)) - 
	    		  accountDiscount * (productPrice - (ON_FINAL_SALE_DISCOUNT * productPrice));
	    }
	    return finalPrice;
	  }
}