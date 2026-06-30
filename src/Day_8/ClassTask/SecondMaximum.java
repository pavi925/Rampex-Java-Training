package Day_8.ClassTask;

public class SecondMaximum {
    public static void main(PrintName[] args){
        int s_max = 0;
        int max = 0;
        int [] arr = {1,2,3,4,5};
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                s_max = max;
                max = arr[i];
            }else if(arr[i] > s_max && s_max != max){
                s_max = arr[i];
            }
        }
        System.out.println("Second maximum value:" + s_max);
        System.out.println("Maximum value: " + max);
    }
}

