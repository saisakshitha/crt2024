

Write a program to delete the vowels in the given string and display the string without vowels.

Input Format

Read a string

Constraints

string

Output Format

Print string without vowels

Sample Input 0

java
Sample Output 0

jv
Sample Input 1

python
Sample Output 1

pythn


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='u'||c=='o'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                continue;
        }
        else{
            System.out.print(c);
        }
    }
}
}
