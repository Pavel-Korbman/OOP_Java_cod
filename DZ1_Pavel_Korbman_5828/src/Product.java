public abstract class Product {
    protected String name;
    protected int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public abstract int getTemperature();

    @Override
    public abstract String toString();

}
