package design_patterns.Decorator;

public class ExtraCheeze extends ToppingDecorator  {
    
    BasePizza basePizza;

    ExtraCheeze(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost()+20;
    }
}
