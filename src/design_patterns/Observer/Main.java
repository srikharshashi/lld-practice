package design_patterns.Observer;

import design_patterns.Observer.solution.Item;
import design_patterns.Observer.solution.User;

public class Main {
    public static void main(String[] args) {
        
        //extract all item objects seperatley and then pass them to the addItem method of ecommerce object
        User user1 = new User("Shashi");

        Item item1 = new Item("Bread", 10,user1);
        Item item2 = new Item("Butter", 5);
        Item item3 = new Item("Cheese", 3);
        user1.addItem(item1);
        user1.addItem(item2);
        item1.setQuantity(0);
        user1.checkout();
        //butter is not available for purchase
        user1.addToWatchList(item1);
        item1.setQuantity(10);
        


    }
}
