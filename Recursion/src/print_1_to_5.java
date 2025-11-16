public class print_1_to_5 {
    public static int recursion(int n) {
        if (n == 5) {
            return 5;
        }
        if(n==5){
            System.out.println("hi");
        }
          System.out.println(n);
      //  System.out.println("ji");
        return recursion(n + 1);
    }

    public static void main(String[] args){
        int n=1;
       // recursion(1);
       System.out.print(recursion(n));
    }

}
