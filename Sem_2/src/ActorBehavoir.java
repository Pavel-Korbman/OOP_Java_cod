public interface ActorBehavoir {
    /** Готовность сделать заказ */
    public abstract void setMakeOrder();

    /** Готовность забрать заказ */
    public abstract void setTakeOrder();

    /**Заказ оформлен*/
    abstract void isMakeOrder(Human human);

    /**Заказ получен*/
    abstract void isTakeOrder(Human human);
}
