public class Cofe extends Product {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", volume= " + volume +
                "мл"+ ", temperature= " +temperature + "гр}";
    }
}


