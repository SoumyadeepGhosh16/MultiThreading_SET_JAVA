class MultithreadDemo extends Thread{
    public void run(){
        System.out.println(" running the thread ");
    }
}

public class Multithread5 {
    public static void main(String[] args) {
        
        MultithreadDemo m1=new MultithreadDemo();
        MultithreadDemo m2=new MultithreadDemo(); 
 
        System.out.println(
            "m1 initial thread name"
                 +m1.getName());
        
        System.out.println(
            "m1 initial thread name"
                 +m2.getName());

         m1.start();
         m2.start();        
        
        m1.setName("ThreadDemo1"); 
        m2.setName("THreadDemo2");
        
        System.out.println(
            "after change,name of thread m1"
                 +m1.getName());

        System.out.println(
            "after change,name of thread m2"
                 +m2.getName());         
                 
    }
}
