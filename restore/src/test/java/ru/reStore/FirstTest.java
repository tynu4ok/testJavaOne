package ru.reStore;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;


public class FirstTest extends WebDriverSettings {
  @Test
  public void firstTest() throws InterruptedException {
    driver.get("https://www.re-store.ru/");
    String title = driver.getTitle();
    Assert.assertTrue(title.equals("re:Store — Сеть фирменных магазинов техники Apple и аксессуаров в крупнейших городах России. Официальный представитель. Интернет-магазин. Оригинальная продукция Apple с гарантией"));
    WebElement openeder = driver.findElement(By.xpath("//button[@onclick]"));
    openeder.click();

   // WebDriverWait wait = new WebDriverWait(driver, 1);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_city")));
    //driver.findElement(By.xpath("//span[@class=\"city-selector-link\" and text()=\"Санкт-Петербург\"]")).click();
   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("choose-city-bttn")));


    //driver.findElement(By.xpath("html/body/div[1]/div[4]/div[1]/div[1]/div[3]/a[6]")).click();

   jsExec("//a[@class=\"header-login not-active\"]");


    //JavascriptExecutor js = driver;
    //js.executeScript("$('.signin-popup').rashow();");

    //driver.findElement(By.xpath("//a[@class=\"header-login not-active\"]")).submit();
    //driver.findElement(By.xpath("//a[contains(@href,\"javascript:void(0)\") and @class=\"header-login not-active\"]")).click();
    driver.findElement(By.name("NAME")).sendKeys("testA");
    driver.findElement(By.name("LAST_NAME")).sendKeys("testB");
    driver.findElement(By.name("PERSONAL_PHONE")).sendKeys("9444444444");
    int a = randomInt();
    driver.findElement(By.name("EMAIL")).sendKeys("test" + a + "@asd.ru");
    driver.findElement(By.name("PASSWORD")).sendKeys("123123");
    driver.findElement(By.xpath("//input[@value=\"Зарегистрироваться и войти\"]")).click();

  }
}
