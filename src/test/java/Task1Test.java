import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task1Test {
    @Test
    void inputNumberIsEqualTo6Test()  {
        int number=6;
        String expected="";
        ByteArrayInputStream in=new ByteArrayInputStream(Integer.toString(number).getBytes());
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
        int number=7;
        String expected="";
        ByteArrayInputStream in=new ByteArrayInputStream(Integer.toString(number).getBytes());
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
        int number=8;
        String expected="Привет";
        ByteArrayInputStream in=new ByteArrayInputStream(Integer.toString(number).getBytes());
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
    void inputIsStringTest()    {
        String input="abc";
        String expected="Необходимо вводить только числа";
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
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
    void inputNumberWithSpaceBeforeTest()   {
        String input=" 8";
        String expected="Привет";
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
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
    void inputNegativeNumberTest()  {
        int number=-7;
        String expected="";
        ByteArrayInputStream in=new ByteArrayInputStream(Integer.toString(number).getBytes());
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
    void inputDoubleNumberGreaterThan7Test()    {
        double number=7.1;
        String expected="Привет";
        ByteArrayInputStream in=new ByteArrayInputStream(Double.toString(number).getBytes());
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
    void inputDoubleNumberEqualTo7Test()    {
        double number=7.0;
        String expected="";
        ByteArrayInputStream in=new ByteArrayInputStream(Double.toString(number).getBytes());
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
