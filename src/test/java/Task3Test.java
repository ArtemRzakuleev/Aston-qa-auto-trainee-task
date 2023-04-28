import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task3Test {
    @Test
    void inputNumbers()    {
        String input="-3 -2 -1 0 1 2 3 4 5 6";
        String expected="-3 0 3 6";
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task3.main(new String[]{});
            printStream.flush();
            String actual=out.toString().trim();
            Assert.assertEquals(actual,expected);
        }
        finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }
}
