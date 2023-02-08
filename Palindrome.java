import java.util.*;

public class Palindrome {
    public static int NoOfDigits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:-");
        int num=sc.nextInt();
        int p=NoOfDigits(num);
        int[] a=new int[p];
        int k=num,i=0;
        while(k!=0){
            a[i]=k%10;
            k=k/10;
            i++;
        }
        int r=0,j=0;
        while(j<p){
            r=10*r+a[j];
            j++;
        }
        if(r==num)
        System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");
    }
}
