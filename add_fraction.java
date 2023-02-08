import java.util.*;
public class add_fraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator and denomenator of fraction 1:-");
        int n1=sc.nextInt();
        int d1=sc.nextInt();
        System.out.println("Enter numerator and denomenator of fraction 2:-");
        int n2=sc.nextInt();
        int d2=sc.nextInt();
        float sum=(float)((d2*n1)+(d1*n2))/(d1*d2);
        System.out.println(sum);
    }
}
