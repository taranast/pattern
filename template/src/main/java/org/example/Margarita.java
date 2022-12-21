package org.example;

import java.util.ArrayList;
import java.util.List;

public class Margarita extends Pizzeria{

    @Override
    protected String selectOpenType() {
        return "Открытая";
    }

    @Override
    protected String selectSpicyType() {
        return "Не острая";
    }

    @Override
    protected String selectName() {
        return "Маргарита";
    }

    @Override
    protected void addIngredients(List<String> ingredients) {
        ingredients.add("помидоры");
        ingredients.add("моцарелла");
        ingredients.add("базилик");
    }
}
