import java.util.*;
public class frequency {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:-");
      int n=sc.nextInt();
      int[] a=new int[n];
      System.out.println("Enter array elements:-");
      for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
      }
   Arrays.sort(a);
   HashMap<Integer,Integer> map =new HashMap<>();
   }
}
