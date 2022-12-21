package org.example;

public class Employee implements Observer
{
    private String name;

    public Employee(String name, Observable o) {
        this.name = name;
        o.registerObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил сообщение: " + message);
    }
}
