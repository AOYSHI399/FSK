package iit.java;

public class ActivitySelection {
    private String name;
    private int start;
    private int finish;

    public ActivitySelection(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public int getFinish() {
        return finish;
    }

    @Override
    public String toString() {
        return name + " (" + start + ", " + finish + ")";
    }
}
