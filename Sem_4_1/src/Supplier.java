public class Supplier {
    protected String name;
    protected double rating;

    public Supplier(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public Supplier() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "поставщик: '" + name + '\'' +
                ", рейтинг" + rating + '}';
    }
}
