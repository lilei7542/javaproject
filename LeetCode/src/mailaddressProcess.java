import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class mailaddressProcess {
    public static void main(String [] args){
        String [] emails = {"jack@baidu.com","jack.ad@baidu.com","jack+tom@baidu.com","jack+tom@bai.du.com","jack@bai.du.com"};
        int result=numUniqueEmails(emails);
        System.out.println(result);
    }

    public static int numUniqueEmails(String[] emails) {
        String temp;
        String temp01;

        int number=0;
        int atnumber=0;
        int plusnumber=0;

        char plus=("+").charAt(0);
        char at=("@").charAt(0);

        List<String> list = new ArrayList();
        List<String> frontList = new ArrayList();
        List<String> frontListResult1 = new ArrayList();
        List<String> frontListResult2 = new ArrayList();
        List<String> endList = new ArrayList();
        List<String> result = new ArrayList();

        StringBuilder c1 = new StringBuilder();
        StringBuilder c2 = new StringBuilder();
        StringBuilder c3 = new StringBuilder();

        for(int i=0;i<emails.length;i++){
            temp=emails[i];

/*            for (int j=0;j<temp.length();j++){
                if (temp.charAt(j) == at){
                    atnumber=j;
                    break;
                }
            }
            for(int x=0;x<atnumber;x++){
                c1.append(temp.charAt(x));
            }
            frontList.add(c1.toString());
            c1.setLength(0);*/

            atnumber=needcharFunction(temp,frontList,c1,at,atnumber);

            for(int y=atnumber;y<temp.length();y++){
                c2.append(temp.charAt(y));
            }
            endList.add(c2.toString());
            c2.setLength(0);
        }

        System.out.println(frontList);
        System.out.println(endList);

        for(int l1=0;l1<frontList.size();l1++){
            frontListResult1.add(frontList.get(l1).replace(".",""));
        }
        System.out.println(frontListResult1);

        for(int l2=0;l2<frontListResult1.size();l2++){
            temp01=frontListResult1.get(l2);
            plusnumber=temp01.length();
            needcharFunction(temp01,frontListResult2,c3,plus,plusnumber);
/*            for (int z=0;z<temp01.length();z++){
                if(temp01.charAt(z) == plus){
                    plusnumber=z;
                    break;
                }
            }

            for(int m=0;m<plusnumber;m++){
                c3.append(temp01.charAt(m));
            }
            frontListResult2.add(c3.toString());
            c3.setLength(0);*/
        }

        for(int n=0;n<frontList.size();n++){
            result.add(n,frontListResult2.get(n)+endList.get(n));
        }

        System.out.println(result);

        number=removeDuplicate(result).size();

        return number;

    }

    public static List removeDuplicate(List list) {
        HashSet h = new HashSet(list);
        list.clear();
        list.addAll(h);
        return list;
    }

    public static int needcharFunction(String temp, List<String> list,StringBuilder c,char needchar,int needcharnumber){
        for (int i=0;i<temp.length();i++){
            if(temp.charAt(i) == needchar){
                needcharnumber=i;
                break;
            }
        }
        for(int j=0;j<needcharnumber;j++){
            c.append(temp.charAt(j));
        }
        list.add(c.toString());
        c.setLength(0);
        return needcharnumber;
    }


}