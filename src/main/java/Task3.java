import java.util.Scanner;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        String string= scanner.nextLine();
        try {
            Stream.of(string.split(" ")).map(Long::parseLong).filter(l->l % 3 == 0).forEach(l->System.out.print(l+" "));
        }
        catch (NumberFormatException e) {
            System.out.println("На входе должен быть числовой массив");
        }
    }
}
