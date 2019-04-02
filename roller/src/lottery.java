import java.util.Random;

public class lottery {

    public static void getgroup(){
        int b1[] = {1,20,35,66,207123};
        int b2 = (b1.length);
        Random b3 = new Random();
        int b4 = b3.nextInt(b2);
        System.out.print(b1[b4]);

    }

    public static void main (String [] args){
        getgroup();
    }
}

