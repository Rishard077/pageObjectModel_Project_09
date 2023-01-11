package testCases;

import com.rishard.Base.BasePage;
import com.rishard.Pages.HomePage;
import com.rishard.Pages.NewCarPage;
import com.rishard.Pages.ToyotaCarPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DataUtil;

import java.util.HashMap;
import java.util.Map;

public class FindNewCarTest extends BaseTest {



    @Test(dataProvider = "dp2", dataProviderClass = DataUtil.class)
    public void findNewCarsTest(String browser, String carBrand,String carTitle) {

        setUp(browser);
        /// new HomePage(driver).findNewCars().goToToyota(); we are not doing like this, in page object model
        HomePage homePage = new HomePage(driver);
        NewCarPage newCarPage =homePage.findNewCars();
        if(carBrand.equals("Toyota")){
            newCarPage.goToToyota();
        } else if (carBrand.equals("Tata")) {
            newCarPage.goToTata();
        } else if (carBrand.equals("Hyundai")) {
            newCarPage.goToHyundai();
        }
        // instead implement like this



         // instead of this the following can be used

/*
        Map<String, Runnable> options = new HashMap<>();
        options.put("Toyota", newCarPage::goToToyota);
        options.put("Tata", newCarPage::goToTata);
        options.put("Hyundai", newCarPage::goToHyundai);
        options.getOrDefault(carBrand, () -> {}).run(); */

        String title =BasePage.carBase.getCarTitle();
        Assert.assertEquals( title,carTitle);



    }

}
