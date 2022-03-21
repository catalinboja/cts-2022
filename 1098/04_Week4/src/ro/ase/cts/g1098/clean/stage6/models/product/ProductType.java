package ro.ase.cts.g1098.clean.stage6.models.product;

public enum ProductType {
	NEW(1, 0), DISCOUNT(2, 0.15f), SALES(3, 0.25f), FINAL_SALES(4, 0.35f);

	int id;
	float discountValue;

	private ProductType(int id, float discountValue) {
		this.id = id;
		this.discountValue = discountValue;
	}
	
	float getDiscount() {
		return this.discountValue;
	}
}
