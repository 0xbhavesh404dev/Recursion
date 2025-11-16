import java.util.Scanner;
public class try1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int g=sc.nextInt();
        int rem=0;
        int rem1=0;
        int rem2=0;
        for(int i=0;i<=g;i++){
            rem=g%10;
            rem1=(g%10)%10;
            rem2=rem1%10;
        }
        if((rem>rem1) && (rem>rem2)){
            System.out.println("ONES");
        }else if(rem1>rem&&rem1>rem2){
            System.out.println("TENS");
        }else{
            System.out.println("HUNDEREDS");
        }
    }
}