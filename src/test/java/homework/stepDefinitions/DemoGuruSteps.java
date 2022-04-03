package homework.stepDefinitions;

import homework.pages.DemoGuruHome;
import homework.utils.BrowserUtils;
import homework.utils.ConfigurationsReader;
import homework.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;
public class DemoGuruSteps extends BrowserUtils {
    DemoGuruHome demoGuruHome=new DemoGuruHome();

@Given("The user wants to see Guru demo site")
public void the_user_wants_to_see_guru_demo_site() {
    Driver.getDriver();
    driver.get(ConfigurationsReader.getProperties("urlDemoGuru"));
    BrowserUtils.setWaitTime();
    driver.manage().window().maximize();
    System.out.println("The website is launched");}

    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        demoGuruHome.setAddTariffPlan();
    }
    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String expectedHeader) {
        demoGuruHome.setHeader(expectedHeader);
    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> dataTable) {
            demoGuruHome.setMonthlyRental(dataTable.get("Monthly Rental"));
            demoGuruHome.setFreeLocalMinutes(dataTable.get("Free Local Minutes"));
            demoGuruHome.setFreeInterMinutes(dataTable.get("Free International Minutes"));
            demoGuruHome.setFreeSmsPack(dataTable.get("Free SMS Pack"));
            demoGuruHome.setLocalPerMinutesCharges(dataTable.get("Local Per Minutes Charges"));
            demoGuruHome.setInterPerMinutesCharges(dataTable.get("International Per Minutes Charges"));
            demoGuruHome.setSmsPerCharges(dataTable.get("SMS Per Charges"));}

    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        demoGuruHome.setSubmitButton();
    }
    @Then("The user wants to verifyy message as {string}")
    public void the_user_wants_to_verifyy_message_as(String expectedHeader) {
        demoGuruHome.setVerifyMessage(expectedHeader);
    }


}
