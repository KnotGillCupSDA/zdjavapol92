package com.sda.advanced.solution.zad37;

import java.util.Random;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000 + new Random().nextInt(2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
