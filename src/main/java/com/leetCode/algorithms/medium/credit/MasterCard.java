package com.leetCode.algorithms.medium.credit;

/**
 * Most MasterCard numbers start with 51, 52, 53, 54, or 55;
 *
 *
 * @author Rislan Piapn
 * @version 1.0
 * */
public class MasterCard  implements CheckValid{
    private static final LushnessAlgorithm algorithm = new LushnessAlgorithm();
    @Override
    public boolean check(long credit) {
        long copyCredit = credit;
        if (algorithm.algorithm(credit))
            for (int i = algorithm.getCount() - 2; i > 0; i--)
                copyCredit /= 10;

        return copyCredit == 51 || copyCredit == 52 || copyCredit == 53 || copyCredit == 54 || copyCredit ==55;
    }
}
