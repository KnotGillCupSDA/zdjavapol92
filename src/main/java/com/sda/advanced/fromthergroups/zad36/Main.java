package com.sda.advanced.fromthergroups.zad36;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread kubek = new Thread(new ThreadPlaygroundRunnable("kubek"));
        kubek.start();
        //kubek.join();

        System.out.println("MAIN!!!");

        new Thread(new ThreadPlaygroundRunnable("szklanka"))
                .start();

        System.out.println("main koniec!!!");

    }

}
