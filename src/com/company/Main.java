package com.company;

public class Main {

    public static void main(String[] args) {
	//Homework 1:
    /*
    A B | NOT (A && B) | A NAND A | (A NAND A) NAND (B NAND B)
    T T   F              F          true
    T F   T              F          true
    F T   T              T          true
    F F   T              T          false
    A NAND A corresponds to negation so NOT
    (A NAND A) NAND (B NAND B) corresponds to the logical OR
     */

    //Homework 2:
    boolean A = true;
    boolean B = true;
    boolean statement = A==B;
    boolean statement_2 = !((A && !B) || (!A && B));
    boolean statement_3;
    System.out.println(statement + " " + statement_2);

    //Homework 3:
    boolean found = false;
    for(int i = 1; !found; i++){
        if (i % 387 == 0 && i % 6381 == 0){
            found = true;
            System.out.println(i);
        }
    }

    //Homework 4:
    int number = 24;
    boolean isPrime = true;
    for (int j = 2; j <= number/2; j++) {
        if ((number % j == 0)){
            isPrime = false;
        }
    }
    if (isPrime)
        System.out.println(number + " is a prime number.");
    else
        System.out.println(number + " is not a prime number.");

    }
}
