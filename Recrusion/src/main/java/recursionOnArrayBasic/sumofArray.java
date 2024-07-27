package recursionOnArrayBasic;

public class sumofArray {
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        System.out.println(sumArray(arr,0,0));
    }
    public static int sumArray(int arr[],int index,int sum){
        if (index==arr.length){
            return sum;
        }

        return sumArray(arr,index+1,sum+arr[index]);

    }
}
