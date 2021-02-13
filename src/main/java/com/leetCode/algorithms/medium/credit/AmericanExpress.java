package com.leetCode.algorithms.medium.credit;

/**
 * All American Express numbers start with 34 or 37;
 *
 * @author Ruslan Pipan
 * @version 1.0
 * */
public class AmericanExpress implements CheckValid{
    private final LushnessAlgorithm algorithm = new LushnessAlgorithm();

    @Override
    public boolean check(long credit) {
        long copyCredit = credit;
        if (algorithm.algorithm(credit)){
            for (int i = algorithm.getCount() - 2; i > 0; i--)
                copyCredit /= 10;
        }
        return copyCredit == 34 || copyCredit == 37;
    }

}
