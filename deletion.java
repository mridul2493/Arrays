import java.util.*;
public class deletion {
    public static void deletefixed(int arr[], int idx, int size){
        for(int i=idx;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        // Print
        for(int k=0;k<size;k++){
            System.out.println(arr[k]);
        }
    }
    public static void deletedynamic(ArrayList<Integer>list,int idx2){
        list.remove(idx2);
        // Print
        System.out.println(list);
        // using for loop
        for(int x:list){
            System.out.println(x);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {23,34,67,90,63,27};
        int size = arr.length;
        int idx=5;
        deletefixed(arr,idx,size);// You can delete any element at any location, be it beginning, specific or end
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        int idx2=5;
        deletedynamic(list,idx2);// Everything can be removed using this
    }
}