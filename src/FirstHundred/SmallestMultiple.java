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


    //naive approach
    public static int smallestMultiple(){
        //finding number which can be divided by all
        List<Integer> rangeOfNum = new ArrayList<>();
        for(int i=1;i<=20;i++){
            rangeOfNum.add(i);
        }
        int sm = 1;
        int num =20;

        for(int i = 20; i <= rangeOfNum.size() && i > 1;i--){

            for (int j=2;j<=rangeOfNum.size()-1 ;j++){
                System.out.println(j);
                if(i%rangeOfNum.get(j)==0){
                    System.out.println(i+""+rangeOfNum.get(j));

//                        rangeOfNum.add(j,0);


                }
            }

        }

        System.out.println(rangeOfNum.toString());


        for(int i:rangeOfNum){
            sm*=i;
        }

        return sm;
    }

    public static boolean checkSmallest(int num, int start, int end){
        boolean result = true;
        for (int i=start;i<=end;i++){
            if(num % i !=0){
                return false;
            }
        }
        return result;
    }



    public static void main(String[] args) {

        System.out.println(checkSmallest(2520,1,10));
        System.out.println(smallestMultiple());
    }
}
