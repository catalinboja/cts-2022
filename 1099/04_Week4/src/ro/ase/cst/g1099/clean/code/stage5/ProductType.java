package ro.ase.cst.g1099.clean.code.stage5;

public enum ProductType {
	NEW(1, 0.0f), NORMAL(2, 0.15f), ON_SALE(3, 0.25f), FINAL_SALE(4, 0.35f);

	int type;
	float discount;

	private ProductType(int type, float discount) {
		this.type = type;
		this.discount = discount;
	}

	public int getType() {
		return type;
	}

	public float getDiscount() {
		return discount;
	}

}
