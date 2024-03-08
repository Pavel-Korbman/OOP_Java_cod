public abstract class Actor implements ActorBehaviour {
    protected String name;



     public boolean isMakeOrder(Human human){
        if (human.readyMake) return true;
        else {
            System.out.println(human.getName() + ", Подтвердите готовность оформить заказ");
            return false;
        }
    }


     public boolean isTakeOrder(Human human){
        if (human.readyTake) return true;
        else {
            System.out.println(human.getName() + ", Подтвердите готовность получить заказ");
            return false;
        }
    }

    public abstract String getName();

}
