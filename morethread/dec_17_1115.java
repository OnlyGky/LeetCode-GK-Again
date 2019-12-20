package morethread.dec_2019;
//1115. 交替打印FooBar
public class dec_17_1115 {
    class FooBar {
        private int n;

        public FooBar(int n) {
            this.n = n;
        }
        Object object = new Object();
        boolean foo = true;

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printFoo.run() outputs "foo". Do not change or remove this line.
                synchronized (object){
                    if (!foo) object.wait();
                    foo = false;
                    printFoo.run();
                    object.notifyAll();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printBar.run() outputs "bar". Do not change or remove this line.
                synchronized (object){
                    if (foo) object.wait();
                    foo = true;
                    printBar.run();
                    object.notifyAll();
                }
            }
        }
    }
}
