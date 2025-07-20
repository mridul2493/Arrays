import java.util.*;
public class RemoveDuplicate {
    public static int brute(int nums[]){
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    nums[i]=-1;
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                ls.add(nums[i]);
            }
        }
        Integer [] arr2=ls.toArray(new Integer[0]);
        for(int i=0;i< arr2.length;i++){
            nums[i]=arr2[i];
        }
        System.out.print(nums);
        return arr2.length;
    }
    public static void optimal(int nums[]){
        int i=0;
        for(int j=i;j< nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        for(int x:nums){
            System.out.print(x+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int nums[]={12,13,13,14,15,15,15,17,18};
        //brute(nums); using brute force , most costly way
        optimal(nums); // Using Optimal path, best path
        /*
        Time complexity of Optimal = O(n)
        Space Complexity of optimal = O(1)
         */
    }
}