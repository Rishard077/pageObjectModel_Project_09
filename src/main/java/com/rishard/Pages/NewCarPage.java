package com.rishard.Pages;

import com.rishard.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCarPage extends BasePage {


    public NewCarPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText ="Toyota" )
    WebElement toyotaLink;
    @FindBy(linkText ="Hyundai" )
    WebElement hyundaiBtn;
    @FindBy(linkText ="Tata" )
    WebElement tataBtn;


    public ToyotaCarPage goToToyota(){
     toyotaLink.click();
      return new ToyotaCarPage(driver);
    }

    public HyundaiCarPage goToHyundai(){
      hyundaiBtn.click();
     return new HyundaiCarPage(driver);
    }

    public TataCarPage goToTata(){

      tataBtn.click();
      return new TataCarPage(driver);
    }




}
