import java.util.Arrays;
import java.util.List;
public class WildCards {
    public static void main(String...ar)
    {
    List <Integer>list=Arrays.asList(4,3,2,1);
    List <String>list1=Arrays.asList("hello");
     List <Double>list2=Arrays.asList(2.0,3.0);
    System.out.println(list.get(0));
     System.out.println(list1.get(0));
     printlist(list);
printlist(list1);   
    printlist(list2); }
     private static void printlist(List<?> list)
    {
 
        System.out.println(list);
    }
}
