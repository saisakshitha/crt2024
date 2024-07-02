

import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,x=0,y=0,units=10;
        String dir="r";
        for(i=0;i<n;i++){
            if(dir=="r"){
                x=x+units;
                units=units+10;
                dir="u";
            }
            else if(dir=="u"){
                y=y+units;
                units=units+10;
                dir="l";
            }
            else if(dir=="l"){
                x=x-units;
                units=units+10;
                dir="d";
            }
            else if(dir=="d"){
                y=y-units;
                units=units+10;
                dir="a";
            }
            else if(dir=="a"){
                x=x+units;
                units=units+10;
                dir="r";
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
    
}
