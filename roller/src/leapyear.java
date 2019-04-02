import java.util.Scanner;

public class leapyear {


    public static void main (String [] args){
        Scanner a1 = new Scanner(System.in);
        int r1 = a1.nextInt();   // year
        int r2 = a1.nextInt();   // month
        int r3;
        int r4;
        r3=Getyear(r1);
        r4=Getmonth(r2,r3);
    }

    public static int Getyear (int b1){
        int z1;               //intialize z1
        if ( b1%400 == 0){
            z1 = 0;     //z1 为0 闰年
        }
        else if( b1%100 == 0 ){
            z1 = 1;
        }
        else if (b1%4 == 0){
            z1 = 0;
        }
        else {
            z1 = 1;
        }
        return z1;
    }

    public static int Getmonth (int b2 , int c1){
        switch (b2)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30");
                break;
            case 2:
                if (c1 == 0){
                    System.out.print("29");
                }
                else{
                    System.out.print("28");
                }
                break;
            default:
                System.out.print("out of size");
        }
        return b2;
    }
}
