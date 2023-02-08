import java.util.*;

public class knapsack1 {
    public static int max_profit(int[] wt,int[] val,int W,int n){
        if(n==0|| W==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(val[n-1]+max_profit(wt,val,W-wt[n-1],n-1),max_profit(wt,val,W,n-1));
        }else
        return max_profit(wt,val,W,n-1); 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,W;
        System.out.println("Enter the capacity of Knapsack:-");
        W=sc.nextInt();
        System.out.println("Enter the no of elements:-");
        n=sc.nextInt();
        int [] wt=new int[n];int[] val=new int[n];
        System.out.println("Enter the element's weight:-");
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        System.out.println("Enter the element's values:-");
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        int profit=max_profit(wt,val,W,n);
        System.out.println("Total Profit:-"+profit);
    }
}