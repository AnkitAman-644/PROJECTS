import java.util.*;
public class LCM {
    public static void lcm(int a,int b){
        int s=a>b?a:b;
        for(int i=s;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers to find LCM");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        lcm(n1,n2);
    }
}
