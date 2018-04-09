import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculateTest {
    Calculate calc = new Calculate();

       //Testing the numerator operations
          @Test
    public void numeratorPlusTest()  {
        double result = calc.numerator(123,234,345,456,
                        Calculate.setOperationPlus() );
                        assertEquals( 136818, result,1 );

    }
    @Test
    public void numeratorMinusTest()  {
        double result = calc.numerator(123,234,345,456,
                        Calculate.setOperationMinus() );
                        assertEquals( -24642, result,1 );

    }
    @Test
    public void numeratorDivineTest()  {
        double result = calc.numerator(123,234,345,456,
                Calculate.setOperationDivine() );
                assertEquals( 56088.0, result,1 );

    }
    @Test
    public void numeratorMultiplyTest()  {
        double result = calc.numerator(123,234,345,456,
                Calculate.setOperationMultiply() );
                assertEquals( 42435, result,1 );

    }

   //Testing the denominator operations

    @Test
    public void denominatorPlusTest() throws Exception {
        double result = calc.denominator(234,345,456,
                Calculate.setOperationPlus() );
                assertEquals( 106704, result,1 );

    }

    @Test
    public void denominatorMinusTest() throws Exception {
        double result = calc.denominator(234,345,456,
                Calculate.setOperationMinus() );
                assertEquals( 106704, result,1 );

    }

    @Test
    public void denominatorDivineTest() throws Exception {
        double result = calc.denominator(234,345,456,
                Calculate.setOperationDivine() );
                assertEquals( 80730, result,0 );

    }

    @Test
    public void denominatorMultiplyTest() throws Exception {
        double result = calc.denominator(234,345,456,
                Calculate.setOperationMultiply() );
                assertEquals( 106704, result,1 );

    }

}