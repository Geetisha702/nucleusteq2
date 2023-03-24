class UDT<letters>
{
letters var;
void set(letters va1)
{
var=va1;}
void show()
{System.out.println(var);}
}
class Example
{
static public void main(String...ar)
{
UDT udt =new UDT();
udt.set(3);
udt.show();
}}

