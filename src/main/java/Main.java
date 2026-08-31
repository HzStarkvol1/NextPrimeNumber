import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static boolean isPrime(int number)
    {
        if(number <= 1){
            return false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("Type a number to find its next prime (0 to quit): ");
            int number = scanner.nextInt();
            if(number == 0)
            {
                break;
            }

            int nextNumber= number+1;
            while(!isPrime(nextNumber))
            {
                nextNumber++;
            }
            System.out.println("next prime number is: "+nextNumber);
        }
    }
}


