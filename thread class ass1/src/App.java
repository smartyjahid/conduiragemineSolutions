// import statement  
import java.io.*;  
  
// The ThreadNameClass is the child class of the class Thread  
class ThreadName extends Thread  
{  

ThreadName(String threadName)  
{  
super(threadName);  
}  
@Override
public void run()  
{  
System.out.println(" The thread is running....");  
}  
}  
  
public class App  
{  
// main method  
public static void main (String argvs[])  
{  
ThreadName th1 = new ThreadName("Jahid");  
ThreadName th2 = new ThreadName("Javid");  
  
// invoking the getName() method to get the names  
// of the thread created above   
th1.start();  
th2.start();  
System.out.println("Thread - 1: " + th1.getName());  
System.out.println("Thread - 2: " + th2.getName());  
  

}  
}  