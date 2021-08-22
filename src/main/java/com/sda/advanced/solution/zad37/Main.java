package com.sda.advanced.solution.zad37;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		final ExecutorService executorService = Executors.newFixedThreadPool(2);

		for(int i =0; i< 20; i++) {
			executorService.execute(new MyRunnable());
		}
		System.out.println("Tasks has been scheduled");

		executorService.shutdown();
		if(!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
			executorService.shutdownNow();
		}
		System.out.println("executor service has been terminated");

	}
}
