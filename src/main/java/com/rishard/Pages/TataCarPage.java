package com.rishard.Pages;

import com.rishard.Base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TataCarPage extends BasePage {

    public TataCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/div/h1")
    WebElement carTitle;
    public String getCarTitle(){
        return carTitle.getText();
    }
}
