package designpatterns.decorator.pizza;

import designpatterns.decorator.pizza.pizza.BasePizza;
import designpatterns.decorator.pizza.pizza.FarmHouse;
import designpatterns.decorator.pizza.toppings.ExtraCheese;
import designpatterns.decorator.pizza.toppings.ExtraJalapeno;
import designpatterns.decorator.pizza.toppings.ExtraVeggies;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new FarmHouse();
        basePizza = new ExtraCheese(basePizza);
        basePizza = new ExtraJalapeno(basePizza);
        basePizza = new ExtraVeggies(basePizza);

        System.out.println(basePizza.getCost());
    }
}
