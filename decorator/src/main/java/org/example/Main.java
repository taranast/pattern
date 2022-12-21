package org.example;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> de = new LogDecorator(new ArrayList<Integer>());
        de.add(6);
        de.add(7);
    }
}