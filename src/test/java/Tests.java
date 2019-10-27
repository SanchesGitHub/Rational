import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testConstructorWithPositiveNumbers() {
        Rational number = new Rational(1,2);
        assertEquals("Constructor returns wrong numerator", 1, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, number.getDenominator());
    }

    @Test
    public void testConstructorWithNegativeNumerator() {
        Rational number = new Rational(-5,2);
        assertEquals("Constructor returns wrong numerator", -5, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, number.getDenominator());
    }

    @Test
    public void testConstructorWithNegativeDenominator() {
        Rational number = new Rational(4,-3);
        assertEquals("Constructor returns wrong numerator", -4, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 3, number.getDenominator());
    }

    @Test
    public void testConstructorWithTwoNegativeNumbers() {
        Rational number = new Rational(-3,-4);
        assertEquals("Constructor returns wrong numerator", 3, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 4, number.getDenominator());
    }

    @Test
    public void testConstructorForInteger() {
        Rational number = new Rational(2,1);
        assertEquals("Constructor returns wrong numerator", 2, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 1, number.getDenominator());
    }

    @Test
    public void testArithmeticException() {
        try {
            new Rational(1,0);
        } catch(ArithmeticException e) {
            assertTrue("Not ArithmeticException", e.toString().contains("ArithmeticException"));
            assertTrue("Incorrect error description", e.toString().contains("division by zero !"));
        }
    }

    @Test
    public void testFractionReduction() {
        Rational number = new Rational(5,10);
        assertEquals("Constructor returns wrong numerator", 1, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, number.getDenominator());
    }

    @Test
    public void testFractionReductionWithNegativeNumerator() {
        Rational number = new Rational(-4,8);
        assertEquals("Constructor returns wrong numerator", -1, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, number.getDenominator());
    }

    @Test
    public void testFractionReductionWithNegativeDenominator() {
        Rational number = new Rational(4,-8);
        assertEquals("Constructor returns wrong numerator", -1, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, number.getDenominator());
    }

    @Test
    public void testFractionReductionWithTwoNegativeNumbers() {
        Rational number = new Rational(-2,-3);
        assertEquals("Constructor returns wrong numerator", 2, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 3, number.getDenominator());
    }

    @Test
    public void testFractionReductionForInteger() {
        Rational number = new Rational(10,5);
        assertEquals("Constructor returns wrong numerator", 2, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 1, number.getDenominator());
    }

    @Test
    public void testToString() {
        Rational number = new Rational(-5,2);
        assertEquals("Incorrect conversion to String", "-5/2", number.toString());
    }

    @Test
    public void testPlus() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(3,4);

        Rational three = one.plus(two);
        assertEquals("Wrong plus numerator", 5, three.getNumerator());
        assertEquals("Wrong plus denominator", 4, three.getDenominator());
    }

    @Test
    public void testPlusWithOneNegativeObject() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(3,-4);

        Rational three = one.plus(two);
        assertEquals("Wrong plus numerator", -1, three.getNumerator());
        assertEquals("Wrong plus denominator", 4, three.getDenominator());
    }

    @Test
    public void testZeroPlus() {
        Rational one = new Rational();
        Rational two = new Rational(3,4);

        Rational three = one.plus(two);
        assertEquals("Wrong plus numerator", 3, three.getNumerator());
        assertEquals("Wrong plus denominator", 4, three.getDenominator());
    }

    @Test
    public void testMinus() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(3,4);

        Rational three = one.minus(two);
        assertEquals("Wrong minus numerator", -1, three.getNumerator());
        assertEquals("Wrong minus denominator", 4, three.getDenominator());
    }

    @Test
    public void testMinusWithOneNegativeObject() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(3,-4);

        Rational three = one.minus(two);
        assertEquals("Wrong minus numerator", 5, three.getNumerator());
        assertEquals("Wrong minus denominator", 4, three.getDenominator());
    }

    @Test
    public void testZeroMinus() {
        Rational one = new Rational();
        Rational two = new Rational(3,4);

        Rational three = one.minus(two);
        assertEquals("Wrong minus numerator", -3, three.getNumerator());
        assertEquals("Wrong minus denominator", 4, three.getDenominator());
    }

    @Test
    public void testMultiply() {
        Rational one = new Rational(2,3);
        Rational two = new Rational(3,4);

        Rational three = one.multiply(two);
        assertEquals("Wrong multiply numerator", 1, three.getNumerator());
        assertEquals("Wrong multiply denominator", 2, three.getDenominator());
    }

    @Test
    public void testMultiplyWithOneNegativeObject() {
        Rational one = new Rational(2,-3);
        Rational two = new Rational(3,4);

        Rational three = one.multiply(two);
        assertEquals("Wrong multiply numerator", -1, three.getNumerator());
        assertEquals("Wrong multiply denominator", 2, three.getDenominator());
    }

    @Test
    public void testZeroMultiply() {
        Rational one = new Rational();
        Rational two = new Rational(3,-4);

        Rational three = one.multiply(two);
        assertEquals("Wrong multiply numerator", 0, three.getNumerator());
        assertEquals("Wrong multiply denominator", 1, three.getDenominator());
    }

    @Test
    public void testDivide() {
        Rational one = new Rational(2,3);
        Rational two = new Rational(3,4);

        Rational three = one.divide(two);
        assertEquals("Wrong divide numerator", 8, three.getNumerator());
        assertEquals("Wrong divide denominator", 9, three.getDenominator());
    }

    @Test
    public void testDivideWithOneNegativeObject() {
        Rational one = new Rational(2,3);
        Rational two = new Rational(3,-4);

        Rational three = one.divide(two);
        assertEquals("Wrong divide numerator", -8, three.getNumerator());
        assertEquals("Wrong divide denominator", 9, three.getDenominator());
    }

    @Test
    public void testZeroDivide() {
        Rational one = new Rational();
        Rational two = new Rational(3,-4);

        Rational three = one.divide(two);
        assertEquals("Wrong divide numerator", 0, three.getNumerator());
        assertEquals("Wrong divide denominator", 1, three.getDenominator());
    }

    @Test
    public void testExceptionDivisionByZero() {
        Rational two = new Rational(3,-4);
        Rational one = new Rational();

        try {
            two.divide(one);
        } catch(ArithmeticException e) {
            assertTrue("Not ArithmeticException", e.toString().contains("ArithmeticException"));
            assertTrue("Incorrect error description", e.toString().contains("division by zero !"));
        }

    }

    @Test
    public void testEquals() {
        Rational one = new Rational(2,-3);
        Rational two = new Rational(4,-6);

        assertTrue("Objects are not equal", one.equals(two));
    }

    @Test
    public void testNotEquals() {
        Rational one = new Rational(2,3);
        Rational two = new Rational(4,-6);

        assertFalse("Objects are equal", one.equals(two));
    }


    @Test
    public void testEqualsNull() {
        Rational one = new Rational(2,3);
        Rational two = null;

        assertFalse("Objects not null", one.equals(two));
    }

    @Test
    public void testLess() {
        Rational one = new Rational(2,3);
        Rational two = new Rational(1,2);

        assertTrue("Objects are not less", one.less(two));
    }

    @Test
    public void testNotLess() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(2,3);

        assertFalse("Objects are less", one.less(two));
    }

    @Test
    public void testLessWithEqualsNumber() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(1,2);

        assertFalse("Objects are less", one.less(two));
    }

    @Test
    public void testLessOrEqual() {
        Rational one = new Rational(2,3);
        Rational two = new Rational(1,2);

        assertTrue("Objects are not less or equal", one.lessOrEqual(two));
    }

    @Test
    public void testNotLessOrEqual() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(2,3);

        assertFalse("Objects are less or equal", one.lessOrEqual(two));
    }

    @Test
    public void testLessOrEqualWithEqualsNumber() {
        Rational one = new Rational(1,2);
        Rational two = new Rational(1,2);

        assertTrue("Objects are not less or equal", one.lessOrEqual(two));
    }
}