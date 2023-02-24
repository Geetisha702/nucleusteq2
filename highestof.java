//program to find highest of 3 num

import java.util.Scanner;

class highestof
{
public static void main(String...arr)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array length");
//int size=sc.nextInt();
int ar[]=new int[3];
System.out.println("enter array elements");
for(int i=0;i<3;i++)
{
ar[i]=sc.nextInt();}
int max=ar[0];
//int max2=ar[0];
try{
for(int i=0;i<3;i++)
{
if(max<ar[i+1])
max=ar[i+1];}}
catch(Exception e){}

System.out.println("highest:"+max+"second highest:"+max2);
}}