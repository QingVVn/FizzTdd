import java.io.IOException;
import java.util.Scanner;

public class FizzBuzz {
    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";
    private static int FIZZ_NUMBER = 3;
    private static int BUZZ_NUMBER = 5;
    private static int WHIZZ_NUMBER = 7;

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
        if(isContained(number, FIZZ_NUMBER) && !isContained(number, BUZZ_NUMBER))
            return FIZZ;
        if(isMultiple(number, FIZZ_NUMBER) && isMultiple(number, BUZZ_NUMBER) && isMultiple(number, WHIZZ_NUMBER) && isContained(number, BUZZ_NUMBER) && !isContained(number, WHIZZ_NUMBER))
            return BUZZ+WHIZZ;
        if(isMultiple(number, FIZZ_NUMBER) && isMultiple(number, WHIZZ_NUMBER) && isContained(number, BUZZ_NUMBER) && !isContained(number, WHIZZ_NUMBER))
            return WHIZZ;
        if(isMultiple(number, FIZZ_NUMBER) && isMultiple(number, BUZZ_NUMBER) && isContained(number, BUZZ_NUMBER) && !isContained(number, WHIZZ_NUMBER))
            return BUZZ;
        if(isMultiple(number, FIZZ_NUMBER) && isMultiple(number, WHIZZ_NUMBER) && isContained(number, WHIZZ_NUMBER))
            return FIZZ+WHIZZ;
        if(isMultiple(number, FIZZ_NUMBER) && isContained(number, WHIZZ_NUMBER))
            return FIZZ;
        if(isMultiple(number, WHIZZ_NUMBER) && isContained(number, WHIZZ_NUMBER))
            return WHIZZ;
        var result = Fizz(number) + Buzz(number) + Whizz(number);
        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private static boolean isContained(int number, int n)
    {
        return String.valueOf(number).contains(String.valueOf(n));
    }

    private static boolean isMultiple(int number, int n)
    {
        return number%n==0;
    }

    private static String Fizz(int number)
    {
        return number%FIZZ_NUMBER==0 ? FIZZ : "";
    }

    private static String Buzz(int number)
    {
        return number%BUZZ_NUMBER==0 ? BUZZ : "";
    }

    private static String Whizz(int number)
    {
        return number%WHIZZ_NUMBER==0 ? WHIZZ : "";
    }
}
