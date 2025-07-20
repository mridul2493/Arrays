import java.util.*;
public class RotatedArray {
    public static void rotateright(int arr[], int k){
        int n=arr.length;
        k=k%n;  // in case k>n example k=4 and n=3 then k=1, just rotate the array by 1 place
        while(k>0){
            int temp=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            k--;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void rotateleft(int arr[], int k){
        int n=arr.length;
        k=k%n;  // in case k>n example k=4 and n=3 then k=1, just rotate the array by 1 place
        while(k>0){
            int temp=arr[0];
            for(int i=1;i<n;i++){
                arr[i-1]=arr[i];
            }
            arr[n-1]=temp;
            k--;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={11,22,33,44,55,66,77};
        int k=3;
        rotateright(arr,k);
        System.out.println();
        rotateleft(arr,k);
    }
}