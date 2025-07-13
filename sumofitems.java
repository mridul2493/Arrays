import java.util.*;
public class sumofitems {
    public static void main(String [] args){
        Scanner sc = new  Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("Enter elements = ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        // SUM
        int sum =0;
        for(int j=0;j< arr.length;j++){
            sum = sum+arr[j];
        }
        // Print
        System.out.println(sum);
    }
}