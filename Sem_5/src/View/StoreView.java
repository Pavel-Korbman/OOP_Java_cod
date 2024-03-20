package View;
import Controller.OnlineStoreController;
import ModelORdata.Shwarma;

public class StoreView {
    private OnlineStoreController onlineStoreController;

    public StoreView() {
        this.onlineStoreController = new OnlineStoreController();
    }

    public void addOrder(Shwarma shwarma){
        onlineStoreController.addOrder(shwarma);
    }

    public void showOrders(){onlineStoreController.seeOrders();}

    @Override
    public String toString() {
        return "StoreView{" +
                "onlineStoreController=" + onlineStoreController +
                '}';
    }
}
