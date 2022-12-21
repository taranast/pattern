package org.example;

import java.util.List;

public class Pepperoni extends Pizzeria{
    @Override
    protected String selectOpenType() {
        return "Открытая";
    }

    @Override
    protected String selectSpicyType() {
        return "Острая";
    }

    @Override
    protected String selectName() {
        return "Пепперони";
    }

    @Override
    protected void addIngredients(List<String> ingredients) {
        ingredients.add("салями");
        ingredients.add("хамон");
        ingredients.add("моцарелла");
    }
}
