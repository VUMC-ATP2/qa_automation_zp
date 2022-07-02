package mavenTestNGHomework;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculator {
    @BeforeMethod
    public void testIsStarting(){
        System.out.println("Test starts now!!");
    }
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        calculator.add(50, 20);
        Assert.assertEquals(calculator.add(50, 20),70);
        System.out.println("It's right!");
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        calculator.substract(60,10);
        Assert.assertEquals(calculator.substract(60,10),50);
    }
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        calculator.multiply(6,6);
        Assert.assertEquals(calculator.multiply(6,6),36);
    }
    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        calculator.divide(24,8);
        Assert.assertEquals(calculator.divide(24,8),3);
    }
    @AfterTest
    public void afterTest(){
        System.out.println("We just finished testing! Was it right? What do You think?");
    }
}
