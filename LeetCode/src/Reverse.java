import java.util.*;


/**
 * @author lilei
 * DATA 2020.8.13
 **/


public class Reverse {

    public static int binary_minimal=-2147483648;

    public static void main(String[] args){
        int a =process(1534236469);
        System.out.println(a);
    }

    public static int process(int x){
        int a1=x>0?x:-x;
        a1=String.valueOf(a1).length();
        int result=0;
        int tmp=0;

        //Stack stack = new Stack();

        for(int a2=0,a3=0;a2<a1;a2++){
            a3=x/(int)(Math.pow(10,a1-1-a2));
            x=x%(int)(Math.pow(10,a1-1-a2));
            if(a3!=0){
                int a4=(int)(Math.pow(10,a2));

                if(a3 > 2 && a4 >=(int)(Math.pow(10,9))){

                    return 0;

                }
                if(a3 < -2 && a4 >=(int)(Math.pow(10,9))){
                    return 0;
                }

                tmp=a3*(int)(Math.pow(10,a2));
                int z=tmp+result;
                if(tmp > 0 && result > 0 && z < 0){
                    return 0;
                }
                if(tmp < 0 && result < 0 && z > 0){
                    return 0;
                }
                result+=tmp;
            }

        }

        if(result==binary_minimal){
            return 0;
        }

        return result;

    }

/*
    public static int ifoverloadAdd(int x, int y){
        int z=x+y;
        if(x > 0 && y > 0 && z < 0){
            return 0;
        }
        if(x < 0 && y < 0 && z > 0){
            return 0;
        }
        return x;
    }

    public static int ifoverloadMult(int x, int y){
        if(x > 2 && y >=(int)(Math.pow(10,9))){
            return 0;
        }
        if(x < -2 && y >=(int)(Math.pow(10,9))){
            return 0;
        }
        return x;
    }

*/


}
