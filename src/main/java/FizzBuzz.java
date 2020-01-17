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
        if(number == 3)
            return "Fizz";
        else if(number == 5)
            return "Buzz";
        else if(number == 7)
            return "Whizz";
        return String.valueOf(number);
    }
}
