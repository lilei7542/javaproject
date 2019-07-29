public class Zconvert {
    public static void main(String[] args){
        String result = process("abcdefghddd",3);
        System.out.println(result);
    }

    public static String process(String s,int n){

        if(n==1){
            return s;
        }

        int loc = 0;
        boolean down=false;
        int len = Math.min(s.length(),n);
        String[] rows = new String[len];
        for(int j=0;j<len;j++)rows[j]="";


        for(int i=0;i<s.length();i++){
            rows[loc]+=s.substring(i,i+1);

            if(loc==0 || loc == n-1){
                down=!down;
            }
            loc+=down?1:-1;

        }

        String result = "";

        for(String temp : rows){
            result+=temp;
        }
        return result;

    }


}
