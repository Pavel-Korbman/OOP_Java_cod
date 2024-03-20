package Service;

import ModelORdata.Orders;
import ModelORdata.Shwarma;

public class StoreService {
    private static Orders orders = new Orders();

    public static void addOrder(Shwarma shwarma){
        if (shwarma.getContains() == null| shwarma.getCost()<=0){
            System.out.println(("Некорректное имя или цена"));
        }else {
            orders.add(shwarma);
            System.out.println("добавили в onlineStore: "+ shwarma);
        }
    }

    public static void seeOrders(){
        if (orders != null){
            orders.getArrayList();
        }else {
            System.out.println("список заказов пуст");
        }
    }
}
