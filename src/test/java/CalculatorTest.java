import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testSum(){ //metode
        Calculator calculator = new Calculator(); //calculator ar mazo burtu ir objekta nosaukums
        calculator.sum(10.00, 25.00);
        Assert.assertEquals(calculator.sum(10.00, 25.00), 35.00); //pieprasam no to summu no objekta
    }
    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        calculator.subtract(10.00, 5.00);
        Assert.assertEquals(calculator.subtract(10.00, 5.00), 5.00);
    }
    @Test
    public void testDevide() {
        Calculator calculator = new Calculator();
        calculator.devide(10.00, 5.00);
        Assert.assertEquals(calculator.devide(10.00, 5.00), 2.00, "Inccorect result!");
    }
}
