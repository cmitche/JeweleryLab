import java.util.ArrayList;

public class Pandora {
    public static void main(String[] args) {
        DateCreated dateCreated = new DateCreated(9,19,1950);
        Necklace necklace = new Necklace(15.00, "Shiny Necklace", 1, dateCreated);
        ArrayList<Necklace> jeweleryBox = new ArrayList<>();
        Store Pandora = new Store("Fire and Desire", "Rick James", jeweleryBox);

        //Print out the store name.
        System.out.println("Store Name: " + Pandora.getName());

        //Print out the owner name;
        System.out.println("Store owner: " + Pandora.getOwnerName());


        //Fill up the store.
        Pandora.restock(jeweleryBox);

        //Check the number of products.
        System.out.println("Check number of products.");
        System.out.println(Pandora.getProducts());

        //Sell items from the store.
        System.out.println("\n" + "Customer bought chain #2.");
        Pandora.sell(2);
        System.out.println("Customer bought chain #3.");
        Pandora.sell(3);

        //Check to see how many items there are.
        System.out.println("\n" + "Chains remaining: " + Pandora.stockRemaining(jeweleryBox));

        //Restock the store to full capacity.
        System.out.println("\n" + "*Restock chains*");
        Pandora.restock(jeweleryBox);

        //Check to see how many items there are.
        System.out.println("\n" + "Chains remaining: " + Pandora.stockRemaining(jeweleryBox));
    }
}
