package org.example;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public String Name;
    public List<String> Ingredients = new ArrayList<>();

    public String Open;
    public String Spicy;
    @Override
    public String toString()
    {
        String pizza = "Название пиццы: "+Name+"\n"+Open+"\n"+Spicy+"\n"+"Ингредиенты: ";
        for (int i = 0; i<Ingredients.size(); i++)
            pizza = pizza+Ingredients.get(i)+" ";
        return pizza;
    }
}
