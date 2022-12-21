package org.example;
import java.util.ArrayList;
import java.util.List;

public class Service implements Observable{
    private List<Observer> Employees;
    private String Messages;

    public Service() {
        Employees = new ArrayList<>();
    }

    public void setMessage(String message) {
        this.Messages = message;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        Employees.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        Employees.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : Employees)
            o.update(Messages);
    }
}