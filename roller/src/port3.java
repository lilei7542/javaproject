interface USB{
    public void install();
    public String display();
}

class computer implements USB{
    public void install(){
        System.out.println("computer have been install");
    }
    public String display(){
        return "welcome computer";
    }
}

class ipad implements USB{
    public void install(){
        System.out.println("ipad have been install");
    }
    public String display(){
        return "welcome ipad";
    }
}

public class port3{
    public static void main(String [] args){
        USB n = new computer();
        n.install();
        System.out.println(n.display());
        n = new ipad();
        n.install();
        System.out.print(n.display());
    }
}