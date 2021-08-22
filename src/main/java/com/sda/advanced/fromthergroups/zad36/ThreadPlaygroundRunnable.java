package com.sda.advanced.fromthergroups.zad36;

import java.util.Random;

class ThreadPlaygroundRunnable implements Runnable {

    private final String name;

    ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(String.join(":", Thread.currentThread().getName(), name, String.valueOf(i)));
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
