public class Cashier {
    
    public void checkout(GroceryItem item) {
        System.out.println("You have bought " + item.name);
    }


    public void showPrice(GroceryItem item) {
        System.out.println("This item amounts to: " + item.price);
    }

}
