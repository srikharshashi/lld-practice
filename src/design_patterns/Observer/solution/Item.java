package design_patterns.Observer.solution;


import java.util.*;

import design_patterns.Observer.solution.interfaces.IObservable;
import design_patterns.Observer.solution.interfaces.IObserver;

public class Item implements IObservable  {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Item(String name, int quantity,User user) {
        this.name = name;
        this.quantity = quantity;
        this.addObserver(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();   
    }

    @Override
    public void addObserver(IObserver<Item> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver<Item> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver<Item> observer: observers){
            observer.update(this);
        }
    }

    
}