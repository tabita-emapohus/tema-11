import java.util.ArrayList;

public class WareHouse {

	ArrayList<Product> products = new ArrayList<>();
	public WareHouse () {
        products = new ArrayList<>();
    }
	 public void addProduct(Product product) {
	        for (Product t : products) {
	            if (t.getCode() == product.getCode()) {
	                t.setQuantity(t.getQuantity() + product.getQuantity());
	                return;
	            }
	        }
	        products.add(product);
	    }
	 public void printInventory() {
	        for (Product x : products) {
	        	System.out.println("Cod:" + x.getCode() + " Nume:" + x.getName() + " Pret:" + x.getBasePrice() + " Cantitate:" + x.getQuantity());
	        }
         }
}
