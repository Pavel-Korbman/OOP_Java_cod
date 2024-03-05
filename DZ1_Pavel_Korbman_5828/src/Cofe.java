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
                "название='" + name + '\'' +
                ", объём= " + volume +
                "мл"+ ", температура= " +temperature + "°"+", цена= "+cost + "руб}";
    }
}


