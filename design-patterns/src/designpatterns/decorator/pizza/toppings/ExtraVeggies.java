package designpatterns.decorator.pizza.toppings;

import designpatterns.decorator.pizza.pizza.BasePizza;

public class ExtraVeggies extends ToppingDecorator {

    public ExtraVeggies(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public double getCost() {
        double cost = 20.0;
        return this.basePizza.getCost() + cost;
    }
}
