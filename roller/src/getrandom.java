import java.util.Random;

public class getrandom {
    public static void main (String [] args){
        Random a = new Random();
        int b1;
        float b2;
        double b3;
        b1 = a.nextInt(200);
        b2 = a.nextFloat();
        b3 = a.nextDouble();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
