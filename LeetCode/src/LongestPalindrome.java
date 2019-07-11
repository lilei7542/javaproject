import java.util.ArrayList;

public class LongestPalindrome {
    public static void main(String [] args){
        String rt = process01("");
//        ArrayList<String> arrayList = get01("abc".toCharArray());
//
//        String jkl=arrayList.get(1);
//        System.out.println(arrayList.get(1));
//        if(arrayList.get(1)=="ab"){
//            System.out.println("ture");
//        }


        System.out.println(rt);

        int b=5;

        for(int a=0;a<2;a++){
            b=10;
        }

        System.out.println(b);

    }

    public static ArrayList get01(char[] reversal){
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int j=0;j<reversal.length;j++){
            String tempstring = String.valueOf(reversal[j]);
            arrayList.add(tempstring);
            for(int k=j+1;k<reversal.length;k++){
                tempstring=tempstring+String.valueOf(reversal[k]);
                arrayList.add(tempstring);
            }
        }
        return arrayList;
    }


    public static String process(String s){
        char[] chars=s.toCharArray();
        char[] reversal = new char[chars.length];
        ArrayList<String> arrayList01 = new ArrayList<String>();
        ArrayList<String> arrayList02 = new ArrayList<String>();
        int temp=0;
        for(int i=chars.length-1;i>=0;i--){
            reversal[temp]=chars[i];
            temp++;
        }

        arrayList01=get01(chars);
        arrayList02=get01(reversal);


        System.out.println(arrayList01);
        System.out.println(arrayList02.size());


        String result="ab";

        for(int j=0;j<arrayList01.size();j++){
            for(int k=0;k<arrayList02.size();k++){
                String tempj=arrayList01.get(j);
                String tempk=arrayList02.get(k);
                int templengthj=arrayList01.get(j).length();
                int resultlength=result.length();
                if((tempj.equals(tempk))&&(templengthj>resultlength)){
                    result=tempj;

                }
            }
        }
        return result;
    }

    public static String process01(String s){
        char[] chars=s.toCharArray();
        int slength = s.length();
        String tempi="";
        String result="";
        String empty01="";
        if(slength==1) {
            return s;
        }else if(s.equals(empty01)) {
            return s;
        }else {

            for(int i=0;i<slength;i++){
    //            System.out.println(String.valueOf(chars[i]));

                tempi=String.valueOf(chars[i]);
    //            System.out.println(tempi);
                String tempj="";
                for(int j=i+1;j<slength;j++){
                    tempj=tempj + String.valueOf(chars[j]);
                    String tempa=tempi+tempj;
                    String tempz= reverse(tempa);
//                    System.out.println(tempa);
                    int alength = tempa.length();
    //                System.out.println(alength);
                    int rlength = result.length();
    //                System.out.println(rlength);

                    if((tempa.equals(tempz))&&(alength>rlength)){
    //                if((tempa.equals(tempz))){
                        result=tempa;
    //                    System.out.println(result);
                    }

                }
            }

            if((result=="")&&(s == "")){
                result="";
            }else if((result=="")&&(s != (""))){
                result=String.valueOf(s.charAt(0));
            }

            return result;
        }

    }


    public static String  reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder str2 = stringBuilder.reverse();
        return str2.toString();
    }






}
