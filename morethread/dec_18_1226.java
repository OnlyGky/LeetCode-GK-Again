package morethread.dec_2019;

import java.util.concurrent.locks.ReentrantLock;

//1226. 哲学家进餐
public class dec_18_1226 {
    class DiningPhilosophers {
        private ReentrantLock[] locks = {
                new ReentrantLock(),
                new ReentrantLock(),
                new ReentrantLock(),
                new ReentrantLock(),
                new ReentrantLock()};
        private ReentrantLock bothLock = new ReentrantLock();
        public DiningPhilosophers() {

        }

        // call the run() method of any runnable to execute its code
        public void wantsToEat(int philosopher,
                               Runnable pickLeftFork,
                               Runnable pickRightFork,
                               Runnable eat,
                               Runnable putLeftFork,
                               Runnable putRightFork) throws InterruptedException {
            int right = (philosopher+1)%5;
            int left = philosopher;
            bothLock.lock();
            locks[right].lock();
            locks[left].lock();
            pickLeftFork.run();
            pickRightFork.run();
            bothLock.unlock();
            eat.run();
            putLeftFork.run();
            putRightFork.run();
            locks[left].unlock();
            locks[right].unlock();
        }
    }
}
