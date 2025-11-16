public class max_array {
    public static int fun(int[] arr,int y, int max){

        if(y==0){
            return arr[0];
        }
        if(arr[y]>max){
            max=arr[y];
        }
//        System.out.println(max);
        int x = fun(arr,y-1,max);
        return Math.max(x, max);
//        if (y == -1) return Integer.MIN_VALUE;
//        return Math.max(arr[y], fun(arr, y-1));
}
public static void main(String[] args){
    int[] arr={10,0,3,55,6,10,9,3};
    int max=arr[0];
    int y=7;
//    fun(arr,y,max);
    System.out.println(fun(arr,y, max));

    }
}

