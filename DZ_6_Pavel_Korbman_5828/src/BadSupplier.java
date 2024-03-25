/**
 * Переносим все поля в модули более низкого уровня (из Supplier в BadSupplier) ,
 * тогда мы сможем создавать и выводить поставщиков с разными полями
 * Dependency inversion principle, Liskov substitution principle
 */
public class BadSupplier extends Supplier {
protected String name;
    protected double rating;

    public BadSupplier(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
    public String toString() {
        return "поставщик: '" + name + '\'' +
                ", рейтинг" + rating + '}';
    }
}
