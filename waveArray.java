import java.util.*;

public class waveArray {
    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
 
    //* Function to sort array in wave form, i.e., arr[0] >= arr[1] <= arr[2].....*/
    public static void WaveArray(int arr[], int n){
        // Sorting
        Arrays.sort(arr);
        // Swapping
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:-");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array element:-");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        WaveArray(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
