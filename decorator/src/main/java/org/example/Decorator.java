package org.example;
import java.util.Collection;

public abstract class Decorator implements Collection{
    protected Collection col;
    public Decorator(Collection Col)
    {
        this.col = Col;
    }
    public boolean isEmpty()
    {
        return col.isEmpty();
    }
    public boolean add(Object e)
    {
        return col.add(e);
    }
    public boolean addAll(Collection c)
    {
        return col.addAll(c);
    }
    public void clear()
    {
        col.clear();
    }
    public boolean equals(Object o)
    {
        return col.equals(o);
    }
    public boolean contains(Object o)
    {
        return col.contains(o);
    }
    public boolean containsAll(Collection c)
    {
        return col.containsAll(c);
    }
    public int hashCode()
    {
        return col.hashCode();
    }
    public boolean remove(Object o)
    {
        return col.remove(o);
    }
    public boolean removeAll(Collection c)
    {
        return col.removeAll(c);
    }
    public boolean retainAll(Collection c)
    {
        return col.retainAll(c);
    }
    public int size()
    {
        return col.size();
    }
    public Object[] toArray()
    {
        return col.toArray();
    }
    public Object[] toArray(Object[] a)
    {
        return col.toArray(a);
    }
    public String toString()
    {
        return col.toString();
    }
}
