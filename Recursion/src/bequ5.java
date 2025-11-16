import java.util.HashSet;

public class bequ5 {
    public static void intersection(int[] arr1,int arr2[]){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(count);
        for(int i: set){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int arr2[]={6,3,9,2,9,4,9};
        intersection(arr1,arr2);
    }

}
