import java.util.*;
public class SecondLargestElement {
    public static int secondlargest(int arr[]){
        int largest=arr[0];
        int seclarge=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
                continue;
            }
            else{
                continue;
            }
        }
        for(int j=0;j< arr.length;j++){
            if(arr[j]>seclarge && arr[j]!=largest){
                seclarge=arr[j];
                continue;
            }
            else{
                continue;
            }
        }
        return seclarge;
    }
    public static int optimal(int arr[]){
        int largest2 =arr[0];
        int seclarge2=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest2){
                seclarge2=largest2;
                largest2=arr[i];
                continue;
            }
            else if(arr[i]<largest2 && arr[i]>seclarge2){
                seclarge2=arr[i];
                continue;
            }
            else{
                continue;
            }
        }
        return seclarge2;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        /*
        In case of Brute Force : it is very expensive because even if we sort the array even then there is no gurantee
        that (n-2)th element will be second largest or not. Ex : 1,2,3,5,7,7 = this is a sorted array, but arr[n-2] is not
        second largest, therefore TC = O(nlogn+n).
        Better case : TC = O(2n)
        two passes required, in first pass largest element is found and stored in var
        and then in second pass seclarge = -1 , now if arr[j]>seclarge && arr[j]!=largest then seclarge=arr[j]
        otherwise continue
         */
        int arr[] = {25,12,34,22,56,32,89,78,66};
        System.out.println("The second largest element = "+optimal(arr));
    }
}