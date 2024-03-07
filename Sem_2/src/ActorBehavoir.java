public interface ActorBehavoir {
    /** Оформление заказа */
    public abstract void setMakeOrder(String consumer);

    /** Получение заказа */
    public abstract void setTakeOrder(String consumer);

    /**Статус заказа - сделал ли актор заказ*/
    public abstract boolean isMakeOrder(order);

    /**Статус получения - - получил ли актор заказ*/
    public abstract boolean isTakeOrder(order);
}
