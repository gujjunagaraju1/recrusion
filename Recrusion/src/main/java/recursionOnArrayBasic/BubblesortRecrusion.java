package recursionOnArrayBasic;

public class BubblesortRecrusion {
    public static void main(String [] args){
        int arr[]={1,4,2,3};
        search(arr,arr.length-1,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void search(int arr[],int r,int c){
        if (r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            search(arr,r,c+1);
        }
        else {
            search(arr,r-1,0);
        }
    }
}
