package org.example;

public class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
    }
    public void run() {
        this.mailScheduler();
    }

    private void mailScheduler() {
        System.out.println("Mail scheduler is running in thread...");
    }
}