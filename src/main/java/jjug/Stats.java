package jjug;


import java.util.concurrent.atomic.AtomicLong;

public class Stats {
    private static AtomicLong counter = new AtomicLong();

    public static long increment() {
        return counter.incrementAndGet();
    }

    public static long current() {
        return counter.get();
    }

    public static void reset() {
        counter.set(0);
    }
}
