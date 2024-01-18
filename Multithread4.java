import java.lang.*;

public class Multithread4 {
    public static void main(String[] args) {
        System.out.println("main thread is" +Thread.currentThread().getName());

        Thread obj=new Thread(new Multithread4().new RunnableImpl());

        obj.start();
    }

        class RunnableImpl implements Runnable{
                  public void run(){
                    System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");
                  }
        }
    
}


