package org.example;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String Open;
        String Spicy;
        String Name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Открытая или закрытая пицца: ");
        Open = scanner.next();
        System.out.print("Острая или не острая пицца: ");
        Spicy = scanner.next();
        System.out.print("Название пиццы: ");
        Name = scanner.next();
        Pizzeria pizza;
        if (Open.equals("Открытая") && Spicy.equals("Не острая") && Name.equals("Маргарита")) {
            pizza = new Margarita();
            System.out.println(pizza.createPizza().toString());
        }
        if (Open.equals("Открытая") && Spicy.equals("Острая") && Name.equals("Пепперони")) {
            pizza = new Pepperoni();
            System.out.println(pizza.createPizza().toString());
        }
        if (Open.equals("Открытая") && Spicy.equals("Не острая") && Name.equals("Гавайская пицца")) {
            pizza = new Hawaian();
            System.out.println(pizza.createPizza().toString());
        }
        if (Open.equals("Закрытая") && Spicy.equals("Острая") && Name.equals("Кальцоне")) {
            pizza = new Calzone();
            System.out.println(pizza.createPizza().toString());
        }
        if (Open.equals("Закрытая") && Spicy.equals("Не острая") && Name.equals("Фокачча")) {
            pizza = new Focaccia();
            System.out.println(pizza.createPizza().toString());
        }
        if (Open.equals("Закрытая") && Spicy.equals("Острая") && Name.equals("Пицца с брынзой")) {
            pizza = new Brynza();
            System.out.println(pizza.createPizza().toString());
        }
    }
}