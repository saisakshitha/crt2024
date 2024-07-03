

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int target=s.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(a[i]+a[j]==target){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
