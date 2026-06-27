package Day_7.ClassWork;

public class ProductArray {
    public static void main(String[] args){
        int product = 1;
        int [] arr = {1,2,3,4,5,6};
        for(int i = 1;i<6;i++){
            product *= arr[i];
        }
        System.out.println("Product:" + product);
    }
}
