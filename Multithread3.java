import java.lang.*;

class ThreadDemo extends Thread{
    public void run(){
         try{
        System.out.println("inside run method");
         }
         catch(InstantiationError e){
            System.out.println("Instantiation error detected");
         }
    }
}

public class Multithread3 {
    public static void main(String[] args) {
        
        ThreadDemo b1=new ThreadDemo();
        ThreadDemo b2=new ThreadDemo();
        ThreadDemo b3=new ThreadDemo();

        System.out.println("priority of first random thread" +b1.getPriority());
        
        System.out.println("priority of second random thread" +b2.getPriority());

        System.out.println("priority of third random thread" +b3.getPriority());

        b1.setPriority(6);
        b2.setPriority(8);
        b3.setPriority(2);

        System.out.println(
            "priority of first random thread"
                    +b1.getPriority());
        
        System.out.println(
            "priority of second random thread"
                    +b2.getPriority());

        System.out.println(
            "priority of third random thread" 
                    +b3.getPriority());

        System.out.println("main thread priority" + Thread.currentThread().getName());

        System.out.println("main thread priority" + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("main thread priority" + Thread.currentThread().getPriority());

    }     
}
