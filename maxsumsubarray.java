

import java.util.*;
class SubArraysProduct{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        int i;
        for(i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+a[k];
                }
                System.out.print(sum+ " ");
            }
           System.out.println();
    }
}
}
