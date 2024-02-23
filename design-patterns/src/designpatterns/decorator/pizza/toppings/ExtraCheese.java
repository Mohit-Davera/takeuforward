package designpatterns.decorator.pizza.toppings;

import designpatterns.decorator.pizza.pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public double getCost() {
        double cost = 50.0;
        return this.basePizza.getCost() + cost;
    }
}
