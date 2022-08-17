
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

  public class App {  
     
    public static void main(String[] args) throws Exception {
               
  
      
            // creates 10 ThreadPoolss
        
            Runnable r1 = new ThreadPools("ThreadPools 1");
            Runnable r2 = new ThreadPools("ThreadPools 2");
            Runnable r3 = new ThreadPools("ThreadPools 3");
            Runnable r4 = new ThreadPools("ThreadPools 4");
            Runnable r5 = new ThreadPools("ThreadPools 5");      
            Runnable r6 = new ThreadPools("ThreadPools 6"); 
            Runnable r7 = new ThreadPools("ThreadPools 7"); 
            Runnable r8 = new ThreadPools("ThreadPools 8"); 
            Runnable r9 = new ThreadPools("ThreadPools 9"); 
            Runnable r10 = new ThreadPools("ThreadPools 10"); 
            // creates a thread pool
      
            ExecutorService pool = Executors.newFixedThreadPool(5);  
             
          // Executing all threads here and see the behevior
        
            pool.execute(r1);
            pool.execute(r2);
            pool.execute(r3);
            pool.execute(r4);
            pool.execute(r5); 
            pool.execute(r6);
            pool.execute(r7);
            pool.execute(r8); 
            pool.execute(r9);  
            pool.execute(r10); 
            // pool shutdown ( Step 4)
            pool.shutdown();    
        }
    }

// ThreadPools class to be executed (Step 1)
class ThreadPools implements Runnable   
{

    private String name;
      
    public ThreadPools(String s)
    {
        name = s;
    }
      
    // Prints ThreadPools name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run()
    {
        System.out.println(
                name +" = Executing");   
             
           
            // Thread.sleep(1000);
         
         System.out.println(name+" complete");
    }
}