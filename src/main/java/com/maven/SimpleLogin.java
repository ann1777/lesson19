package com.maven;

import java.util.ResourceBundle;

public class SimpleLogin {
    public int userLogin(String in_user, String in_passwd)
    {
        ResourceBundle rb= ResourceBundle.getBundle("config");
        String userName=rb.getString("username");
        String passwd=rb.getString("passwd");

        if(in_user.equals(userName) && in_passwd.equals(passwd))
            return 1;
        else
            return 0;
    }
}
