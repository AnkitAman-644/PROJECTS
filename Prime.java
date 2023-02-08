import java.util.*;

public class Prime {
    public static void CheckPrime(int a){
        int count=0;
        if(a<0){
            System.out.println("Negative number not allowed");
        }
        else if(a==1)
        System.out.println("Neither Prime Nor Composite");
        else{
            for(int i=2;i<=a/2;i++){
            if(a%i==0)
            count++;
        }
        if(count>0){
            System.out.println("Composite Number");
        }else{
            System.out.println("Prime Number");
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        CheckPrime(a);
    }    
}