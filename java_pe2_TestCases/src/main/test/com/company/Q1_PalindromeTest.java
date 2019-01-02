package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_PalindromeTest {

    @Before
    public void setUp()
    {
      obj=new Q1_Palindrome();
    }

    Q1_Palindrome obj;

    @Test
    public void  testReverseSuccess()
    {
        String expectedValue1="abcddcba",actualValue1;
        actualValue1=obj.Reverse("abcddcba");
        assertEquals(expectedValue1,actualValue1);
        String actualValue2,expectedValue2="123321";
        actualValue2=obj.Reverse("123321");
        assertEquals(expectedValue2,actualValue2);

    }

    @Test
    public void  testReverseFailure()
    {
        String expectedValue1="efgh",actualValue;
        actualValue=obj.Reverse("efgh");
        assertNotEquals(expectedValue1,actualValue);
    }

    @Test
    public  void testPalindromeSuccsess()
    {
        String expectedValue="abcddcba",actualValue;
        actualValue=obj.Palindrome("abcddcba");
        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void testPalindromeFailure()
    {
        String expectedValue1="12345",actualValue;
        actualValue=obj.Palindrome("12345");
        assertNotEquals(expectedValue1,actualValue);

    }

    @After
    public void tearDown()
    {
        obj=null;
    }




}