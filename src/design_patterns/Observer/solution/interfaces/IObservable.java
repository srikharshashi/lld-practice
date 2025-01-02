package design_patterns.Observer.solution.interfaces;
import java.util.*;


public interface IObservable<T> {
    // List<IObserver<Item>> observers = new ArrayList<>();
    void addObserver(IObserver<T> observer);
    void removeObserver(IObserver<T> observer);
    void notifyObservers();
}
