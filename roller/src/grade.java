import java.util.Scanner;

public class grade {
    public static void main (String [] args) {
        Scanner level = new Scanner(System.in);
        int a = level.nextInt();
        if (a<0 || a>100){
            System.out.print("out of size");
        }
        else if (a<60){
            System.out.print("不及格");
        }
        else if (a<=85){
            System.out.print("良好");
        }
        else {
            System.out.print("优秀");
        }
    }
}