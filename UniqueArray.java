import java.util.ArrayList;
import java.util.HashSet;


public class UniqueArray {
    
    public static void main(String...arr)
    {
    ArrayList array=new ArrayList();
    array.add(1);
     array.add(2);
      array.add(3);
       array.add(1);
        array.add(2);
         array.add(4);
          array.add(3);
          HashSet hs=new HashSet(array);
          System.out.println("Original list:"+array);
              System.out.println("Unique list:"+hs);
}}
