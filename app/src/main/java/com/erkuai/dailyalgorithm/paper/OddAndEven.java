package com.erkuai.dailyalgorithm.paper;

public class OddAndEven {

    public static void main(String[] args) {

        Counter counter = new Counter();
        new Thread(new PrintOdd(counter)).start();
        new Thread(new PrintEven(counter)).start();


    }

    static class PrintOdd implements Runnable {

        public Counter counter;

        public PrintOdd(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while (counter.value < 100) {
                synchronized (counter) {
                    if (counter.odd) {
                        System.out.println(Thread.currentThread().getName() + ":" + counter.value);
                        counter.value++;
                        counter.odd = !counter.odd;
                        counter.notify();
                    }

                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    static class PrintEven implements Runnable {
        public Counter counter;

        public PrintEven(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while (counter.value <= 100) {
                synchronized (counter) {
                    if (!counter.odd) {
                        System.out.println(Thread.currentThread().getName() + ":" + counter.value);
                        counter.value++;
                        counter.odd = !counter.odd;
                        counter.notify();
                    }
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Counter {
        public int value = 1;
        public boolean odd = true;
    }

}
