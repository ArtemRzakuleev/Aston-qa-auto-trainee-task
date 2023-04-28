import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task2Test {
    @Test
    void inputNameIsVyacheslavTest()    {
        String input="Вячеслав";
        String expected="Привет, Вячеслав";
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task2.main(new String[]{});
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
    void inputNameIsVyacheslavWithSpaceBeforeTest()    {
        String input=" Вячеслав";
        String expected="Привет, Вячеслав";
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task2.main(new String[]{});
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
    void inputNameIsNotEqualToVyacheslavTest()  {
        String input="Геннадий";
        String expected="Нет такого имени";
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task2.main(new String[]{});
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
    void inputNameIsVyacheslavIgnoringCaseTest()    {
        String input=" вЯчЕсЛаВ ";
        String expected="Привет, Вячеслав";
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(out);
        System.setOut(printStream);
        try {
            Task2.main(new String[]{});
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
