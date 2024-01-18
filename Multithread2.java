//Thread priority setting with setPriority and getPriority
class Base extends Thread{

    public void run(){
        System.out.println("Inside run method");
    }
}

public class Multithread2 {

    public static void main(String[] args) {

        Thread.currentThread().setPriority(8);

        System.out.println("main thread priority" + Thread.currentThread().getPriority());

        Base t1=new Base();
        System.out.println("thread priority" +t1.getPriority());

      }
}
