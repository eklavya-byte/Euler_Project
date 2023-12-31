package FirstHundred;
/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with and ,
the first terms will be:
            =>    1, 2, 3, 5, 8, 13, 21, 34, 55, 89 .....
By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.
* */
public class Even_Fibo_No {
    // using recursion
    public static int evenFibo(int currentFibo, int nextFibo, int limit) {
        if (currentFibo > limit) {
            return 0;
        }
        int sum = 0;
        if (currentFibo % 2 == 0) {
            sum += currentFibo;
        }
        int intermediate = currentFibo; // intermediate for flipping the value ;

        currentFibo = nextFibo;
        nextFibo+=intermediate;

        return sum + (evenFibo(currentFibo, nextFibo, limit));
    }


    static int usingLoops(){
        int sum = 0;
        int previous = 0;
        int next= 1;
        while (next < 4000000) {
            if ((previous + next) % 2 == 0) {
                sum += previous + next;
            }
            int temp = previous;
            previous = next;
            next = temp + next;

        }
        return sum;
    }



    public static void main(String[] args) {
        int c = 1;
        int next = 2;
        int limit = 4000000;

        System.out.println(Even_Fibo_No.evenFibo(c,next,limit));
        System.out.println(Even_Fibo_No.usingLoops());
    }
}
