package com.Btrix.StepDefinitions;
import com.Btrix.Utilities.Pages;
import com.Btrix.pages.*;
import com.Btrix.Utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinitions {

    Pages pages = new Pages();

    @Given("User on the landing page")
    public void user_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }

    @Then("User login as a {string} user")
    public void user_login_as_a_user(String string) {
        pages.loginPage().login(string);
    }

    @Then("Navigate to {string} module")
    public void navigate_to_module(String module) {
        pages.loginPage().navigateToModule(module);
    }
}