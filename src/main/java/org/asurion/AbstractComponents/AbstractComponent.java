package org.asurion.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {
    WebElement pageSectionLocator;
    # its a new line code
    public AbstractComponent(WebDriver driver, By pageSectionLocator) {
        this.pageSectionLocator = driver.findElement(pageSectionLocator);
    }

    public WebElement findElement(By elementLocator){
        //below is what we want to achieve
        // sectionElement of each page will come from each respective class like FootNav. We need to connect it.
        // By sectionId = By.id("traveller-home"); if we hard code here for FootNAv, then this class will work for
        // FooterNav only, hence it needs to come from the class only.
        return pageSectionLocator.findElement(elementLocator);
    }

    public List<WebElement> findElements(By elementLocator){
        return pageSectionLocator.findElements(elementLocator);
    }
}
