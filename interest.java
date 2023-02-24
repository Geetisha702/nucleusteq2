//program for simple and compound interest
import java.util.Scanner;


class interest
{
public static void main(String...ar)
{
int interest=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter principal,rate and time");
int princi=sc.nextInt();
int rate=sc.nextInt();
int time=sc.nextInt();
interest=(princi*rate*time)/100;
System.out.println("simple interest="+interest);
interest=(int)princi*(Math.pow((1+rate/100),time));
System.out.println("compound interest:"+interest);
}}