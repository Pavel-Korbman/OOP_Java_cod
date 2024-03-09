public class Actor extends Market {
    //    protected String name;
//    protected boolean inMarket;
    protected boolean order;
    protected boolean inQueue;
    protected boolean orderGet;

    public Actor(String name) {
        super.name = name;
    }

    public String getName() {
        return name;
    }

//    public boolean isInMarket() {
//        return inMarket;
//    }

    public boolean getOrder() {
        return order;
    }

    public boolean isInQueue() {
        return inQueue;
    }

    public boolean isOrderGet() {
        return orderGet;
    }

//    public void setInMarket(boolean inMarket) {
//        this.inMarket = inMarket;
//    }

    public void setOrder(Boolean order) {
        this.order = order;
    }

    public void setInQueue(boolean inQueue) {
        this.inQueue = inQueue;
    }

    public void setOrderGet(boolean orderGet) {
        this.orderGet = orderGet;
    }

    @Override
    public String toString() {
        return "Actor{" +
                " '" + name + '\'' +
                ", заказ сделан= " + order +
                ", в очереди= " + inQueue +
                ", заказ получен= " + orderGet +
                '}';
    }
}