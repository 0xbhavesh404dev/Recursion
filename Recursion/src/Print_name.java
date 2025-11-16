public class Print_name {
    public static String recursion(int n){
        String a="hi";
        if(n==1){
            return "hi";
        }

        System.out.println("Hi");
        return recursion(n-1);
    }
    public static void main(String[] args) {
        //recursion(5);
        System.out.println(recursion(5));
    }
}
