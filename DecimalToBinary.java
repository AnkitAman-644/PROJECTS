import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:-");
        int num=sc.nextInt();
        int[] a=new int[10];
        int i=0;
        while(num!=0){
           if(num%2==0){
            a[i]=0;
            i++;
           }else{
           a[i]=1;
           i++;}
           num=num/2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}
