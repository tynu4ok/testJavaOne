package ru.reStore;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class WebDriverSettings {
  public ChromeDriver driver;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chorome.driver", "/Users/tynu4ok/Downloads/chromedriver_win32/");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }
  //button[@onclick]
  @After
  public void closeTest() {
    driver.quit();
  }

  public int randomInt(){
    Random rand = new Random();
    int n = rand.nextInt(100) + 1;
    return n;
  }

  public String jsExec(String text){
    WebElement el = driver.findElement(By.xpath(text));
    JavascriptExecutor exec = (JavascriptExecutor) driver;
    exec.executeScript("arguments[0].click()", el);
    return text;
  }
}
