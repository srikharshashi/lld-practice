package design_patterns.Observer.solution.interfaces;
import java.util.*;

import design_patterns.Observer.solution.Item;

public interface IObservable {
    List<IObserver<Item>> observers = new ArrayList<>();
    void addObserver(IObserver<Item> observer);
    void removeObserver(IObserver<Item> observer);
    void notifyObservers();
}
