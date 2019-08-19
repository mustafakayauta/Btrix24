
package com.Btrix.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateToModule(String module){
        String moduleLocator="//span[@class='menu-item-link-text'][contains(text(),'"+module+"')]";
        BrowserUtils.waitForClickablility(By.xpath(moduleLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));

        WebElement tabElement = Driver.getDriver().findElement(By.xpath(moduleLocator));
        tabElement.click();
    }

}