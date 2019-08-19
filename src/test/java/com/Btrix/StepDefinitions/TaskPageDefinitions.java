package com.Btrix.StepDefinitions;

import com.Btrix.Utilities.BrowserUtils;
import com.Btrix.Utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskPageDefinitions {

    Pages pages = new Pages();

    @Then("Click on New Task button")
    public void click_on_New_Task_button() {
        pages.taskPage().newTaskButtonLocator.click();
    }

    @When("Fill out the Things to do box")
    public void fill_out_the_Things_to_do_box() {

        pages.taskPage().thingsToDoBoxLocator.click();
        pages.taskPage().thingsToDoBoxLocator.sendKeys("New Task");
    }

    @Then("Click on Add Task")
    public void click_on_Add_Task() {
        pages.taskPage().addTaskLocator.click();
    }

    @When("Click on Upload icon")
    public void click_on_Upload_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Click on Upload files and images")
    public void click_on_Upload_files_and_images() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Choose a file or image from the computer")
    public void choose_a_file_or_image_from_the_computer() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Click on the Deadline box")
    public void click_on_the_Deadline_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Select a future date")
    public void select_a_future_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}