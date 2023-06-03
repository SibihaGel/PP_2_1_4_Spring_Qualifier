package app.model;

public class Timer {
    private static Long nanoTime = System.nanoTime();
    public static Long getTime() {
        return nanoTime;
    }
}
