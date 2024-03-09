public class Actor extends Market {
    protected boolean order;
    protected boolean inQueue;
    protected boolean orderGet;

    protected Actor(String name) {
        super.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getOrder() {
        return order;
    }

    public boolean isInQueue() {
        return inQueue;
    }

    public boolean isOrderGet() {
        return orderGet;
    }

    public void setOrder(Boolean order) {
        this.order = order;
    }

    protected void setInQueue(boolean inQueue) {
        this.inQueue = inQueue;
    }

    protected void setOrderGet(boolean orderGet) {
        this.orderGet = orderGet;
    }

    @Override
    public String toString() {
        return name + "{" +
                ", заказ сделан= " + order +
                ", в очереди= " + inQueue +
                ", заказ получен= " + orderGet +
                '}';
    }
}