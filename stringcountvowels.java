

Write a program to count the number of vowels in the given string.

Input Format

Read a string

Constraints

string

Output Format

print the number of Vowels.

Sample Input 0

Java language
Sample Output 0

6
Sample Input 1

python LANGUAGE
Sample Output 1

5
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        int count=0;
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
