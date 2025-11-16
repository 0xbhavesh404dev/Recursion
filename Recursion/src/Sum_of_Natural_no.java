import java.util.Scanner;

public class Sum_of_Natural_no {
    public static int recursion(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return n+recursion(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
}
