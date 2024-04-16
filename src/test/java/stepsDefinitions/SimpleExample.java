package stepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SimpleExample {

    @When("login")
    public void login() throws InterruptedException {
        Thread.sleep(5000);
    }

    @When("search")
    public void search() throws Exception {
        Thread.sleep(5000);
        Assert.fail();
    }

    @When("select")
    public void select() throws Exception {
        Thread.sleep(5000);
    }

    @When("log out")
    public void logOut() throws Exception {
        Thread.sleep(5000);
    }

    @Then("User reaches portal")
    public void userReachesPortal() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("User logs out of the portal and see a successful logout message")
    public void userLogsOutOfThePortalAndSeeASuccessfulLogoutMessage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.fail();
    }
}
