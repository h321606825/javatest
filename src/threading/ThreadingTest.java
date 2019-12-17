package threading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingTest {
    static int count = 5000;
    static int threads = 200;
    static int sum = 0;

    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(threads);

        //方式2
        CountDownLatch cdl = new CountDownLatch(count);//闭锁    线程不安全
        for(int i=0;i < count;i++){
            service.submit(new Runnable() {
                @Override
                public void run() {
                    synchronized (this){
                        sum++;
                        cdl.countDown();//做减一操作
                    }
                }
            });
        }
//        方式1
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结果是"+sum);

        //关闭线程池
        service.shutdown();
    }
}
