public class App {
    public static void main(String[] args) throws Exception {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Multithread object = new Multithread();
            object.start();
        }
    }
}


class Multithread extends Thread {
    public void run()
    {
        try {
           
            System.out.println(
                "Hello All \n" + Thread.currentThread().getName()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}