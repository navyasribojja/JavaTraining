package com.java.dailyAssignmentsday4;


import java.lang.ref.Cleaner;

class A14 {
   private static final Cleaner cleaner = Cleaner.create();
   private final Cleaner.Cleanable cleanable;

   public A14() {
       cleanable = cleaner.register(this, new CleanupTask());
   }

   private static class CleanupTask implements Runnable {
       @Override
       public void run() {
           System.out.println("Cleanup task called");
       }
   }
}