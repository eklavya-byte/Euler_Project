package FirstHundred;
/*
 The sum of the squares of the first ten natural numbers is,
        1^2 + 2^2 + ... + 10^2 = 385.
 The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)^2 = 55^2 = 3025.
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 Q.Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSqNum {

    // find sum of sq of n
    public static int findSumOfSqNum(int n){
        int sqSum = 0;
        int sum= 0;
        for(int i = 1 ; i<=n;i++){
            sqSum+= i*i;
            sum+=i;
        }
        return (sum*sum)-sqSum;
    }

    // improved way  --pure math 😊
    // Sum of n term = n/2(2a+(n−1)d)
    // sum of sq of n term = n((n+1)(2n+1))/6
    public static int findSumOfSqNum2(int n){
        int sum = n/2*(2+(n-1));
        int sqSum = n*((n+1)*(2*n+1))/6;
        return (int)(Math.pow(sum, 2) - sqSum);
    }


    public static void main(String[] args) {
        System.out.println(findSumOfSqNum(100)); // O(n)
        System.out.println(findSumOfSqNum2(100)); // O(1)

    }
}
