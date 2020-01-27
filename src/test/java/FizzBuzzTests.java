import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {
    @Test
    public void Should_Return_Correct_Value_When_Input_1()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(1);
        Assert.assertEquals("1",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_2()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(2);
        Assert.assertEquals("2",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_3()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(3);
        Assert.assertEquals("Fizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_5()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(5);
        Assert.assertEquals("Buzz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_7()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(7);
        Assert.assertEquals("Whizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_6()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(6);
        Assert.assertEquals("Fizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_10()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(10);
        Assert.assertEquals("Buzz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_14()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(14);
        Assert.assertEquals("Whizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_15()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(15);
        Assert.assertEquals("Buzz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_21()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(21);
        Assert.assertEquals("FizzWhizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_35()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(35);
        Assert.assertEquals("BuzzWhizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_105()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(105);
        Assert.assertEquals("BuzzWhizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_75()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(75);
        Assert.assertEquals("Fizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_70()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(70);
        Assert.assertEquals("Whizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_672()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(672);
        Assert.assertEquals("FizzWhizz",value);
    }

    @Test
    public void Should_Return_Correct_Value_When_Input_21504()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var value = fizzBuzz.GetFizzBuzzValue(21504);
        Assert.assertEquals("Whizz",value);
    }
}