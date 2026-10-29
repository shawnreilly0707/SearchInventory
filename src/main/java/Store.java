import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    static void main() {
        ArrayList<Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.println("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        // this method loads product objects into inventory
        // and its details are not shown

        return inventory;
    }
}
