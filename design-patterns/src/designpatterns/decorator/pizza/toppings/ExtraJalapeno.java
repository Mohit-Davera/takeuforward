package designpatterns.decorator.pizza.toppings;

import designpatterns.decorator.pizza.pizza.BasePizza;

public class ExtraJalapeno extends ToppingDecorator {

    public ExtraJalapeno(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public double getCost() {
        double cost = 30.0;
        return this.basePizza.getCost() + cost;
    }
}
