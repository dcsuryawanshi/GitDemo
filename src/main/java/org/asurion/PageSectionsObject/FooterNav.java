package org.asurion.PageSectionsObject;

import org.asurion.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterNav extends AbstractComponent {
//    WebDriver driver;
    //When Selenium executed any method in this class, then scope of selenium should be in the footer only.

    // define all objects of Footer section in this class like below.
    By flights = By.cssSelector("[title=Flights]");
    By link = By.cssSelector("a");

    public FooterNav(WebDriver driver, By headerSectionId) {
        super(driver, headerSectionId);
    }

    public void selectFlights(){
//        driver.findElement(flights).click();
        //this will search in whole page, rather we want it to search on section.
        // for initializing a section, we have created and AbstractComponent class, which will do the job
        // for that we will pass driver and sectionLocator to the Abstract class.
        findElement(flights).click();
    }

    public String getFlightsClassName(){
        return findElement(flights).getAttribute("class");
    }

    public Integer getLinkCount(){
        return findElements(link).size();
    }
}
