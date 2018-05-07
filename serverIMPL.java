 import java.rmi.*;
import java.rmi.server.*;

public class serverIMPL extends UnicastRemoteObject implements intf
{
public serverIMPL() throws RemoteException
{
}
public int add(int a,int b) throws RemoteException
{
return(a+b);
}
public int sub(int a1,int b1) throws RemoteException
{
return(a1-b1);
}
public int multiply(int a1,int b1) throws RemoteException
{
return(a1*b1);
}
public int division(int a1,int b1) throws RemoteException
{
if(b1==0){
System.out.println(" Cannot divide by Zero");
return 0;
}
return(a1/b1);
}
public int average(int a1,int b1) throws RemoteException
{
return((a1+b1)/2);
}
}
