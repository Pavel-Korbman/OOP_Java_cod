public class Tomatoes extends Product{
    public Tomatoes(String name, double cost, int quantity) {
        super(name, cost, quantity);
    }
    @Override
    public String toString() {
        return name + '\'' +
                ", цена(руб/кг): " + cost +
                ", количество(кг): " + quantity +
                '}';
    }
}
