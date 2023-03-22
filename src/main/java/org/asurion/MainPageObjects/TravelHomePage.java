package org.asurion.MainPageObjects;


import org.asurion.AbstractComponents.SearchFlightAvail;
import org.asurion.PageSectionsObject.FooterNav;
import org.asurion.PageSectionsObject.MultiTrip;
import org.asurion.PageSectionsObject.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {
    // as per Single Responsibility Practice design pattern principle -
    // Single Responsibility of this class is to redirect to other class.
    // as we have many functionality on the home page of https://rahulshettyacademy.com/dropdownsPractise/
    WebDriver driver;
    SearchFlightAvail searchFlightAvail;

    // from here we will pass saction details on which execution need to continue like blow -
    By footerSectionId = By.id("traveller-home");
    By headerSectionId = By.cssSelector("div.search-buttons-heading");

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoHome(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar(driver, headerSectionId);
    }

    public FooterNav getFooterBar(){
        // we need to make framework understand that when we are calling this class then
        // look for object in the footer section only. and not in Navigation Bar or other section.
        return new FooterNav(driver, footerSectionId);
    }

    public void setBookingStrategy(SearchFlightAvail searchFlightAvail) {
        this.searchFlightAvail = searchFlightAvail;
    }

    public void checkAvailability(String origin, String destination){
        searchFlightAvail.checkAvailability("origin", "destination");
    }


}
