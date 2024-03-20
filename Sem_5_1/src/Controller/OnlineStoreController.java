package Controller;

import Service.StoreService;
import ModelORdata.Shwarma;

public class OnlineStoreController {
    public OnlineStoreController() {
    }

    public void addOrder(Shwarma shwarma){
        StoreService.addOrder(shwarma);
    }

    public void seeOrders(){
        StoreService.seeOrders();
    }
}

