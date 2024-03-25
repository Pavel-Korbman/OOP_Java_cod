/**
 * Переносим все поля в модули более низкого уровня,
 * тогда мы сможем создавать и выводить продукты с разными полями
 * Dependency inversion principle Liskov substitution principle
 */
public class Tomatoes extends Product{
    protected String name;
    protected double cost;
    protected int quantity;

    public Tomatoes(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", цена(руб/кг): " + cost +
                ", количество(кг): " + quantity +
                '}';
    }
}
