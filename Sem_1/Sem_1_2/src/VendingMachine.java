

public class VendingMachine extends Product  {
    public void getProduct(String name) {
        System.out.println(products.get(name));
    }
    public void getAll() {
        System.out.println(products);
    }
}
