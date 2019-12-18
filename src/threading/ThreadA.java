package threading;

public class ThreadA extends Thread{
    MySignal mySignal;
    ThreadB threadB;
    public ThreadA(MySignal mySignal, ThreadB threadB){
        this.mySignal=mySignal;
        this.threadB=threadB;
    }
    @Override
    public void run(){
        while (true){
            if(mySignal.hasDataToProcess()){
                System.out.println("线程B计算结果为:"+threadB.count);
                break;
            }
        }
    }
    public static void main(String[] args) {
        MySignal mySignal=new MySignal();
        ThreadB threadB=new ThreadB(mySignal);
        ThreadA threadA=new ThreadA(mySignal,threadB);
        threadB.start();
        threadA.start();
    }
}
