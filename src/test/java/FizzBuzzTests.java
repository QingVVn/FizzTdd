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
}