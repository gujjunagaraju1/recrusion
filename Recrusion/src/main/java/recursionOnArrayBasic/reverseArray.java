package recursionOnArrayBasic;

public class reverseArray {
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        int starting=0;
        int ending=arr.length-1;
        int a[]=new int[arr.length];
        reverse(arr,starting,ending,a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static int[] reverse(int arr[],int starting,int ending,int a[]){
        if (ending==-1){
            return a;
        }
        else{
            a[starting]=arr[ending];
            return reverse(arr,starting+1,ending-1,a);
        }
    }
}
