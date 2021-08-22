package com.sda.advanced.solution.zad35;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    	System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new MyRunnable());
        thread.start();
		Thread thread2 = new Thread(new MyRunnable());
		thread2.start();
		Thread thread3 = new Thread(new MyRunnable());
		thread3.start();
		thread3.join();
		System.out.println(Thread.currentThread().getName());
    }
}
