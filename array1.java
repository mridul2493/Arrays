import java.util.*;
public class array1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        /*
        What is Data Structure ? :- used to Store, Organize, Access and Manipulate data (SOAM)
        Data structures are of two types : Linear data structures and Non Linear data Structures
        Linear data Structures : Items in such data structures are linearly attached (Arrays), works on single level ,
        easy to understand and execute, single run, memory is not utilized in an efficient way
        Non linear data structures : Items in such a data structures are hierarchically attached (Graphs and Trees)
        , works on multiple levels , difficult to understand and execute, multiple run, memory is utilized in an
        efficient way
         */
        // ARRAYS
        /*
        Stores items of same data type
        in contigous memory locations : like : 100,101,102,103, ...... and so on
        Index accessing is a main thing
        We can acces the elements in random fashion
        inefficient memeory usage, because as soon as you declare an array , that much memory is allocated
        to that array even if that array is empty .
        Size(arr) = upper index - lower index + 1
        Addr(arr[i]) = BA + s(i-L)
        BA = base address i.e address of lower most element
        s = size of that element
        i = current i
        L = lower index
         */
        // Traversal of array
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        // Enter elements
        System.out.println("Enter elements = ");
        for(int j=0;j<n;j++){
            arr[j]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}