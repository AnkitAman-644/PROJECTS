import java.io.*;
import java.util.*;
public class LCSPrint {
    public static void lcs(String s1,String s2,int m,int n){
        int[][] L = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
            else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
               L[i][j] = Math.max(L[i - 1][j],L[i][j - 1]);
            }
        }
        int index=L[m][n];
        int temp=index;
        char[] s3=new char[index+1];
        int i=m,j=n;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                s3[index-1]=s1.charAt(i-1);
                i--;
                j--;
                index--;
            }else if(L[i-1][j]>L[i][j-1])
            i--;
            else
            j--;
        }
       System.out.println("LCS is :-");
       for(int k=0;k<=temp;k++){
        System.out.print(s3[k]);
       } 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:-");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        lcs(s1,s2,n,m);
    }
}
