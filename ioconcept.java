import static java.lang.System.out;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
class IOConcept
{
static public void main(String...ar)throws Exception
{
out.println("enter data");
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader bfr=new BufferedReader(isr);
String data=bfr.readLine();
FileWriter fw=new FileWriter("data.txt");
fw.write(data);
fw.close();
FileReader fr=new FileReader("data.txt");
BufferedReader br1=new BufferedReader(fr);
String output=br1.readLine();
out.println(output);
}
}