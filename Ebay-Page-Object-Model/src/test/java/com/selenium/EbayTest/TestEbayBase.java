package com.selenium.EbayTest;
import com.selenium.Ebay.EbayBase;
import org.junit.jupiter.api.Test;

public class TestEbayBase {
    @Test
    public void TestSignIn(){
        EbayBase ebay = new EbayBase();
        ebay.signIn("nbvmaiozspcscrnmys@twzhhq.online", "adm1nistrator");
    }

    @Test
    public void TestRegister(){
        EbayBase ebay = new EbayBase();
        ebay.register(" ", " ", " ", " ");
    }

    @Test
    public void TestDailyDeals(){
        EbayBase ebay = new EbayBase();
        ebay.dailyDeals();
    }

    @Test
    public void TestBrandOutlet(){
        EbayBase ebay = new EbayBase();
        ebay.brandOutlet();
    }

    @Test
    public void TestHelpAndContact(){
        EbayBase ebay = new EbayBase();
        ebay.helpAndContact();
    }

    @Test
    public void TestSell(){
        EbayBase ebay = new EbayBase();
        ebay.sell();
    }

    @Test
    public void TestWishlist(){
        EbayBase ebay = new EbayBase();
        ebay.wishlist();
    }

    @Test
    public void TestNotifications(){
        EbayBase ebay = new EbayBase();
        ebay.notifications();
    }

    @Test
    public void TestCart(){
        EbayBase ebay = new EbayBase();
        ebay.cart();
    }

    @Test
    public void TestAboutEbay(){
        EbayBase ebay = new EbayBase();
        ebay.aboutEbay();
    }

    @Test
    public void TestAnnouncements(){
        EbayBase ebay = new EbayBase();
        ebay.announcements();
    }

    @Test
    public void TestCommunity(){
        EbayBase ebay = new EbayBase();
        ebay.community();
    }

    @Test
    public void TestSecurityCenter(){
        EbayBase ebay = new EbayBase();
        ebay.securityCenter();
    }

    @Test
    public void TestResolutionCenter(){
        EbayBase ebay = new EbayBase();
        ebay.resolutionCenter();
    }

    @Test
    public void TestSellerCenter(){
        EbayBase ebay = new EbayBase();
        ebay.sellerCenter();
    }

    @Test
    public void TestPolicies(){
        EbayBase ebay = new EbayBase();
        ebay.policies();
    }

    @Test
    public void TestAffiliates(){
        EbayBase ebay = new EbayBase();
        ebay.affiliates();
    }

    @Test
    public void TestSiteMap(){
        EbayBase ebay = new EbayBase();
        ebay.siteMap();
    }
}
