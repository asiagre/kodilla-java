package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[@id=\"u_0_10\"]/div[@class=\"_5k_5\"]/span/span/select[@id=\"day\"]";
    public static final String XPATH_MONTH = "//div[@id=\"u_0_10\"]/div[@class=\"_5k_5\"]/span/span/select[@id=\"month\"]";
    public static final String XPATH_YEAR = "//div[@id=\"u_0_10\"]/div[@class=\"_5k_5\"]/span/span/select[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day );
        selectDay.selectByIndex(8);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(4);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(20);
    }
}
