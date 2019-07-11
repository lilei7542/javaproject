public class powerOfTwo {
    public static void main(String [] args){
        process(1024);
    }

    public static boolean process(int a){
        if(a==0){
            return false;
        }else{
            double result = log(a,2);
            int b = (int)result;
            int d = (int)Math.pow(2,b);
            if((d==a)){
                return true;
            }else{
                return false;
            }
        }
    }
    public static double log (double value,double base){
        return Math.log(value)/Math.log(base);
    }

}
