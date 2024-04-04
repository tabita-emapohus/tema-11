
public class Product {

	private String code;
	private String name;
	private double basePrice;
	private int quantity;
	
	public Product(String code2, String name, double basePrice, int quantity) {
		this.code = code2;
		this.name = name;
		this.basePrice = basePrice;
		this.quantity = quantity;
		
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
