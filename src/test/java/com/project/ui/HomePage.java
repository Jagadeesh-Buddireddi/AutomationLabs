package com.project.ui;

import com.project.utils.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public static WebDriver driver;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log.info("Chrome browser initialized");
    }

    @Test
    public void navigateToUrl() throws InterruptedException {
        ConfigReader.loadProperties();
        String url = ConfigReader.getProperty("URL");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

        String pageTitle = driver.getTitle();
        log.info("User navigated to {}", pageTitle);
        Thread.sleep(10000);
    }

    @AfterTest
    public void teardown() {

        if (driver != null) {
            driver.quit();
            log.info("Browser has been closed");
        }
    }
}
