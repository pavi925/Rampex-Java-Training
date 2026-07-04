package Day_11.ClassTask;


public class CheckAmstrong {




    public static void main(String [] args){

        System.out.print(checkAmstrong(153)) ;
    }

    // check Amstrong

    public static boolean checkAmstrong(int num){


        int temp =num;

        int original =num;
        int digit=0;
        //count how many digits in the number

        while(temp!=0){

            temp= temp/10;
            digit++;
        }

//add the numbers with the digit power

        int sum =0;
        int  rem;
        while(num!=0){

            rem =num%10;
            sum = sum+(int)(Math.pow(rem,digit));

            num =num/10;

        }
        // compare the num and the sum then return the boolean

        if(original==sum){
            return true;
        }
        else{
            return false;
        }
    }
}