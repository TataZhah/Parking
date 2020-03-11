package by.watch;

public class NewQuratzWatch extends QuartzWatch {

    private Showable showable;

    public NewQuratzWatch(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void showTime() {
        showable.showTime();
    }
}
