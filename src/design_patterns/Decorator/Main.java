package design_patterns.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("In this class we can have marghareta pizze with mushrooms and cheeze");
        BasePizza basePizza = new Mushrooms(new ExtraCheeze( new Marghareta())); 
        System.out.println("The cost is "+basePizza.cost());
    }
}
