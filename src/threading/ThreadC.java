package threading;

public class ThreadC extends Thread {
    MonitorObject mySignal;
    ThreadD threadD;

    public ThreadC(MonitorObject mySignal, ThreadD threadD) {
        this.mySignal = mySignal;
        this.threadD = threadD;
    }

    @Override
    public void run() {
        synchronized (mySignal) {
            try {
                mySignal.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程D计算结果为:" + threadD.count);
        }
    }

    public static void main(String[] args) {
        MonitorObject mySignal = new MonitorObject();
        ThreadD threadD = new ThreadD(mySignal);
        ThreadC threadC = new ThreadC(mySignal, threadD);
        threadC.start();
        threadD.start();
    }

}