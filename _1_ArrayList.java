import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;

public class _1_ArrayList {
    public static void main(String[] args) {
        
            ArrayList<Integer> list = new ArrayList<>();
            
            list.add(52);
            list.add(12);
            list.add(15);
            list.add(13);
            list.add(17);
            
            Collections.sort(list);
            System.out.println(list);
            Collections.reverse(list);
            System.out.println(list);
        
    }
}
