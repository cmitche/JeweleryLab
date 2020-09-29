import java.util.ArrayList;
import java.util.Date;

public class Store {
    private String name;
    private String ownerName;
    ArrayList<Necklace> products;


    public Store(String name, String ownerName, ArrayList<Necklace> products) {
        this.name = name;
        this.ownerName = ownerName;
        this.products = products;
    }

    public int stockRemaining(ArrayList products){
        return products.size();
    }

    public void sell(int id){
        for(int index = 0; index < products.size(); index++) {
            if (products.get(index).getId() == id){
                products.remove(products.get(index));
            }
            else{}
        }
    }


    public void restock(ArrayList products){
        for(int index = 0; index <= 20; index++){
            if(products.size() < 20){
                products.add(new Necklace(1500.00, "Cuban Link Chain", index, new DateCreated(9, 19, 1980)));
            }
            else{}
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Necklace> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Necklace> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", products=" + products +
                '}';
    }
}
