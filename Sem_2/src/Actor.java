public abstract class Actor {
    /** Покупатель - тот, кто оформил заказ в setMakeOrder */
    protected String name;

    protected abstract String getName(String humanName);
    protected boolean isMakeOrder(int order){
        return ;
    }
    protected boolean isTakeOrder(int order){
        return ;
    }


}
