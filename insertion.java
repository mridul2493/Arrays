import java.util.*;
public class insertion {
    public static void insert(int ind, int e, int arr[]){
        int temp1;
        int temp2;
        temp1 = arr[ind];
        arr[ind]=e;
        for(int k=1;k<=arr.length-ind;k++){
            temp2=arr[ind+k];
            arr[ind+k]=temp1;
            temp1=0;
            temp2=0;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for(int i=0;i< arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index at which you want to insert = ");
        int ind= sc.nextInt();
        System.out.println("Enter element = ");
        int e = sc.nextInt();
    }
}