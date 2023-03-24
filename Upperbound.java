//if we don't use ? we need to specify the type of the inputs and there will be restrictions over input type of data
import java.util.*;
public class Upperbound
{
     public static void main(String[] args) {
    List < Integer > integer_List = Arrays.asList(1, 3, 5, 7);//Integer List
    System.out.println("Total sum is:" + sum(integer_List));
    List < Double > double_List = Arrays.asList(1.2, 3.4, 5.6, 7.8);//Double List
    System.out.print("Total sum is: " + sum(double_List));
  }
  private static double sum(List < ?extends Number > my_List)//Using ? to relax restriction of input type.
  {
    double sum = 0.0;
    for (Number iterator: my_List) 
    {
      sum = sum + iterator.doubleValue();
    }
    return sum;
  }
}
