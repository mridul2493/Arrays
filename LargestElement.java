import java.util.*;
public class LargestElement {
    public static int largest(int arr[]){
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
                continue;
            }
            else{
                continue;
            }
        }
        return temp;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        /*
        Brute force : Sort the array and print the largest element of sorted array. TC = O(nlogn)
        Brute force generally have most generic solution, but its not the most optimal solution
        Optimal Solution : traverse the whole array and replace the int temp var with larger values TC = O(n)
        So in interview start solution with brute , then go to better and then go to optimal
         */
        int arr[] = {25,12,16,11,34,30,56,22};
        System.out.println("The largest element is = "+largest(arr));
    }
}