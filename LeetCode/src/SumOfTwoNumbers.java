public class SumOfTwoNumbers {
    public static void main(String [] args){
        int[] nums;
        nums=new int[]{-3,4,3,90};
        //  int[] nums=new int[]{2,3,7,9,11,15}         //same with
        process(nums,0);
    }

    public static int [] process(int[] nums,int target){
        int a = nums.length;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int [] result = new int[2];
        for(int j=0;j<a;j++){
            for(int k=j+1;k<a;k++){
                c=nums[j]+nums[k];
                if(c==target) {
                    result[0]=j;
                    result[1]=k;
                    break;
                }
            }
        }
        return result;
    }
}
