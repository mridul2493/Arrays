import java.util.*;
public class LinearSearch {
    public static int search(int arr[], int num){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                System.out.println("Found Index = "+i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,22,34,56,78};
        int num=56;
        search(arr,num);
    }
}