import java.util.*;
public class Searching {
    public static void linear(int arr[], int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target found at index "+i);
                break;
            }
            else{
                continue;
            }
        }
    }
    public static int binary(int sorted[], int target2){
        int low=0,high=sorted.length-1;
        int mid=low+((high-low)/2);
        while(low<=high){
            if(sorted[mid]==target2){
                System.out.println("The index of element found is = ");
                return mid;
            }
            else if(sorted[mid]<target2){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static int binaryrecursive(int sorted[], int target2, int low, int high){
        if(low>high){
            return -1;
        }
        int mid = low+((high-low)/2);
        if(sorted[mid]==target2){
            return mid;
        }
        if(sorted[mid]<target2){
            binaryrecursive(sorted,target2,mid+1,high);
        }
        else{
            binaryrecursive(sorted,target2,low,mid-1);
        }
        return 0;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        /*
        Searching of two types :
        1. Linear Search : Straight searching , one element at a time and if
        a match is found then the index is returned.
        2. Binary Search (efficient for sorted arrays): Works only on sorted arrays (in increasing or decreasing order).
        Uses a divide and conquer approach.
        It repeatedly divides the search space in half until the target element is found.
        How Binary Search Works?
        Find the middle element of the array.
        If the target is equal to the middle element, return its index.
        If the target is less than the middle element, search the left half.
        If the target is greater than the middle element, search the right half.
        Repeat until the element is found or the search space is empty.
        Binary search is an efficient algorithm for finding a target value in a sorted array.
        It repeatedly halves the search range,much faster than linear search, especially for large datasets
        */
        int arr[] = {12,23,45,6,8,98,24};
        int target = 98;
        linear(arr,target);
        int sorted[] = {12,23,34,45,56,67,78,89,90};
        int target2=67;
        binary(sorted,target2);
        // recursive method for binary search
        int low=0,high=sorted.length-1;
        binaryrecursive(sorted,target2,low,high);
    }
}