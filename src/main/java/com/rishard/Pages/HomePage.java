package com.rishard.Pages;

import com.rishard.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }


   // @FindBy(css =".o-frwuxB.o-eqqVmt.o-BEqzB.o-eMOUEg.o-OAYdd.o-bdcqQE.o-fznJzu.o-fznJPk.o-rYTQq.dvEJRN" )
    @FindBy(xpath = "/html/body/div[1]/div[2]/header/div/nav/ul/li[1]")

    public WebElement newCarMenu;
    @FindBy(xpath = "//div[contains(text(),'Find New Cars')]")
    public WebElement findNewCars;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/div/div[2]/div[1]/div/div/div[1]/div/div/svg")
    public WebElement searchBtn;

    @FindBy(xpath="./html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div/a")
    public WebElement explore;

    public NewCarPage findNewCars()  {

        new Actions(driver).moveToElement(newCarMenu).perform();
        findNewCars.click();
        return new NewCarPage(driver);

    }

    public void searchCars(){

        searchBar.sendKeys("carName");
        searchBar.sendKeys(Keys.RETURN);


    }

    public ExplorePage goToExplorePage(){
        explore.click();


        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }



        return new ExplorePage(driver);
    }


}
