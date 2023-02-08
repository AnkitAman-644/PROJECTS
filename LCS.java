import java.util.*;

public class LCS {
    public static int lcs(String s1,String s2,int m,int n){
        if(m==0||n==0)
        return 0;
        else if(s1.charAt(m-1)==s2.charAt(n-1))
        return 1+lcs(s1,s2,m-1,n-1);
        else
        return Math.max(lcs(s1,s2,m-1,n), lcs(s1,s2,m,n-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:-");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        int l=lcs(s1,s2,n,m);
        System.out.println(l);
    }
}
