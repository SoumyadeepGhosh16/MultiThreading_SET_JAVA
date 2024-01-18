import java.lang.Thread;

class Multithreading implements Runnable{
       public void run(){
        try{
            System.out.println("Thread" + Thread.currentThread().getId() + "is running");
        }
        catch(Exception e){
            System.out.println("exception is caught");
        }
    }
}

public class Multithread1 {
    public static void main(String[] args) {
        int n=9;

        for(int i=0;i<n;i++){
            Thread obj=new Thread(new Multithreading());
            obj.start();
        }
    }
}
