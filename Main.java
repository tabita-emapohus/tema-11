
public class Main {

	public static void main(String[] args) {
		WareHouse depo = new WareHouse();

		Product p1 = new Product("123","Painting",99.99,10);
		CompensatedProduct p2 = new CompensatedProduct("345","Ice Cream",5,30,0.9);
		depo.addProduct(p1);
		depo.addProduct(p2);
        
		depo.printInventory();

	}

}
