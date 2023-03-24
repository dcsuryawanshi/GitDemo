package org.asurion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.asurion.MainPageObjects.TravelHomePage;
import org.asurion.PageSectionsObject.MultiTrip;
import org.asurion.PageSectionsObject.RoundTrip;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FlightTest {
    WebDriver driver;
    TravelHomePage thp;

    @BeforeTest
    public void launchBrowser(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsuryawanshi\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        thp = new TravelHomePage(driver);
        thp.gotoHome();
    }

//    @Test
//    public void getFooterFlightDetail(){
////        TravelHomePage thp = new TravelHomePage(driver);
////        thp.gotoHome();
//        String flightClass = thp.getFooterBar().getFlightsClassName();
//        System.out.println(flightClass);
//        Assert.assertEquals(flightClass,"group-traveller");
//    }

    @Test
    public void getHeaderFlightDetails3(){
//        TravelHomePage thp = new TravelHomePage(driver);
//        thp.gotoHome();
        String flightClass = thp.getNavigationBar().getFlightsClassName();
        System.out.println(flightClass);
        Assert.assertEquals(flightClass, "selected");
        System.out.println(thp.getNavigationBar().getLinkCount());

        thp.setBookingStrategy(new MultiTrip());
        thp.checkAvailability("Origin", "destination");

        thp.setBookingStrategy(new RoundTrip());
        thp.checkAvailability("Origin", "destination");
    }

    @Test
    public void getHeaderFlightDetails2(){
//        TravelHomePage thp = new TravelHomePage(driver);
//        thp.gotoHome();
        String flightClass = thp.getNavigationBar().getFlightsClassName();
        System.out.println(flightClass);
        Assert.assertEquals(flightClass, "selected");
        System.out.println(thp.getNavigationBar().getLinkCount());

        thp.setBookingStrategy(new MultiTrip());
        thp.checkAvailability("Origin", "destination");

        thp.setBookingStrategy(new RoundTrip());
        thp.checkAvailability("Origin", "destination");
    }
    @Test
    public void getHeaderFlightDetails1(){
//        TravelHomePage thp = new TravelHomePage(driver);
//        thp.gotoHome();
        String flightClass = thp.getNavigationBar().getFlightsClassName();
        System.out.println(flightClass);
        Assert.assertEquals(flightClass, "selected");
        System.out.println(thp.getNavigationBar().getLinkCount());

        thp.setBookingStrategy(new MultiTrip());
        thp.checkAvailability("Origin", "destination");

        thp.setBookingStrategy(new RoundTrip());
        thp.checkAvailability("Origin", "destination");
    }

    @Test
    public void getHeaderFlightDetails4(){
//        TravelHomePage thp = new TravelHomePage(driver);
//        thp.gotoHome();
        String flightClass = thp.getNavigationBar().getFlightsClassName();
        System.out.println(flightClass);
        Assert.assertEquals(flightClass, "selected");
        System.out.println(thp.getNavigationBar().getLinkCount());

        thp.setBookingStrategy(new MultiTrip());
        thp.checkAvailability("Origin", "destination");

        thp.setBookingStrategy(new RoundTrip());
        thp.checkAvailability("Origin", "destination");
    }

    @Test
    public void getHeaderFlightDetails5(){
//        TravelHomePage thp = new TravelHomePage(driver);
//        thp.gotoHome();
        String flightClass = thp.getNavigationBar().getFlightsClassName();
        System.out.println(flightClass);
        Assert.assertEquals(flightClass, "selected");
        System.out.println(thp.getNavigationBar().getLinkCount());

        thp.setBookingStrategy(new MultiTrip());
        thp.checkAvailability("Origin", "destination");

        thp.setBookingStrategy(new RoundTrip());
        thp.checkAvailability("Origin", "destination");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
