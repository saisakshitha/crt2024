

Read a stirng and convert upper case into lower case and vice versa

Input Format

Read a string

Constraints

string

Output Format

Print result string

Sample Input 0

Java Language
Sample Output 0

jAVA lANGUAGE
Sample Input 1

pYtHOn Is SIMPLE language
Sample Output 1

PyThoN iS simple LANGUAGE


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
             System.out.print(Character.toLowerCase(c));
        }
        else if (Character.isLowerCase(c)){
            System.out.print(Character.toUpperCase(c));
    }
        else{
            System.out.print(" ");
        }  
        }    
    }
}
