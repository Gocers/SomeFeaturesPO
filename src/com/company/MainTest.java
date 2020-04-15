package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainTest {

    @Test
    public void sum()
    {
        int expected = 10;

        int actual = Main.sum(4,6);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toBin()
    {
        String expected = "111";

        String actual = Main.toBin(7);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTime()
    {
        Calendar calendar = new GregorianCalendar();
        Date expected = calendar.getTime();

        Date actual = Main.getTime();

        Assert.assertEquals(expected.toString(),actual.toString());
    }

}
