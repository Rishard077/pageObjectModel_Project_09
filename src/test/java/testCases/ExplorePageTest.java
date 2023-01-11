package testCases;

import com.rishard.Pages.ExplorePage;
import com.rishard.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DataUtil;

public class ExplorePageTest extends BaseTest {

    @Test
    public void explorePageTest(){
        setUp("chrome");
        HomePage homePage = new HomePage(driver);
        homePage.searchCars();
        ExplorePage explorePage= homePage.goToExplorePage();
        String txt = explorePage.getLatestUpdate();
        Assert.assertEquals("LATEST UPDATES",txt);
    }


}
