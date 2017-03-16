package com.selenium.page;

import com.selenium.utility.PropertyReader;
import org.openqa.selenium.By;

/**
 * @Login Page
 *
 */
public class LoginPage {

    public static By enterUsername(){

        return (By.xpath(PropertyReader.propertyReader().getProperty("username")));

    }

    public static By enterPassword( ){
        return (By.xpath(PropertyReader.propertyReader().getProperty("password")));

    }

    public static By clicksignIn() {
        return By.xpath(PropertyReader.propertyReader().getProperty("signIn"));

    }
}
