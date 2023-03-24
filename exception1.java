
import static java.lang.System.out;
import java.util.Scanner;
class CMarks extends RuntimeException
{
}
class JavaMarks extends RuntimeException
{}

class Marks
{ void getMarks()
{
Scanner sc=new Scanner(System.in);
out.println("enter c language marks");
float cMarks=sc.nextFloat();
if(cMarks<0||cMarks>100)
{CMarks cm=new CMarks();
throw cm;}
else
{out.println("good!!");}
out.println("enter marks in java");
float javaMarks= sc.nextFloat();
if(javaMarks>0||javaMarks<100)
{JavaMarks jm=new JavaMarks();
throw jm;}
else
{out.println("good!!");
}
}}
class Exceptions
{
static public void main(String...ar)
{Marks ref1=new Marks();
try{ref1.getMarks();}
catch(CMarks|JavaMarks ref)
{out.println("invalid range");
ref.printStackTrace();
}
finally
{out.println("good!!!");}
}}
