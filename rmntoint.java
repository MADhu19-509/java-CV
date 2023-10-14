import java.util.*;
import java.io.*;
import java.lang.Math;
public class rmntoint{
    public static void Main (String[] args )
    {
    rmntoint obj =new rmntoint();
    Scanner sc=new Scanner(System.in);
    String iprmn=sc.nextLine();
    System.out.println(obj.rtoi(iprmn));
}
int numval(char rom)
{
    if (rom=="I")
        return 1;
    else if (rom =='V')
        return 5;
    else if (rom =='X')
        return 10;
    else if (rom =='L')
        return 50;
    else if (rom =='C')
        return 100;
    else if (rom =='D')
        return 500;
    else if (rom =='M')
        return 1000;
    return -1;
}
int rtoi(String str)
{
    int summ=0
    for (int i=0;i<str.length();i++)
    {int s1=numval(str.charAt(i));
    if (i+1<str.length())
    {
        int s2=numval(str.charAt(i+1)); 
    if(s1>=s2)
    {
        sum=sum+s1;
    }
    else {
        sum=sum-s1;

    }
    }
    else 
    {
        sum=sum+s1;
    }
}
return sum
}
}