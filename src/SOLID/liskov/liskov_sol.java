package SOLID.liskov;

// Solution to Lisok Substitution Principle
// Create a superclass with all the common methods and then create subclasses with their own methods

interface Vehicle{
    int getNumberOfWheels();
    boolean hasEngine();
}

class MyVehicle implements Vehicle{
    @Override
    public int getNumberOfWheels() {
        return 2;
    }

    @Override
    public boolean hasEngine() {
        return false;
    }
}


//A motor cycle already has 2 wheels so incomplete implementation of getNumberOfWheels is not a problem
class MotorCycle extends MyVehicle{

    @Override
    public boolean hasEngine() {
        return true;
    }
}


//A car has 4 wheels so getNumberOfWheels is implemented (overrided) in the Car class
class Car extends MyVehicle{
    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public boolean hasEngine() {
        return true;
    }
}

