public class simplesqlstring{
    public static void main(String [] args){
        //String a1="abc";
        String a1="abc";
        String b1="hello'"+a1+"'";
        String b2="hello"+a1;
        String b3="hello'";
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

//String sql=" select * from tablelist where name = '张三' ";
//String sql=" select * from tablelist where name = '"+name+"'";

// this is just about hello'
