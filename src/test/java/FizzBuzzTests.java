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
}