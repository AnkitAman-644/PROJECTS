/**
 * kth digit of a number
 */
import java.util.*;
public class kth_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        System.out.println("Enter the position of digit from right to left:-");
        int k=sc.nextInt();
        int count=0;
        while(count!=k-1){
            n=n/10;
            count++;
        }
        k=n%10;
        System.out.printf("digit is %d",k);
    }
}