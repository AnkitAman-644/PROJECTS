import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:-");
        int num=sc.nextInt();
        int r=0;
        while(num!=0){
            r=10*r+num%10;
            num=num/10;
        }
        System.out.println(r);
    }
}
