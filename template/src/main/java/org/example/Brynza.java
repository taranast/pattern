package org.example;

import java.util.List;

public class Brynza extends Pizzeria {
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
        return "Пицца с брынзой";
    }

    @Override
    protected void addIngredients(List<String> ingredients) {
        ingredients.add("брынза");
        ingredients.add("помидоры");
        ingredients.add("базилик");
        ingredients.add("чеснок");
        ingredients.add("томатная паста");
    }
}