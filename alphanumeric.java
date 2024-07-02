

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(Character.isLetterOrDigit(c))
        {
            System.out.println("Alpha-Numeric");
            if(Character.isLetter(c))
            {
                System.out.println("Alphabet");
                if(Character.isUpperCase(c)){
                    System.out.println("Uppercase");
                }
                else{
                    System.out.println("Lowercase");
                }
            }
            else{
                    System.out.println("Digit");
                }
        } 
         else{
                System.out.println("Special Symbol");
            }
        }
    }



    
           
