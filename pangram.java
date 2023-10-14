 import java.util.*;
 class pangram
 {
   public static void allLetter(String str)
   {
    str=str.toLowerCase();
    boolean alp=true;
    for (char ch='a';ch<='z';ch++)
    {
        if (!str.contains(String.valueOf(ch)))
        {
            alp=false;
            break;
        }
    }
    if(alp)
    {
        System.out.println("pangram ");}
        else {
        System.out.println("not pangram");}
   }
        public static void main(String[] args )
        {
            Scanner sc=new Scanner(System.in);
            String str =sc.nextLine();
            allLetter(str);
        }
    }

 