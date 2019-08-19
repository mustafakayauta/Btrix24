package com.Btrix.pages;


import com.Btrix.Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BasePage {

    @FindBy(className = "ui-btn-main")
    public WebElement newTaskButtonLocator;

    @FindBy(xpath= "//div[@class='task-info-panel-title']//input[@placeholder='Things to do']")
    public WebElement thingsToDoBoxLocator;

    @FindBy(css = "span[data-bx-id='task-edit-cmd']")
    public WebElement addTaskLocator;


    @FindBy(id = "bx-b-uploadfile-task-form-bitrix_tasks_task_default_1")
    public WebElement uploadIconLocator;

    @FindBy(xpath = "//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main']")
    public WebElement uploadFileOrImageLocator;

    @FindBy(css="span[data-bx-id='dateplanmanager-deadline']>input:nth-of-type(1)")
    public WebElement deadlineBoxLocator;



}