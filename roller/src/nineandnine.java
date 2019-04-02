public class nineandnine {
    public static void main (String [] args){
        int a;  //第几行
        int b;  //第几个数
        int c;
        String A;
        String B;
        for( a=1,b=1; a<10 && b<10; a++,b++ ){
            A=String.valueOf(a);
            B=String.valueOf(b);

            for (c=0;c<=a;c++){
                System.out.print(A+"*"+B+"="+ a*b +"\t");
                //System.out.print(a+"*"+b+"="+ a*b +"\t");
            }
            System.out.print("\n");
        }
    }
}

//  s=String.valueOf(i);
//  i=Integer.parseInt(s);

/*  simple user of print
System.out.print(A);
System.out.print("*");
System.out.print(B);
System.out.print("=");
System.out.print(a*b);
System.out.print("\t");
*/

/*  medial user of print
System.out.print(A+"*"+B+"="+ a*b +"\t" + "\n");
*/
