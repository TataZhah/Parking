package by.watch;

import java.util.Date;

public class MechanicalWatch extends AbstractWatch implements Showable{


    /*public MechanicalWatch() {
        System.out.println("construct mechanical watch");
    }*/

    @Override
    public void printColor() {
        System.out.println("black mechanical watch");
    }

    public MechanicalWatch(double price) {
        //super(price);
        System.out.println("construct mechanical watch price= " + price );
    }

    @Override
    public void printSize() {
        System.out.println("M");
    }

    private void printPrice() {
        System.out.println("1000 EUR");
    }

    public void showTime(String format) {
        System.out.println(format);
        super.showTime();

    }

    @Override
    public void showTime() {
        System.out.println("mechanical watch show time " + new Date());
    }
}
