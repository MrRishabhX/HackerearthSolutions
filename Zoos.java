/*You are required to enter a word that consists of x and y that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 2×x=y.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format:
First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be 20.

Output format:
Print Yes if the input word can be considered as the string zoo otherwise, print No.
Input:zzzoooooo
Output:Yes
Question Link:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
*/

import java.io.*;
class palindrome
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        String s1,s2="";int i,L;
        s1=in.readLine();
        L=s1.length();int c=0;int c1=0;
        if(L<20)
        {
        for(i=0;i<L;i++)
        {
            if(s1.charAt(i)=='z')
            {
                c++;
            }
            if(s1.charAt(i)=='o')
            {
                c1++;
            }
        }
    }
    if(2*c==c1)
    {
        System.out.println("Yes");    
    
    }
    else
    {
        System.out.println("No");
    }
}
}
