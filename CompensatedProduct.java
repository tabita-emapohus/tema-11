
public class CompensatedProduct extends Product {

	private double coefficient;

	public CompensatedProduct(String code, String name, double basePrice, int quantity, double coefficient) {
		super(code, name, basePrice, quantity);
		this.coefficient = coefficient;
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}
	public double getFinalPrice() {
		return getBasePrice() * coefficient;
	}
}
