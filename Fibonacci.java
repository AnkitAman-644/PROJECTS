import java.util.*;

// public class Fibonacci {
//     public static void main(String[] args) {
//         int [] series=new int[100];
//         series[0]=0;
//         series[1]=1;
//         for(int i=2; i < 100;i++){
//             series[i]=series[i-2]+series[i-1];
//         }
//         for(int i=0;i<50;i++){
//             System.out.print(series[i]+" ");
//         }
//     }    
// }
public class Fibonacci{
    public static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}