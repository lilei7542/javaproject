interface a{
    public static final String msg = "hello";
    public  abstract void print();
}

interface b{
    public abstract void get();
}

class c implements a,b{
    @Override
    public void print(){
        System.out.println("接口A的抽象方法print()");
    }
    @Override
    public  void get(){
        System.out.println("接口B的抽象方法print()");
    }
}

public class port2{
    public static void main(String [] args){
        c c1=new c();
        a a1=c1;
        b b1=c1;
        a1.print();
        b1.get();
    }
}


/*
继承多个类，叫多重继承
在java中不充许继两个或两个以上的类
像这样class c extends a ,b是不充许的
但可以用一种间接的方式实现：接口
class c extends a implements c,d....是可以的*/
