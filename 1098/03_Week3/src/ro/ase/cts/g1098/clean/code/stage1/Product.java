package ro.ase.cts.g1098.clean.code.stage1;


//stage 1
// - naming conventions
// - magic numbers (constant values in the source code)

public class Product {
	
	static final int TYPE_NEW = 1;
	static final int TYPE_PROMOTION = 2;
	static final int TYPE_SALES = 3;
	static final int TYPE_FINAL_SALES = 4;
	static final int MAX_ACCOUNT_AGE = 10;
	static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	static final float PROMOTION_DISCOUNT = 0.1f;
	static final float SALES_DISCOUNT = 0.25f;
	static final float FINAL_SALES_DISCOUNT = 0.35f;
	
	
	public float computeFinalPrice(int productType, float initialPrice, int accountAgeInYears)
	  {	
	    float finalPrice = 0;
	    float accountDiscount = 
	    		(accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT : (float)accountAgeInYears/100; 
	    if (productType == TYPE_NEW)
	    {
	      finalPrice = initialPrice;
	    }
	    else if (productType == TYPE_PROMOTION)
	    {
	      finalPrice = (initialPrice - (PROMOTION_DISCOUNT * initialPrice)) - accountDiscount * (initialPrice - (PROMOTION_DISCOUNT * initialPrice));
	    }
	    else if (productType == TYPE_SALES)
	    {
	      finalPrice = (initialPrice - (SALES_DISCOUNT * initialPrice)) - accountDiscount * (initialPrice - (SALES_DISCOUNT * initialPrice));
	    }
	    else if (productType == TYPE_FINAL_SALES)
	    {
	      finalPrice = (initialPrice - (FINAL_SALES_DISCOUNT * initialPrice)) - accountDiscount * (initialPrice - (FINAL_SALES_DISCOUNT * initialPrice));
	    }
	    return finalPrice;
	  }
}