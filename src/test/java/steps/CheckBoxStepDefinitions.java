package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckBoxStepDefinitions {

    @Steps
    CheckboxSteps checkboxSteps;

    @Given("I am on the PrimeReact selection page")
    public void iAmOnThePrimeReactSelectionPage() {
        checkboxSteps.navigateToPrimeReactSelectionPage();
    }

    @When("I select the checkbox against {string}")
    public void iSelectTheCheckboxAgainst(String name) {
        checkboxSteps.selectCheckboxForName(name);
    }

    @Then("the checkbox against {string} should be selected")
    public void theCheckboxAgainstShouldBeSelected(String name) {
        checkboxSteps.verifyCheckboxForNameIsSelected(name);
    }
}
