import java.io.IOException;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Students Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for( int i = 0; i < n; i++) {
            String result = GetFizzBuzzValue(i+1);
            System.out.println(result);
        }
    }

    public static String GetFizzBuzzValue(int number)
    {
        if(String.valueOf(number).contains("3") && !String.valueOf(number).contains("5"))
            return "Fizz";
        if(number%3 == 0 && number%5 == 0 && number%7 == 0 && String.valueOf(number).contains("5") && !String.valueOf(number).contains("7"))
            return "BuzzWhizz";
        if(number%3 == 0 && number%7 == 0 && String.valueOf(number).contains("5") && !String.valueOf(number).contains("7"))
            return "Whizz";
        if(number%3 == 0 && number%5 == 0 && String.valueOf(number).contains("5") && !String.valueOf(number).contains("7"))
            return "Buzz";
        if(number%3 == 0 && number%7 == 0 && String.valueOf(number).contains("7"))
            return "FizzWhizz";
        if(number%3 == 0 && String.valueOf(number).contains("7"))
            return "Fizz";
        if(number%7 == 0 && String.valueOf(number).contains("7"))
            return "Whizz";
        if(number%3 == 0 && number%5 == 0 && number%7 == 0)
            return "FizzBuzzWhizz";
        if(number%3 == 0 && number%5 == 0)
            return "FizzBuzz";
        if(number%3 == 0 && number%7 == 0)
            return "FizzWhizz";
        if(number%5 == 0 && number%7 == 0)
            return "BuzzWhizz";
        else if(number%3 == 0)
            return "Fizz";
        else if(number%5 == 0)
            return "Buzz";
        else if(number%7 == 0)
            return "Whizz";
        return String.valueOf(number);
    }
}
