import Controller.OnlineStoreController;
import ModelORdata.Shwarma;
import View.StoreView;

public class Main {
    public static void main(String[] args) {
        StoreView storeView = new StoreView();
        System.out.println("/////////////////");
        storeView.addOrder(new Shwarma(1000, "Мясо"));
        storeView.showOrders();

        System.out.println();

    }
}