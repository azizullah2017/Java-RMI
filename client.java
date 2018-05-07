import java.rmi.*;
import java.rmi.server.*;

public class client
{
public static void main (String s[]) throws Exception
{
String url = "rmi://127.0.0.1/ram";
intf  intf1 = (intf)Naming.lookup(url);
int a = intf1.add(30,10);
int b = intf1.sub(30,10);
int c = intf1.multiply(30,10);
int d = intf1.division(30,10);
int e = intf1.average(30,10);

System.out.println("A :  30   B : 10");
System.out.println("Addition  : "+a);
System.out.println("Subtraction : "+b);
System.out.println("Multiplicatin  : "+c);
System.out.println("Division : "+d);
System.out.println("Average : "+e);
}
}
