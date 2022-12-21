package org.example;

import java.util.List;

public class Hawaian extends Pizzeria{
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
        return "Гавайская пицца";
    }

    @Override
    protected void addIngredients(List<String> ingredients) {
        ingredients.add("ананасы");
        ingredients.add("ветчина");
        ingredients.add("красный лук");
        ingredients.add("твердый сыр");
    }
}
