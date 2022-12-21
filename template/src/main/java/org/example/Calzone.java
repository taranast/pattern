package org.example;

import java.util.List;

public class Calzone extends Pizzeria{
    @Override
    protected String selectOpenType() {
        return "Закрытая";
    }

    @Override
    protected String selectSpicyType() {
        return "Острая";
    }

    @Override
    protected String selectName() {
        return "Кальцоне";
    }

    @Override
    protected void addIngredients(List<String> ingredients) {
        ingredients.add("курица");
        ingredients.add("помидор");
        ingredients.add("лук");
        ingredients.add("моцарелла");
    }
}
