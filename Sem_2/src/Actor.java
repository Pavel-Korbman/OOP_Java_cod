public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean orderMake;
    protected boolean readyTake;
    protected boolean orderTake;


    public boolean isMakeOrder(Human human){
        if (human.readyMake) return true;
        else {
            System.out.println(name + ", Подтвердите готовность оформить заказ");
            return false;
        }
    }


     public boolean isTakeOrder(Human human){
        if (human.readyTake) return true;
        else {
            System.out.println(name + ", Подтвердите готовность получить заказ");
            return false;
        }
    }

    public abstract String getName();
    public abstract boolean isReadyMake();
    public abstract boolean isOrderMake();
    public abstract boolean isReadyTake();
    public abstract boolean isOrderTake();


}
