import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Queue<Integer> qlist = new LinkedList<>();
       Stack<Integer> slist =new Stack<>();
       qlist.add(23);
       qlist.add(9); 
       qlist.add(43);
       qlist.add(47);
       qlist.add(98);
       qlist.add(96);
       System.out.println("Six Integer in a queue: "+qlist);
       System.out.println("First element Removed from front of the queue: "+ qlist.peek());
       qlist.poll();
       System.out.println(" Second element Removed from front of the queue: "+ qlist.peek());
       qlist.poll();
       for(int i=0;i<4;i++){
        slist.push(qlist.peek());
        qlist.remove();
       }
       System.out.println("Here the Final Stack: "+ slist);
       
     
    }
}
