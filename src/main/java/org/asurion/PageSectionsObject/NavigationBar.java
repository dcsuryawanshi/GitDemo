package org.asurion.PageSectionsObject;

import org.asurion.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar extends AbstractComponent {
//    WebDriver driver;
//WebElement pageSectionLocator;

    //Page section objects
//    By flights = By.cssSelector("span.text-label[text='Flights']");
//    By flights = By.cssSelector("span.text-label:contains('Flights')");
     By flights = By.cssSelector("[title=Flights]");
     By link = By.cssSelector("a");

    // class constructor
    public NavigationBar(WebDriver driver, By headerSectionId) {
        super(driver, headerSectionId);
//        pageSectionLocator = driver.findElement(headerSectionId);
    }

    public String getFlightsClassName(){
        return findElement(flights).getAttribute("class");
    }

    public Integer getLinkCount(){
        return findElements(link).size();
    }

}
