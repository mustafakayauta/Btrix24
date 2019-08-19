package com.Btrix.pages;

import com.Btrix.Utilities.BasePage;
import com.Btrix.Utilities.BrowserUtils;
import com.Btrix.Utilities.ConfigurationReader;
import com.Btrix.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "USER_LOGIN")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(name = "USER_PASSWORD")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(className="login-btn")
    public WebElement loginButtonElement;

    @FindBy(className = "login-item-checkbox-label")
    public WebElement rememberMeElement;

    @FindBy(partialLinkText = "Forgot your password?")
    public WebElement forgotPasswordElement;

    @FindBy(tagName = "h2")
    public WebElement titleElement;

    @FindBy(partialLinkText = "Incorrect login or password")
    public WebElement errorMessageElement;

    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login(){
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }
    public void login(String role) {
        String username = "";
        String password = "";
        if (role.equalsIgnoreCase("helpdesk")) {
            username = ConfigurationReader.getProperty("helpdeskusername1");
            password = ConfigurationReader.getProperty("helpdeskpassword1");
        } else if (role.equalsIgnoreCase("hr")) {
            username = ConfigurationReader.getProperty("hrusername1");
            password = ConfigurationReader.getProperty("hrpassword1");
        } else if (role.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketingusername1");
            password = ConfigurationReader.getProperty("marketingpassword1");
        }
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }

    public void clickRememberMe(){
        BrowserUtils.waitForClickablility(rememberMeElement, Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        if(!rememberMeElement.isSelected()){
            rememberMeElement.click();
        }
    }

    public void goToLandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));//+ConfigurationReader.getProperty("environment")));
    }
}
