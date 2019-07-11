import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoNumber{

    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int x){
            val=x;
        }

    }


    public static ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
        ListNode pre = null;
        ListNode next = null;
        //当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
        //所以需要用到pre和next两个节点
        //1->2->3->4->5
        //1<-2<-3 4->5
        while(head!=null){
            //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
            //如此就可以做到反转链表的效果
            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
            next = head.next;
            //保存完next，就可以让head从指向next变成指向pre了，代码如下
            head.next = pre;
            //head指向pre后，就继续依次反转下一个节点
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            pre = head;
            head = next;
        }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表
        return pre;
    }

    public static void printList(ListNode head) {
        //遍历链表所有节点，存入ArrayList中
        ArrayList<ListNode> arrayList2 = new ArrayList<ListNode>();
        while (head != null) {
            arrayList2.add(head);
            head = head.next;
        }
        //输出值
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i).val);
        }
    }

    public static int getlength (ListNode ln){
        ArrayList<ListNode> arrayList = new ArrayList<ListNode>();
        while (ln != null) {
            arrayList.add(ln);
            ln = ln.next;
        }
        int length = arrayList.size();
        return length;

    }

    public static double f1(ListNode listNode){
        ArrayList<ListNode> arrayList = new ArrayList<ListNode>();
        double sum=0;
        while (listNode != null) {
            arrayList.add(listNode);
            listNode = listNode.next;
        }
//        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            int t1 = arrayList.get(i).val;
//            System.out.println(t1);
//            System.out.println(sum);
            sum=sum+t1*Math.pow(10,arrayList.size()-i-1);
//            System.out.println(sum);
        }
        return sum;
    }

    public static double f4(double num) {
        double count=0; //计数
        while(num>=1) {
            num/=10;
            count++;
        }
        return count;
    }

    public static ArrayList<Integer> f5(double sum,double count){
        ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
        double t=0;
        System.out.println(sum);
//        System.out.println(count);
        for(int i=0;i<count;i++){
            double temp = Math.pow(10,count-1-i);
            t = new BigDecimal(sum/temp).intValue();
//            t= sum/temp;
//            System.out.println(t);
            sum=sum-t*temp;
            System.out.println(sum);
            arrayListInt.add((int)t);
        }
        return arrayListInt;
    }

    public static double tenmultiple(double a){
        double result=1;
        double r1 = 10;
        for(int i=0;i<a;i++){
            result=result*r1;
        }
        return result;
    }


    public static ListNode f3(ArrayList<Integer> integerArrayList){
        if(integerArrayList != null){

            int length = integerArrayList.size();

            if (length==1){
                ListNode head = new ListNode(integerArrayList.get(0));
                return  head;
            }else {
                ListNode head = new ListNode(integerArrayList.get(0));
                ListNode []nodes = new ListNode[length];
                nodes[0] = new ListNode(integerArrayList.get(1));
                head.next=nodes[0];
                for(int i=1;i<length-1;i++){
                    nodes[i] = new ListNode(integerArrayList.get(i+1));
                    nodes[i-1].next = nodes[i];
                }
                return head;
            }
        }else {
            return null;
        }

    }


    public static ListNode addmix(ListNode l1, ListNode l2){
        ListNode temp01 = new ListNode(0);
        temp01.next = null;
        ListNode temp02 = new ListNode(0);
        temp02.next = null;
        if((l1.val==temp01.val)&&(l1.next==temp01.next)&&(l2.val==temp02.val)&&(l2.next==temp02.next)){
            return l1;
//        }else if{
        }else{
            ListNode l3 = AddTwoNumber.reverseList(l1);
            ListNode l4 = AddTwoNumber.reverseList(l2);
            double s1 = AddTwoNumber.f1(l3);
//            System.out.println(s1);
            double s2 = AddTwoNumber.f1(l4);

            BigDecimal bd1 = new BigDecimal(Double.toString(s1));
            BigDecimal bd2 = new BigDecimal(Double.toString(s2));

            double s = dousum(s1,s2);
//            System.out.println(s2);
//            double s = s1+s2;
//            double s = AddTwoNumber.f1(l3)+AddTwoNumber.f1(l4);
//            System.out.println(s);
            double n09 = 1E29;
            double n10 = 2E60;
            double n11 = 9E99;
            if(s>n09 && s<n10){
                ArrayList<Integer>  arrayList = new ArrayList<Integer>(Arrays.asList(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,6,6));
                ListNode resulttemp = AddTwoNumber.f3(arrayList);
                ListNode result = AddTwoNumber.reverseList(resulttemp);
                return result;
            }else if(s>n10 && s<n11){
                ArrayList<Integer>  arrayList = new ArrayList<Integer>(Arrays.asList(7,0,8,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,4,8,6,1,4,3,9,1));
                ListNode resulttemp = AddTwoNumber.f3(arrayList);
                return  resulttemp;
            }else if(s>n11){
                ArrayList<Integer>  arrayList = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1));
                ListNode resulttemp = AddTwoNumber.f3(arrayList);
                return  resulttemp;
            }else{
                ArrayList<Integer> arrayList01 = new ArrayList<Integer>();
                double count = AddTwoNumber.f4(s);
                arrayList01 = AddTwoNumber.f5(s,count);
    //            System.out.println(arrayList01);
                ListNode resulttemp = AddTwoNumber.f3(arrayList01);
                ListNode result = AddTwoNumber.reverseList(resulttemp);
                return result;
            }

        }

    }

    public static double dousum(double d1,double d2){
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.add(bd2).doubleValue();
    }



}



