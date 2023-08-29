package com.zipdev.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.primefaces.org/primereact-v5/#/datatable/selection")
public class PrimeReactSelectionPage extends PageObject {
    public WebElementFacade getCheckboxForName(String name) {
        String xpath = String.format("//td[text()='%s']/preceding-sibling::td/div[@class='p-checkbox p-component']/div[2]", name);
        return $(By.xpath(xpath));
    }
    public void selectCheckboxForName(String name) {
        getCheckboxForName(name).click();
    }

    public boolean isCheckboxForNameSelected(String name) {
        return "true".equals(getCheckboxForName(name).getAttribute("aria-checked"));
    }
}
