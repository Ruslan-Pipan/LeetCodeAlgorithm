package com.leetCode.algorithms.hard.credit;

public class Credit {
    public static void main(String[] args) {
        CheckValid checkMasterCard= new MasterCard();
        CheckValid checkAmericanExpress = new AmericanExpress();
        CheckValid checkVisa = new Visa();
        checkVisa.check(4003600000000014L);
        checkMasterCard.check(5105105105105100L);
    }
}
