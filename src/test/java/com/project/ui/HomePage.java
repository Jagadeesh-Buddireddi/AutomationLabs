package com.project.ui;

import com.project.utils.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public static WebDriver driver;





    @Test
    public void setUp() throws InterruptedException {
        ConfigReader.loadProperties();
        String url = ConfigReader.getProperty("URL");


        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver(); // Initialize ChromeDriver
        driver.manage().window().maximize(); // Optional: Maximize the browser window
        log.info("Chrome browser initialized");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url); // Open the website
        Thread.sleep(10000);
        driver.quit();
    }
}
