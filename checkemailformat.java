import java.lang.System;
import javax.swing.JOptionPane;

class checkemailformat
{
static public void main(String...ar)
{
System.out.println("enter email id ");
String str=JOptionPane.showInputDialog("email id:");
char ch[]=new char[str.length()];
for(int i=0;i<str.length();i++)
ch[i]=str.charAt(i);
int COUNT=0;
for(int i=1;i<str.length();i++)
{
if(ch[i]=='@')
{break;}
++COUNT;
}
if (COUNT==0)
System.exit(0);
if(COUNT==str.length())
System.exit(0);
int NUM=COUNT;
for(int i=COUNT+2;i<str.length();i++)
{if(ch[i]=='.')
{break;}
++NUM;}
if(NUM==str.length())
System.exit(0);
for(int i=NUM+2;i<str.length();i++)
{if(ch[i]>=65&&ch[i]<=90)
{System.out.println("valid mail id");}
else
System.out.println("invalid");
System.exit(0);
}
}}