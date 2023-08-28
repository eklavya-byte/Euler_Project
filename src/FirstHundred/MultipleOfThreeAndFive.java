package FirstHundred;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class MultipleOfThreeAndFive {
    // naive approach which takes 1000 iterations
    public static int sumOfMultiple(){
        int sum = 0;
        for(int i=1;i<1000;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
            else if(i%3==0){
                sum+=i;
            }
            else if(i%5==0){
                sum+=i;
            }
        }
        return sum;
    }

    //improved way of doing the same
    public static int sumOfMultiThreeFive(int n){
        int range = 9;
        int noOfMultiple = range / n;
        return n * (noOfMultiple * (noOfMultiple + 1)) / 2; //eg. 3+6+9+12.....+999 /2  (n=333)
        /*     let say range is 9 , then 9%3=3
               3*(3*4)/2  == 18 , which is equal to 9+6+3       */
    }


    public static void main(String[] args) {
        System.out.println(MultipleOfThreeAndFive.sumOfMultiple());
        System.out.println(sumOfMultiThreeFive(3)+sumOfMultiThreeFive(5)-sumOfMultiThreeFive(15));
    }
}
