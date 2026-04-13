package com.gla.anshika;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        MyThread mt = new MyThread();
        OtherThread ot = new OtherThread();
        mt.start();
        ot.start();
        Thread tt = new Thread(new ThirdThread());
        tt.start();
        System.out.println("Main Ends");

        mt.setPriority(Thread.MAX_PRIORITY);
        tt.setPriority(Thread.MIN_PRIORITY);

    }
}
