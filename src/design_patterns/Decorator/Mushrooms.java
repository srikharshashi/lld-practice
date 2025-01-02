package design_patterns.Decorator;

public class Mushrooms extends ToppingDecorator  {
    
    BasePizza basePizza;

    Mushrooms(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost()+30;
    }
}
