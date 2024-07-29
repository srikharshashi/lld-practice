package SOLID.interface_seg;

// Interface Segregation Principle
// A client (ex:class) should never be forced to implement an interface that it does not use
// interfaces must be designed in such a way that the classes that implement them do not have to implement methods that they do not use

interface RestaurantEmployee{
    void washDishes();
    void serveCustomers();
    void cookFood();
}

class Waiter implements RestaurantEmployee{

    @Override
    public void washDishes() {
        //not waiters job really
        throw new UnsupportedOperationException("Waiter cannot wash dishes");
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers");
    }

    @Override
    public void cookFood() {
        throw new UnsupportedOperationException("Waiter cannot cook food");
    }
}

//Interface Segmentation Principle can be implemented by breaking down the interface into smaller interfaces
//This way, the classes that implement the interface can implement only the methods that they need

interface DishWasher{
    void washDishes();
}

interface waiter{
    void serveCustomers();
}

interface Chef{
    void cookFood();
}

