package designpatterns.decorator.pizza.toppings;

import designpatterns.decorator.pizza.pizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
