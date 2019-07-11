public class FindMedianSortedArrays {
    public static void main(String [] args){
        int[]a = {1,2};
        int[]b = {3,4};
        process(a,b);

    }

    public static double process(int[] nums1,int[] nums2){
        int[] nums3 = new int[nums1.length+nums2.length];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
            count++;
        }
        for(int j=0;j<nums2.length;j++){
            nums3[count++]=nums2[j];
        }
        for (int i = nums3.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (nums3[j] > nums3[j+1])
                {
                    int temp = nums3[j];
                    nums3[j] = nums3[j+1];
                    nums3[j+1] = temp;
                }
            }
        }
        double result=0.0;
        if(nums3.length%2==0){
            result=(nums3[nums3.length/2-1]+nums3[nums3.length/2])/2.0;
        }else if(nums3.length==1){
            result=nums3[0];
        }else {
            result=nums3[nums3.length/2];
        }
        return result;
    }

}
