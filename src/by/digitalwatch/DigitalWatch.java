package by.digitalwatch;

import by.watch.AbstractWatch;

import java.util.Date;

public class DigitalWatch extends AbstractWatch {

    @Override
    public void showTime() {
        System.out.println("digital watch " + new Date());
    }

    @Override
    protected void printSize() {
        System.out.println("digital watch S size");
    }

    void printColor() {
        System.out.println("digital watch color yellow");
    }
}
