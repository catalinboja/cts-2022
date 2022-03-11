package ro.ase.cts.g1098.clean.stage3;


//stage 3
// clean the if - then - else structure

public class Product {
	
	static final int MAX_ACCOUNT_AGE = 10;
	static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
	  {	
	    float finalPrice = 0;
	    float accountDiscount = 
	    		(accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_ACCOUNT_DISCOUNT : (float)accountAgeInYears/100; 
	   
	    switch(productType) {
	    	case NEW:
	    		finalPrice = initialPrice;
	    		break;
	    	case DISCOUNT:
	    		finalPrice = (initialPrice - (ProductType.DISCOUNT.getDiscount() * initialPrice)) - 
	    			accountDiscount * (initialPrice - (ProductType.DISCOUNT.getDiscount() * initialPrice));
	    		break;
	    	case SALES:
	    		finalPrice = (initialPrice - (ProductType.SALES.getDiscount() * initialPrice)) - 
	    			accountDiscount * (initialPrice - (ProductType.SALES.getDiscount() * initialPrice));
	    		break;
	    	case FINAL_SALES:
	    		finalPrice = (initialPrice - (ProductType.FINAL_SALES.getDiscount() * initialPrice)) - 
	    			accountDiscount * (initialPrice - (ProductType.FINAL_SALES.getDiscount() * initialPrice));
	    		break;
	    	default:
	    		throw new UnsupportedOperationException();
	    }
	    
	    return finalPrice;
	  }
}