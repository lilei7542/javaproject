interface Common {
    double runTimer(double a, double b, double c);
    String getName();
}

class Car implements Common{
    public double runTimer(double a,double b,double c){
        return (a+b+c);
    }
    public String getName(){
        return "Car";
    }
}

class Plane implements Common {
    public double runTimer(double a,double b ,double c){
        return (a*b*c);
    }
    public String getName(){
        return  "Plane";
    }
}

class Ship implements Common {
    public double runTimer(double a,double b,double c){
        return (a*b/c);
    }
    public String getName(){
        return  "Ship";
    }
}

public class port1{
    public  static void main(String [] args ) {
        double s1= 1.2;
        double s2= 2.7;
        double s3= 8.9;

        Common n = new Car();
        System.out.println(n.getName()+"'"+" time = "+n.runTimer(s1,s2,s3));
        n = new Plane();
        System.out.println(n.getName()+"'"+" time = "+n.runTimer(s1,s2,s3));
        n = new Ship();
        System.out.println(n.getName()+"'"+" time = "+n.runTimer(s1,s2,s3));


    }
}