package com.company;

public class Main {
    private static int variable=0;



    public  static void main(String[] args) {
        Thread th1 = new Thread(new Reader());
        Thread th2 = new Thread(new Writer());
        th1.setName("Thread-1");
        th2.setName("Thread-2");

        th1.start();
        th2.start();


    }

    public synchronized static void read(){

        System.out.println(Thread.currentThread().getName()+ ": was read "+variable);
        System.out.println(Thread.currentThread().getName()+ ": was read "+variable);

    }
    public synchronized static void write(){

        variable=5;
        System.out.println(Thread.currentThread().getName()+ ": was wrote "+variable);
    }


}
