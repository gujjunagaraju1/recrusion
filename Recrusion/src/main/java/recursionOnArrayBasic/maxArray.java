package recursionOnArrayBasic;

public class maxArray {
    public static void main(String[] args){
        int arr[]={13,21,9282,92,987765};
        System.out.println(maxElement(arr,arr.length));
    }
    public static int maxElement(int arr[],int index){
        if (index==1){
            return arr[0];
        }
        return Math.max(arr[index-1],maxElement(arr,index-1));
    }
}
