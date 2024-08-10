package design_patterns.Observer.solution.interfaces;

public interface IObserver<T> {
    void update(T obj);
}