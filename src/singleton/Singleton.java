package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}
    private Singleton(String host){}

    public static Singleton getInstance(){
        return singleton;
    }

    public void doWork(){
        System.out.println("singleton class job");
    }
}
