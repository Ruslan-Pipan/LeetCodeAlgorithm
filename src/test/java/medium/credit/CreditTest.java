package medium.credit;

import com.leetCode.algorithms.hard.credit.AmericanExpress;
import com.leetCode.algorithms.hard.credit.CheckValid;
import com.leetCode.algorithms.hard.credit.MasterCard;
import com.leetCode.algorithms.hard.credit.Visa;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreditTest {

    @Test
    public void check_identifies_AMEX_1_test(){
        CheckValid checkValid = new AmericanExpress();
        assertTrue(checkValid.check(378282246310005L));
    }

    @Test
    public void check_identifies_AMEX_2_test(){
        CheckValid checkValid = new AmericanExpress();
        assertTrue(checkValid.check(371449635398431L));
    }
    @Test
    public void check_identifies_Master_card_1_test(){
        CheckValid checkValid = new MasterCard();
        assertTrue(checkValid.check(5555555555554444L));
    }
    @Test
    public void check_identifies_Master_card_2_test(){
        CheckValid checkValid = new MasterCard();
        assertTrue(checkValid.check(5105105105105100L));
    }
    @Test
    public void check_identifies_Visa_1_test(){
        CheckValid checkValid = new Visa();
        assertTrue(checkValid.check(4111111111111111L));
    }
    @Test
    public void check_identifies_Visa_2_test(){
        CheckValid checkValid = new Visa();
        assertTrue(checkValid.check(4012888888881881L));
    }
    @Test
    public void check_invalid_Visa_1_test(){
        CheckValid checkValid = new Visa();
        assertFalse(checkValid.check(44003600000000014L));
    }
    @Test
    public void check_invalid_all_1_test(){
        long cart = 1234567890L;
        CheckValid m = new MasterCard();
        CheckValid v = new Visa();
        CheckValid a = new AmericanExpress();
        assertFalse(m.check(cart));
        assertFalse(v.check(cart));
        assertFalse(a.check(cart));
    }
    @Test
    public void check_invalid_all_2_test(){
        long cart = 369421438430814L;
        CheckValid m = new MasterCard();
        CheckValid v = new Visa();
        CheckValid a = new AmericanExpress();
        assertFalse(m.check(cart));
        assertFalse(v.check(cart));
        assertFalse(a.check(cart));
    }
    @Test
    public void check_invalid_all_3_test(){
        long cart = 4062901840L;
        CheckValid m = new MasterCard();
        CheckValid v = new Visa();
        CheckValid a = new AmericanExpress();
        assertFalse(m.check(cart));
        assertFalse(v.check(cart));
        assertFalse(a.check(cart));
    }
    @Test
    public void check_invalid_all_4_test(){
        long cart = 5673598276138003L;
        CheckValid m = new MasterCard();
        CheckValid v = new Visa();
        CheckValid a = new AmericanExpress();
        assertFalse(m.check(cart));
        assertFalse(v.check(cart));
        assertFalse(a.check(cart));
    }
    @Test
    public void check_invalid_all_5_test(){
        long cart = 4111111111111113L;
        CheckValid m = new MasterCard();
        CheckValid v = new Visa();
        CheckValid a = new AmericanExpress();
        assertFalse(m.check(cart));
        assertFalse(v.check(cart));
        assertFalse(a.check(cart));
    }
}

