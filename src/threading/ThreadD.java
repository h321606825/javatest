package threading;

public class ThreadD extends Thread{
    int count;
    MonitorObject mySignal;
    public ThreadD(MonitorObject mySignal){
        this.mySignal=mySignal;
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            count=count+1;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (mySignal){
            mySignal.notify();//计算完成调用对象的notify()方法，唤醒因调用这个对象wait()方法而挂起的线程
        }
    }
}

