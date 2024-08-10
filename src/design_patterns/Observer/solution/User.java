package design_patterns.Observer.solution;

import java.util.*;

import design_patterns.Observer.solution.interfaces.IObserver;
public class User implements IObserver<Item> {
    private String name;
    private List<Item> watchingList;
    private Set<Item> items;

    public User(String name) {
        this.name = name;
        this.watchingList = new ArrayList<>();
        this.items = new HashSet<>();
    }

    public void addToWatchList(Item item) {
        watchingList.add(item);
    }
    
    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void update(Item item) {
         if(items.contains(item)){
            if(item.getQuantity() >0){
                System.out.println("This Item is Back in Stock: " + item.getName());
            }
        }
    }

    public void checkout(){
        for(Item item: items){
            if(item.getQuantity() <= 0){
                System.out.println("Item: " + item.getName() + " is not available for purchase");
            }
        }
    }
}
