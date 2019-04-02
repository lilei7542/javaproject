import java.sql.*;

public class sqlget {
    public static void main (String [] args){
        try{
            Connection a1=DriverManager.getConnection("jdbc:mysql://10.211.55.4:3306/account?useSSL=false", "root", "1");
            Statement b1=a1.createStatement();

            String z1="1";          //name

            String c1="SELECT * from employee where number ='"+z1+"'";
            ResultSet  d1=b1.executeQuery(c1);

            while(d1.next()){
                int e1=d1.getInt(1);
                String e2=d1.getString(2);
                Date e3=d1.getDate(3);
                String e4=d1.getString(4);
                String e5=d1.getString(5);
                System.out.print(e1+"\t"+e2+"\t"+e3+"\t"+e4+"\t"+e5);
            }
            a1.close();
            b1.close();
            d1.close();

        }
        catch (SQLException e)    {
            e.printStackTrace();
        }
    }
}
