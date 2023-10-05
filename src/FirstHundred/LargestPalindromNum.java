package FirstHundred;

/*  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit number is
    9009 = 91x99.
    find the larges palindrome made from the product of two 3-digit numbers.

    largest number made out of 3x3 digit = 9,98,001 =  (999x999)
    the smallest number made out of 3x3 digit = 10,000 = ( 100x100)


 */

public class LargestPalindromNum {

    public static boolean checkPalindrome(String str){
        int temp = str.length()-1;
        if(str.length()==1){
            return true;
        }
        for(int i=0; i < str.length()/2;i++){
            if(str.charAt(i)==str.charAt(temp)){
                temp--;
            }
            else return false;
        }
        return true;
    }

    // naive approach
    public static int largestPalindrome(){
        int largest = 0;
        for(int i = 100; i <= 999; i++) {
            for(int j=100; j<=999; j++) {
                int N = i * j;
                if(checkPalindrome(String.valueOf(N)) && N > largest) {
                    largest = N;
                }
            }
        }
        return largest;
    }

    // Optimization 1
    public static int largestPalindromeOp1(){
        int largest = 0;
        int count =0;
        for(int i=999;i>=100;i--){
            for (int j = 999; j>=100;j--){
                int N = i * j;
                if (checkPalindrome(String.valueOf(N)) && N > largest){
                    largest = N;
                    count ++;
                    if (count > 1) {
                        return largest;
                    }
                }
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        //System.out.println(checkPalindrome(String.valueOf(101)));
        System.out.println(largestPalindrome());//naive  810000 iteration
        System.out.println(largestPalindromeOp1()); //5487 iteration , 147.62 time faster !
    }
}
