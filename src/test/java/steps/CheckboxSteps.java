package steps;

import net.thucydides.core.annotations.Step;
import com.zipdev.pages.PrimeReactSelectionPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

public class CheckboxSteps {
    PrimeReactSelectionPage selectionPage;

    @Step
    public void navigateToPrimeReactSelectionPage() {
        selectionPage.open();
    }

    @Step
    public void selectCheckboxForName(String name) {
        selectionPage.selectCheckboxForName(name);
    }

    @Step
    public void verifyCheckboxForNameIsSelected(String name) {
        assertThat(selectionPage.isCheckboxForNameSelected(name), is(true));
    }
}
