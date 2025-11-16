import java.util.Scanner;

public class hasing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,3,2,1,7};
        int[] has=new int[8];

        for(int i=0;i<arr.length;i++) {
            has[arr[i]]+=1;
        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(has[i]+" ");
        }


    }
}












