import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String [] args){
        int c = process("abdabcede");
        System.out.println(c);
    }

    public static int process(String s){
        int result=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(getboolean(s,i,j)) result=Math.max(result,j-i);
            }
        }
        return result;


    }
    public static boolean getboolean(String s,int start,int end){
        char[] chars=s.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        for(int i=start;i<end;i++){
            Character c = s.charAt(i);
            if(set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }




}
