
import java.util.*;  
public class App {
    public static void main(String[] args) throws Exception {
       HashSet<Integer> hs =new HashSet<>();
       hs.add(12);
       hs.add(26);
       hs.add(3);
       hs.add(78);
       Iterator<Integer>e = hs.iterator();
       while (e.hasNext()) {
        System.out.println(e.next());
        
       }
    }
}
