package morethread.dec_2019;
//1114. 按序打印
public class dec_16_1114 {
    class Foo {
        private boolean firstFinished;
        private boolean secondFinished;
        private Object lock = new Object();
        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            synchronized (lock){
                printFirst.run();
                firstFinished = true;
                lock.notifyAll();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {

            // printSecond.run() outputs "second". Do not change or remove this line.
            synchronized (lock){
                while (!firstFinished){
                    lock.wait();
                }
                printSecond.run();
                secondFinished = true;
                lock.notifyAll();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {

            // printThird.run() outputs "third". Do not change or remove this line.
            synchronized (lock){
                while (!secondFinished){
                    lock.wait();
                }
                printThird.run();
            }
        }
    }
}
