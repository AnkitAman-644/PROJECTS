import java.util.*;
public class knapsack2{
    public static int max_profit(int[] wt,int[] val,int W,int n){
        int[][] L=new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0||j==0)
                L[i][j]=0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<j)
                L[i][j]=Math.max(val[n-1]+L[i-1][j-wt[i-1]],L[i-1][j]);
                else
                L[i][j]=L[i-1][j];
            }
        }
        return L[n][W];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
