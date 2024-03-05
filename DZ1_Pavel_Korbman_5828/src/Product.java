public abstract class Product {
    protected String name;
    protected int volume;
    protected Double cost;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public Double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public abstract int getTemperature();
    @Override
    public abstract String toString();

}
