
import java.util.Scanner;

class highestElement
{
public static void main(String...arr)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array length");
int size=sc.nextInt();
int ar[]=new int[size];
System.out.println("enter array elements");
for(int i=0;i<size;i++)
{
ar[i]=sc.nextInt();}
int max=ar[0];
int max2=ar[0];
try{
for(int i=0;i<size;i++)
{
if(max<ar[i+1])
max=ar[i+1];}}
catch(Exception e){}
try{
for(int i=0;i<size;i++)
{
if(max2<ar[i+1])
    if(ar[i+1]!=max)
max2=ar[i+1];}}
catch(Exception e){}
System.out.println("highest:"+max+"second highest:"+max2);
}}