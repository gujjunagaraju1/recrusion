package recursionOnArrayBasic;

public class pattern {
    public static void main(String[] args){
        //Right side half pyramid
        search(2,0);
    }
    public static void search(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){

            search(r,c+1);
            System.out.print("*");

        }
        else {


            search(r -1, 0);
            System.out.println(" ");
        }
    }
}
