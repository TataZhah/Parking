package by.watch;

import by.digitalwatch.DigitalWatch;

public class Main {

    public static void main(String[] args) {
        AbstractWatch watch = new MechanicalWatch(155.99);
        watch.showTime();
        watch.printColor();
        watch.printSize();

        AbstractWatch watch1 = new QuartzWatch();
        watch.showTime();

        AbstractWatch watch2 = new DigitalWatch();
        watch2.showTime();
        watch2.printColor();
        watch2.printSize();

        AbstractWatch watch3 = new NewQuratzWatch((MechanicalWatch)watch);
        watch3.printColor();
        watch3.showTime();


    }
}

