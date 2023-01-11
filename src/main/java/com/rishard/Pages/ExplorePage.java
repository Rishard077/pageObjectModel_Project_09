package com.rishard.Pages;

import com.rishard.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExplorePage extends BasePage {


    public ExplorePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"autoExpoContainer\"]/section[1]/div/div/div[2]/ul/li[2]/span[2]")
    WebElement latestUpdate;



    public String getLatestUpdate() {
       return latestUpdate.getText();
    }
}
