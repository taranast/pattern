package org.example;

import java.util.List;

public class Focaccia extends Pizzeria {
    @Override
    protected String selectOpenType() {
        return "Закрытая";
    }

    @Override
    protected String selectSpicyType() {
        return "Не острая";
    }

    @Override
    protected String selectName() {
        return "Фокачча";
    }

    @Override
    protected void addIngredients(List<String> ingredients) {
        ingredients.add("колбаса «Мортаделла»");
        ingredients.add("плавленный сыр");
        ingredients.add("розмарин");
    }
}