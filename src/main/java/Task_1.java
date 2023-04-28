import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        try {
            long number=scanner.nextLong();
            if (number>7)   {
                System.out.println("Привет");
            }
        }
        catch (InputMismatchException e)    {
            System.out.println("Необходимо вводить только числа");
        }
    }
}
