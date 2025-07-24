import java.util.*;
public class UnionofArrays {
    public static void brute(int arr1[], int arr2[]){
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i< arr1.length;i++){
            boolean flag =true;
            for(int j=0;j<ls.size();j++){
                if(arr1[i]==ls.get(j)){
                    flag=false;
                    break;
                }
            }
            if (flag == true) {
                ls.add(arr1[i]);
            }
        }
        for(int i=0;i< arr2.length;i++){
            boolean flag =true;
            for(int j=0;j<ls.size();j++){
                if(arr2[i]==ls.get(j)){
                    flag=false;
                    break;
                }
            }
            if (flag == true) {
                ls.add(arr2[i]);
            }
        }
        //Converting arraylist to array and then sorting
        Integer union[]=ls.toArray(new Integer[0]);
        Arrays.sort(union);
        for(int x:union){
            System.out.print(x+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // You will be given a sorted array
        int arr1[]={12,14,16,16,20,25,25};
        int arr2[]={8,8,9,10,10,11,12,12};
        brute(arr1,arr2);   // But this brute force is costly
    }
}