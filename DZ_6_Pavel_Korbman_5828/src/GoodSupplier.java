/**
 * Переносим все поля в модули более низкого уровня (из Supplier в GoodSupplier),
 * тогда мы сможем создавать и выводить поставщиков с разными полями
 * Dependency inversion principle, Liskov substitution principle
 */
public class GoodSupplier extends Supplier {
    protected String name;
    protected double rating;

    public GoodSupplier(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
    public String toString() {
        return "поставщик: '" + name + '\'' +
                ", рейтинг" + rating + '}';
    }
}



