package com.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSimpleLogin {
    @Test
    public int[] testLogin1(String in_user, String in_passwd){
        TestSimpleLogin user=new TestSimpleLogin();
        Assert.assertEquals(0, user.testLogin1("john","test123"));
        System.out.println("testLogin1 was successful");
        return new int[0];
    }

    @Test
    public int[] testLogin2(String in_user, String in_passwd){
        TestSimpleLogin user=new TestSimpleLogin();
        Assert.assertEquals(1, user.testLogin2("jon","test@123"));
        System.out.println("testLogin2 was successful");
        return new int[1];
    }
}

