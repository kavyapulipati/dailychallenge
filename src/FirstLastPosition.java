public class FirstLastPosition {
    private int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                first = i;
                while(i < nums.length && nums[i] == target) {
                    i++;
                }
                last = i - 1;
                return new int[]{first, last};
            }
        }
        return new int[]{first, last};
    }
    public static void main(String []args){
        int []num =new int[] {5,7,7,8,8,10};
        int []ans=new int[2];
        int n=8;
        FirstLastPosition fl=new FirstLastPosition();
        ans=fl.searchRange(num,n);
        System.out.println(ans[0]);
        System.out.print(ans[1]);
    }
}
