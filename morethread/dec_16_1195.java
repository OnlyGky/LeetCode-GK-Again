package morethread.dec_2019;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

//1195. 交替打印字符串
public class dec_16_1195 {
    class FizzBuzz {
        private int n;

        public FizzBuzz(int n) {
            this.n = n;
        }
        private AtomicInteger num = new AtomicInteger(1);
        Object lock = new Object();
        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            while (num.get() <= n){
                synchronized (lock){
                    int index = num.get();
                    if (index %3 == 0 && index %15 != 0){
                        printFizz.run();
                        num.getAndIncrement();
                        lock.notifyAll();
                    }else {
                        lock.wait();
                    }
                }
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            while (num.get() <= n){
                synchronized (lock){
                    int index = num.get();
                    if (index % 15 != 0 && index % 5 == 0){
                        printBuzz.run();
                        num.getAndIncrement();
                        lock.notifyAll();
                    }else {
                        lock.wait();
                    }
                }
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            while (num.get() <= n){
                synchronized (lock){
                    int index = num.get();
                    if (index % 15 == 0){
                        printFizzBuzz.run();
                        num.getAndIncrement();
                        lock.notifyAll();
                    }else {
                        lock.wait();
                    }
                }
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            while (num.get() <= n){
                synchronized (lock){
                    int index = num.get();
                    if (index % 3 != 0 && index % 5 != 0){
                       printNumber.accept(index);
                       num.getAndIncrement();
                       lock.notifyAll();
                    }else {
                        lock.wait();
                    }
                }
            }
        }
    }
}
