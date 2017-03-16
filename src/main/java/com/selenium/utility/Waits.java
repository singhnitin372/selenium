package com.selenium.utility;

import com.selenium.BaseClass.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Created by M1028219 on 3/16/2017.
 */
public class Waits extends BaseClass {
    private static WebElement element = null;
    public static WebElement waitByElement ( By by ){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(NoSuchElementException.class)
                .pollingEvery(5,TimeUnit.SECONDS)
                .withMessage("Unable to find such element");

        element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                element =  driver.findElement(by);
                return  element ;
            }
        });

        return element ;
    }

}
