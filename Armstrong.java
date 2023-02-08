import java.util.*;

public class Armstrong {
    public static int NoOfDigits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:-");
        int num=sc.nextInt();
        int r=0,p=num;
        int no=NoOfDigits(num);
        while(p!=0){
            int k=p%10;
            p=p/10;
            r=r+(int)Math.pow(k,no);
        }
        if(r==num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
