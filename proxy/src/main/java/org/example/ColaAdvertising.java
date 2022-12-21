package org.example;
import java.util.List;

public class ColaAdvertising implements Advertising{
int count = 0;
    @Override
    public void showAd() {
        System.out.println("Реклама колы");
        count++;
    }
    @Override
    public void writeCount()
    {
        System.out.println(count);
        count = 0;
    }

}
