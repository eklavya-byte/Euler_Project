package FirstHundred;
/*
        2520 is the smallest number that can be divided by each of the numbers from 1
         to 10 without any remainder.
         What is the smallest positive number that is evenly divisible by all of the numbers from
         1 to 20 ?
         */


import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {

    public static boolean checkSmallest(long num, int start, int end){
        boolean result = true;
        for (int i=start;i<=end;i++){
            if(num % i !=0){
                return false;
            }
        }
        return result;
    }

    // Function to calculate the GCD of two numbers
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }


    public static long smallestMultiple(List<Long> numbers ){
        long result = 1;
        for (long number : numbers) {
            result = lcm(result, number);
        }
        return result;

    }



    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        for(int i = 1 ; i<= 20 ; i++){
            list.add((long)i);
        }
        System.out.println(checkSmallest(smallestMultiple(list),1,20));
        System.out.println(smallestMultiple(list));
    }
}
