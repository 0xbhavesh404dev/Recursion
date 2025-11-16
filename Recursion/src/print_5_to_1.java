public class print_5_to_1 {
    public static int recursion(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return recursion(n-1);

    }    public static void main(String[] args) {

        int n = 5;
        recursion(n);
       // System.out.println(recursion(n));
    }
}
