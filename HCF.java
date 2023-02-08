import java.util.*;
public class HCF {
    public static void hcf(int a,int b){
        int s=a<b?a:b;
        for(int i=s;i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println("Hcf is :-"+i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number to find HCF");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        hcf(n1,n2);
    }
}
