package com.project.pages.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

    public HomePageObjects(){
        super();
    }


    @FindBy(xpath = "//input[@name='username']")
    public WebElement USER_NAME_TEXT_BOX;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement PASSWORD_TEXT_BOX;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement REGISTER_LINK;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement FIRST_NAME_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement LAST_NAME_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement ADDRESS_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement CITY_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement STATE_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement ZIPCODE_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement PHONE_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement SSN_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement SIGNUP_USERNAME_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement SIGNUP_PASSWORD_TEXT_BOX;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement CONFIRM_PASSWORD_TEXT_BOX;

//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;









}
