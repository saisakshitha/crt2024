

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int alp=0,up=0,lo=0,d=0,sp=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                alp++;
            
               if(Character.isUpperCase(ch)){
            up++;
            }
            else{
            lo++;
                }
            }
        else if(Character.isDigit(ch)){
         d++;
        }
        else{
        sp++;
        }
    }
    System.out.println("Alphabets="+alp);
    System.out.println("Uppercase="+up);
    System.out.println("Lowercase="+lo);
    System.out.println("Digits="+d);
    System.out.println("Symbols="+sp);
}
}



    
           
