package morethread.dec_2019;

import java.util.concurrent.Semaphore;

//1117. H2O 生成
public class dec_20_1117 {
    class H2O {
        public H2O() {

        }
        Semaphore h = new Semaphore(2);
        Semaphore o = new Semaphore(0);
        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            h.acquire();
            releaseHydrogen.run();
            o.release();
        }
        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            o.acquire(2);
            releaseOxygen.run();
            h.release(2);
        }
    }
}
