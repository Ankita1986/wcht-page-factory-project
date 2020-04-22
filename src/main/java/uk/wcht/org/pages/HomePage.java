package uk.wcht.org.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.wcht.org.utility.Utility;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(linkText = "Your home")
    WebElement yourHomeLink;

    @FindBy(linkText = "About us")
    WebElement aboutUsLink;

    public void clickOnYourHomeLink(){
        Reporter.log("Clicking On Your Home Link" + yourHomeLink.toString() + "<br>");
        clickOnElement(yourHomeLink);
        log.info("Clicking On Your Home Link" + yourHomeLink.toString());
    }
    public void clickOnAboutUsLink(){
        Reporter.log("Clicking On About Us Link" + aboutUsLink.toString() + "<br>");
        clickOnElement(aboutUsLink);
        log.info("Clicking On About Us Link" + aboutUsLink.toString());
    }


}
