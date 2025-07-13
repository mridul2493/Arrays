import java.util.*;
public class insertion {
    public static void insertfixed(int arr[], int idx, int val){
        int size = arr.length;
        for(int i=size-1;i>idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=val;
        //Print array
        for(int k=0;k< arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public static void insertdynamic(ArrayList<Integer>list,int idx2, int val2){
        list.add(idx2,val2);
        // Print
        System.out.println(list);
        // Loop method to print the ArrayList:
        for(int x:list){
            System.out.println(x);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        arr[0]=12;arr[1]=23;arr[2]=34;
        arr[3]=45;arr[4]=56;arr[5]=67;
        int idx=6,val=100;
        insertfixed(arr,idx,val);   // This function will insert any item at any given specific index of the array,
        // be it insert an begin, insert at specific location or insert at end, will eork for everything
        ArrayList<Integer> list = new ArrayList<>();
        /*
        In case of dynamic arrays : ArrayList<Integer>: creates a dynamic array of integers, allowing
        automatic resizing.
        new ArrayList<>(): starts with default capacity (10), grows as needed
        generally 1.5X or +50% , copies elements and grows
        Methods :
        1. add(val) or add(e) = appends element to the end of array (used for inserting at end)
        2. add(idx,val) = inserts element = val at idx = index of array and automatically adjusts the sizing
        (used for inserting at begin and specific)
         */
        int idx2=2,val2=30;
        list.add(23);
        list.add(45);
        list.add(78);
        list.add(90);
        list.add(67);
        insertdynamic(list,idx2,val2);
    }
}