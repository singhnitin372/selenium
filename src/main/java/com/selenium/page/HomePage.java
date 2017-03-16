package com.selenium.page;

import com.selenium.utility.PropertyReader;
import org.openqa.selenium.By;

/**
 * Created by M1028219 on 3/16/2017.
 */
public class HomePage {

    public static By createClassLink (){
        return By.ByXPath.xpath(PropertyReader.propertyReader().getProperty("createClassLink"));

    }
}
