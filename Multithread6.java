class ThreadDemo extends Thread{

    public ThreadDemo(String name){
         super(name);
    
    }
    public void run(){
        if(Thread.currentThread().isDaemon()){
             System.out.println("the Thread is Daemon" +getName());
        }else{
            System.out.println("the Thread is User" +getName());
        }
    }

}

public class Multithread6 {

    public static void main(String[] args) {
        
    
        ThreadDemo t1 = new ThreadDemo("Demo_1");
        ThreadDemo t2 = new ThreadDemo("Demo_2");
        ThreadDemo t3 = new ThreadDemo("Demo_3");
     
        t1.setDaemon(true);
             
        t1.start();
        t2.start();
 
        t3.setDaemon(true);
        t3.start();
    }        
}

