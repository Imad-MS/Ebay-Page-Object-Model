package com.selenium.EbayTest;
import com.selenium.Ebay.EbayHomepage;
import org.junit.jupiter.api.Test;

public class TestEbayHomepage {
    @Test
    public void TestHome(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.home();
    }

    @Test
    public void TestSaved(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.saved();
    }

    @Test
    public void TestMotors(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.motors();
    }

    @Test
    public void TestMotorsExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.motorsExpand();
    }

    @Test
    public void TestFashion(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.fashion();
    }

    @Test
    public void TestFashionExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.fashionExpand();
    }

    @Test
    public void TestElectronics(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.electronics();
    }

    @Test
    public void TestElectronicsExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.electronicsExpand();
    }

    @Test
    public void TestCollectiblesAndArt(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.collectiblesAndArt();
    }

    @Test
    public void TestCollectiblesAndArtExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.collectiblesAndArtExpand();
    }

    @Test
    public void TestHomeAndGarden(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.homeAndGarden();
    }

    @Test
    public void TestHomeAndGardenExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.homeAndGardenExpand();
    }

    @Test
    public void TestSportingGoods(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.sportingGoods();
    }

    @Test
    public void TestSportingGoodsExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.sportingGoodsExpand();
    }

    @Test
    public void TestToys(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.toys();
    }

    @Test
    public void TestToysExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.toysExpand();
    }

    @Test
    public void TestBusinessAndIndustrial(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.businessAndIndustrial();
    }

    @Test
    public void TestBusinessAndIndustrialExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.businessAndIndustrialExpand();
    }

    @Test
    public void TestMusic(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.music();
    }

    @Test
    public void TestMusicExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.musicExpand();
    }

    @Test
    public void TestDeals(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.deals();
    }

    @Test
    public void TestDealsExpand(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.dealsExpand();
    }

    @Test
    public void TestTodaysDeals(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.todaysDeals();
    }

    @Test
    public void TestSearch(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.search("iphone");
    }

    @Test
    public void TestSearchByCategory(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.searchByCategory();
    }

    @Test
    public void TestSignIn(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.signIn("nbvmaiozspcscrnmys@twzhhq.online", "adm1nistrator");
    }

    @Test
    public void TestAdvancedSearch(){
        EbayHomepage homepage = new EbayHomepage();
        homepage.advancedSearch();
    }
}
