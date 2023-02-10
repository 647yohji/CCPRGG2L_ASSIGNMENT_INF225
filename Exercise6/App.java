public class App {
    public static void main(String[] args) throws Exception {

        GroceryItem item1 = new GroceryItem();
        item1.name = "Shampoo";
        item1.showItemName();

        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.price = 100.00;
        item2.showItemName();
        
        GroceryItem item3 = new Toothpaste();
        item3.name = "Pepsodent";
        item3.price = 150.00;
        item3.showItemName();

        Cashier c1 = new Cashier();
        c1.checkout(item2);
        c1.showPrice(item2);
        c1.checkout(item3);
        c1.showPrice(item3);

        double total = item2.price + item3.price;

        System.out.println("Your total amounts to " + total);

        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
        }

        Dog wawa = new Dog();
        wawa.eat();

    }
}
