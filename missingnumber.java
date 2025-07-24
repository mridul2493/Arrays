import java.util.*;
public class missingnumber {
    public static int brute(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    flag=true;
                    break;
                }
            }
            if (flag == true) {
                continue;
            }
            else{
                return i;
            }
        }
        System.out.println("All elements are present");
        return 0;
    }
    public static int bettersol(int arr[]){
        int n= arr.length;
        int hash[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            hash[i]=0;
        }
        for(int j=0;j<n;j++){
            hash[arr[j]]=1;
        }
        for(int k=1;k<n+1;k++){
            if(hash[k]==0){
                return k;
            }
        }
        System.out.println("All elements are present");
        return 0;
    }
    public static int optimal1(int arr[]){
        int n=arr.length;
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i<n;i++){
            s2=s2+arr[i];
        }
        int missing=sum-s2;
        return missing;
    }
    public static int optimal2(int arr[]){
        int n=arr.length;
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=n;i++){
            xor1=xor1^i;
        }
        for(int i=0;i<n;i++){
            xor2=xor2^arr[i];
        }
        return xor1^xor2;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={0,4,2,1,3};
        System.out.println(brute(arr));
        System.out.println(bettersol(arr));
        System.out.println(optimal1(arr));
        System.out.println(optimal2(arr));
    }
}