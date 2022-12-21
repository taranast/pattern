package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
public class LogDecorator extends Decorator{
    public LogDecorator(Collection col) {
        super(col);
    }
    @Override
    public boolean isEmpty()
    {
        long start = System.currentTimeMillis();
        logInFile(start, "isEmpty", col.hashCode());
        return col.isEmpty();
    }
    @Override
    public boolean add(Object e)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "add", col.hashCode());
        return col.add(e);
    }
    @Override
    public boolean addAll(Collection c)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "addAll", col.hashCode());
        return col.addAll(c);
    }
    @Override
    public void clear()
    {
        long start = System.currentTimeMillis();
        logInFile(start, "clear", col.hashCode());
        col.clear();
    }
    @Override
    public boolean equals(Object o)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "equals", col.hashCode());
        return col.equals(o);
    }
    @Override
    public boolean contains(Object o)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "contains", col.hashCode());
        return col.contains(o);
    }

    @Override
    public Iterator iterator() {
        long start = System.currentTimeMillis();
        logInFile(start, "iterator", col.hashCode());
        return col.iterator();
    }

    @Override
    public boolean containsAll(Collection c)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "containsAll", col.hashCode());
        return col.containsAll(c);
    }
    @Override
    public int hashCode()
    {
        long start = System.currentTimeMillis();
        logInFile(start, "hashCode", col.hashCode());
        return col.hashCode();
    }
    @Override
    public boolean remove(Object o)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "remove", col.hashCode());
        return col.remove(o);
    }
    @Override
    public boolean removeAll(Collection c)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "removeAll", col.hashCode());
        return col.removeAll(c);
    }
    @Override
    public boolean retainAll(Collection c)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "retainAll", col.hashCode());
        return col.retainAll(c);
    }
    @Override
    public int size()
    {
        long start = System.currentTimeMillis();
        logInFile(start, "size", col.hashCode());
        return col.size();
    }
    @Override
    public Object[] toArray()
    {
        long start = System.currentTimeMillis();
        logInFile(start, "toArray", col.hashCode());
        return col.toArray();
    }
    @Override
    public Object[] toArray(Object[] a)
    {
        long start = System.currentTimeMillis();
        logInFile(start, "toArray", col.hashCode());
        return col.toArray(a);
    }
    @Override
    public String toString()
    {
        long start = System.currentTimeMillis();
        logInFile(start, "toString", col.hashCode());
        return col.toString();
    }
    private void logInFile(long time, String name, int code)
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.append("Время выполнения, мс: " + time);
            writer.newLine();
            writer.append("Название: " + name);
            writer.newLine();
            writer.append("Хэш-код: " + code);
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
