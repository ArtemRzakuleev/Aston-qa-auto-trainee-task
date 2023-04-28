import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task1Test {
    @Test
    void inputNumberIsEqualTo6Test()  {
        long number=6;
        String expected="";
        ByteArrayInputStream in=new ByteArrayInputStream(Long.toString(number).getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task1.main(new String[]{});
            printStream.flush();
            String actual=out.toString().trim();
            Assert.assertEquals(actual,expected);
        }
        finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }
    @Test
    void inputNumberIsEqualTo7Test()    {
        long number=7;
        String expected="";
        ByteArrayInputStream in=new ByteArrayInputStream(Long.toString(number).getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task1.main(new String[]{});
            printStream.flush();
            String actual=out.toString().trim();
            Assert.assertEquals(actual,expected);
        }
        finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }
    @Test
    void inputNumberIsEqualTo8Test()    {
        long number=8;
        String expected="Привет";
        ByteArrayInputStream in=new ByteArrayInputStream(Long.toString(number).getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task1.main(new String[]{});
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
