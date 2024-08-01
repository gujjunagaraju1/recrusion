package recursionOnArrayBasic;

public class CountNumberOfAccorance {
    public static void main(String[] ars){
        int a[]={1,2,3,4,5,5};
        int m=5;

        int total=searchOccurance(a,m,a.length-1);
        System.out.println(total);
    }
    public static int searchOccurance(int a[],int m,int length){
        if (length==-1){
            return 0;

        }
        int count=(a[length]==m)?1:0;
        return count+searchOccurance(a,m,length-1);
    }
}
