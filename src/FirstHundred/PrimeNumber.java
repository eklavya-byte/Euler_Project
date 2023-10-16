package FirstHundred;

/*  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10,001st prime number?
 */
public class PrimeNumber {
    
    static boolean checkPrime(int n){
        if(n<1){
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    static int nthPrimeNum(int nth){
        
        int n_sum = 0;
        int prime = 0;
        int num = 1;

        while (n_sum<=nth){
            if(checkPrime(num)){
                n_sum++;
                prime=num;
            }
            num++;
        }

       return prime;
    }

    public static void main(String[] args) {
        System.out.println("The nth prime number is : "+nthPrimeNum(10001)); //104743
    }
}
