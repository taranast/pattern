package org.example;

import java.util.List;

public abstract class Pizzeria {
    public final Pizza createPizza()
    {
        Pizza pizza = new Pizza();
        pizza.Open = selectOpenType();
        pizza.Spicy = selectSpicyType();
        pizza.Name = selectName();
        addIngredients(pizza.Ingredients);
        return pizza;
    }
    protected abstract String selectOpenType();
    protected abstract String selectSpicyType();
    protected abstract String selectName();

    protected void addIngredients(List<String> ingredients) {}
}
