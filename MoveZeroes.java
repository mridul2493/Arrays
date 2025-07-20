import java.util.*;
public class MoveZeroes {
    public static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }
    public static void brute(int nums[]){
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                ls.add(nums[i]);
                continue;
            }
        }
        Integer arr[]=ls.toArray(new Integer[0]);
        int nz=arr.length;
        for(int j=0;j<nz;j++){
            nums[j]=arr[j];
        }
        for(int k=nz;k< nums.length;k++){
            nums[k]=0;
        }
        for(int x:nums){
            System.out.print(x+" ");
        }
    }
    public static void optimal(int nums[]){
        int n= nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums[i],nums[j]);
                j++;
            }
        }
        for(int x:nums){
            System.out.print(x+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int nums[]={1,0,2,3,2,0,4,0,0,6,7,9,0,1};
        brute(nums);
        System.out.println();
        optimal(nums);
    }
}