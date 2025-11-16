import java.util.*;
import java.lang.*;
import java.io.*;
//System.out.println("no");
class Codechef
{
    public static Scanner sc=new Scanner(System.in);
    public static void function(int x,int y,int z){
        int s=0;
        if(x%3!=0){
            s=x/3;
        }
        int tot=(s*z)+x*y;
        System.out.println(tot);


    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            function(x,y,z);
        }



    }


}
