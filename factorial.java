import java.util.*;

public class factorial {
    public static int facto(int n){
        if(n<1)
        return -1;
        if(n==1)
        return 1;
        else 
        return n*facto(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int p=facto(n);
        System.out.println(p);
    }
}
