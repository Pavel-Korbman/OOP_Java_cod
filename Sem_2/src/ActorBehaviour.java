public interface ActorBehaviour {
    /**
     * Статус оформления заказа
     * @param readyMake
     * @param orderMake
     */
    public abstract void setMakeOrder(boolean readyMake, boolean orderMake);

    /**
     * Статус получения заказа
     * @param readyTake
     * @param orderTake
     */
    public abstract void setTakeOrder(boolean readyTake, boolean orderTake);

    /**
     * Заказ оформлен
     * @param human
     * @return
     */
    abstract boolean isMakeOrder(Human human);

    /**
     * Заказ получен
     * @param human
     * @return
     */
    abstract boolean isTakeOrder(Human human);

}
