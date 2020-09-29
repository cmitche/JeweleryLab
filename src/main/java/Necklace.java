public class Necklace {
    private double price;
    private String name;
    private int id;
    DateCreated dateCreated;

    public Necklace(double price, String name, int id, DateCreated dateCreated) {
        this.price = price;
        this.name = name;
        this.id = id;
        this.dateCreated = dateCreated;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateCreated getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(DateCreated dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
