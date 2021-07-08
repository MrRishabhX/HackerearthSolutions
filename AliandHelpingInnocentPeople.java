/*Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)
Question Link:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/
*/
import java.util.*;
import java.io.*;
class Ali
{
public static void main(String args[] ) throws Exception 
{
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int L;
      L=s.length();
      int i=0;
      int s1,s2,s3,s4; 
      int a = Character.getNumericValue(s.charAt(0));
      int b = Character.getNumericValue(s.charAt(1));
      int c = Character.getNumericValue(s.charAt(3));
      int d = Character.getNumericValue(s.charAt(4));
      int e = Character.getNumericValue(s.charAt(5));
      int f = Character.getNumericValue(s.charAt(7));
      int g = Character.getNumericValue(s.charAt(8));
      s1=a+b;s2=c+d;s3=d+e;s4=f+g;
      if((s1%2)==0&&(s2%2==0)&&(s3%2==0)&&(s4%2==0)&&(s.charAt(2)!='A')&&(s.charAt(2)!='E')&&(s.charAt(2)!='I')&&(s.charAt(2)!='O')&&(s.charAt(2)!='U')&&(s.charAt(2)!='Y'))
      System.out.println("valid");
      else
      System.out.println("invalid");
}
}

        
