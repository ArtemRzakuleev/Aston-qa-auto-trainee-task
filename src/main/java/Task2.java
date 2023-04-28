import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        String expectedName="Вячеслав";
        String name=scanner.nextLine();
        if (name.trim().equalsIgnoreCase(expectedName))   {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}
