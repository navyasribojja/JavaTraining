package com.java.dailyAssignmentsday4;

public class TestFinalize4 {
    public static void main(String[] args) {
        A14 a = new A14();
        a = new A14();
        a = new A14();

        // Requesting JVM to run Garbage Collector
        Runtime.getRuntime().gc();

        // Sleep to ensure GC has time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
