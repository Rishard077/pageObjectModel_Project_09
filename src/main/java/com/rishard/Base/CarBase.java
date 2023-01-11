package com.rishard.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarBase {

    WebDriver driver;


    public CarBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//h1[@data-lang-id='make_page_heading']")
    public WebElement carTitle;
    @FindBy(css = ".o-cpnuEd.o-SoIQT.o-eZTujG.o-fzpilz")
    public List<WebElement> carNames;

    @FindBy(css = ".o-eZTujG.o-byFsZJ.o-bkmzIL.o-bVSleT")
    public List<WebElement> carPrices;

    public String getCarTitle(){

        return carTitle.getText();
    }

    public void getCarNameAndPrice(){
        for (int i=0; i<carPrices.size();i++){  // i used this loop beccause the locator for carPrices shows only the cars but locator for car name shows the list of all car including upcoming cars
           // in this way we can get the names of the car for the availble car prices
            System.out.println(carNames.get(i).getText()+"-----car price is : "+carPrices.get(i).getText());

        }


    }


}
