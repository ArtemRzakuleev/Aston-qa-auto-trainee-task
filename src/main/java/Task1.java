import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        try {
            double number=scanner.nextDouble();
            if (number>7.0)   {
                System.out.println("Привет");
            }
        }
        catch (InputMismatchException e)    {
            System.out.println("Необходимо вводить только числа");
        }
    }
}
