import java.util.Scanner;
public class Functions {
    public static void main(String...ar)
    {
    ArrayList <String>list=new ArrayList<>();
    list.add("item1");
     list.add("item2");
      list.add("item3");
       list.add("item4");
        list.add("item5");
        System.out.println(list);
        list.remove(0);
        list.remove(3);
                System.out.println(list);
                System.out.println("menu display using display function:");
                display(list);
                int a=1;
                System.out.println("choose optio from 1 to 5");
                Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                
        switch(a){
            case 1:System.out.println("list when user chooses 1:");
                    display(list);
        break;
        default:break;
                    
        
        case 2:System.out.println("list when user chooses 2:");
                    display(list);
        break;
        case 3:System.out.println("list when user chooses 3:");
                    display(list);
        break;
        case 4:System.out.println("list when user chooses 4:");
                    display(list);
        break;}
        
    }
    static void display(ArrayList list)
    {System.out.println(list);
    }
}
