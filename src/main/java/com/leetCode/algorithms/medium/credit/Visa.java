package com.leetCode.algorithms.medium.credit;
/**
 * All Visa numbers start with 4, and Visa uses 13- and 16-digit numbers.
 *
 * @author Ruslan Pipan
 * @version 1.0
 * */
public class Visa implements CheckValid{
    private final LushnessAlgorithm algorithm = new LushnessAlgorithm();

    @Override
    public boolean check(long credit) {
        if (algorithm.algorithm(credit)){
            int temp = 0;
            int count = algorithm.getCount();
            long copyCredit = credit;
            while (copyCredit > 0){
                temp = (int) (copyCredit % 10);
                copyCredit /= 10;
            }
            if (temp == 4 && (count == 13 || count == 16))
                return true;
        }
        return false;
    }



}
