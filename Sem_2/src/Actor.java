public abstract class Actor implements ActorBehavoir {



    public void isMakeOrder(Human human){
        human.orderMake = true;
        System.out.println(human.getName() + ", Ваш заказ оформлен");
    }


    public void isTakeOrder(Human human){
        human.orderTake = true;
        System.out.println(human.getName() + ", Заказ получен");
    }


}
