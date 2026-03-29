



//    This is the TCS questions.
// given a purchees amount , apply a discound base  on lab and print the final payable amount rounded to 2 decimal places. 


// 5% dis  amout < 1000;
//1000<= amount < 5000;
//amount >= 5000;

// input -> single integar - the purchase amount 
// output -> final amount after discound print  to 2 decimal places (eg 760.00) .

// final mount =  Amount - (Amount  * discount rate )

// simple if-else - check the slab boundaries in correct : <1000 first < 5000then  =>5000 else

import java.util.Scanner;

public class discountCalofAmount { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double amount ;
        amount = sc.nextDouble();
        double discount;

        if(amount<1000){
            discount = 0.05;  //5%

        }else if(amount < 5000){
            discount =10.0; //10.0%
        }
        else {
            discount= 15.0; //15.0%
        }
        double finalAmount = amount * (1 - discount);

        System.out.printf("%.2f", finalAmount);

        sc.close();

    }    
}
