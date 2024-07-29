package recrusionLeetcode;

public class RotateBinary {
    public static void main(String[] args){
        int arr[]={5,1,3};
        int l=0;
        int h=arr.length-1;
        int target=5;
        System.out.println(search(arr,target,l,h));
    }
    public static int search(int nums[],int target,int l,int h){
        if(l>h){
            return -1;
        }


        int mid=(l+h)/2;
        if(nums[mid]==target){
            return mid;
        }
        if (nums[l]<=nums[mid]){
            if(nums[mid]>target && nums[l]<=target){
                return search(nums,target,l,mid-1);
            }
            else{
                return search(nums,target,mid+1,h);

            }
        }
        else{
            if(nums[mid] < target && target <= nums[h]){
                return search(nums,target,mid+1,h);

            }
            else{
                return search(nums, target, l, mid - 1);
            }
        }





    }
}
