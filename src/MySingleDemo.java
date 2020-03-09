public class MySingleDemo {
    private static MySingleDemo instance = null;
    private MySingleDemo(){};

    public synchronized static MySingleDemo getInstance() {
        synchronized (MySingleDemo.class){
            if(instance == null){
                instance = new MySingleDemo();
            }
        }
        return instance;
    }
}
