//import java.lang.Thread;
//multithreading by thread extend
class Multithreading extends Thread{
    public static Object thread;

    public void run(){
        try{
            System.out.println("Thread" + Thread.currentThread().getId() + "is running");
        }
        catch(Exception e){
            System.out.println("exception is caught");
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        int n=10;
        
         for(int i=0;i<n;i++){
            Multithreading obj=new Multithreading();
            obj.start();
        }
    }
}
