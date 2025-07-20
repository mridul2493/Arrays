import java.util.*;
public class ArraysSortedorNot {
    public static boolean checksort(int arr[]){
        for(int i=1;i< arr.length;i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr1[] ={1,2,3,4,5,6,7,8};
        int arr2[] ={1,2,3,4,0,6,7,8};
        System.out.println(checksort(arr1));
        System.out.println(checksort(arr2));
    }
}