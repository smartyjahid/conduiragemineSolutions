public class App {
    public static void main(String[] args) throws Exception {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new Runablethread());
            object.start();
        }
    }
}

class Runablethread implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "HELLO INDIA\n" + Thread.currentThread().getName()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("SOME THING WENT WORNG WHILE RUNNING THREAD");
        }
    }
}