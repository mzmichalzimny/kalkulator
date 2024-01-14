package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");


        WebElement cookieAcceptButton = driver.findElement(By.xpath("//button[@data-testid='cookie-policy-manage-dialog-accept-button']"));
        cookieAcceptButton.click();


        WebElement createAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccountButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement selectComboDay = driver.findElement(By.xpath("//select[@id='day']"));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByValue("1");

        WebElement selectComboMonth = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByValue("12");

        WebElement selectComboYear = driver.findElement(By.xpath("//select[@id='year']"));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByValue("1990");
    }
}