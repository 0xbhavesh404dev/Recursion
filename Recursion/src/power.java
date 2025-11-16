public class power {
    public static int fun(int x,int y){
        if(y==0){
            return 1;
        }
        return x*fun(x,y-1);
    }
    public static void main(String[] args){
        int x=2;
        int y=5;
        System.out.println(fun(x,y));
    }


}
