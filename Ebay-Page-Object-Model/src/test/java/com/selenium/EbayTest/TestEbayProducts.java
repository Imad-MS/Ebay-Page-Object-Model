package com.selenium.EbayTest;
import com.selenium.Ebay.EbayProducts;
import org.junit.jupiter.api.Test;

public class TestEbayProducts {
    @Test
    public void TestBuyItNow(){
        EbayProducts product = new EbayProducts("https://www.ebay.com/itm/154367801008?_trkparms=pageci%3A74e8685e-c98a-11eb-9c4e-02c0314a9382%7Cparentrq%3Af38455fa1790a77d1693cda1fff7f3ae%7Ciid%3A1");
        product.buyItNow();
    }

    @Test
    public void TestAddToCart(){
        EbayProducts product = new EbayProducts("https://www.ebay.com/itm/154367801008?_trkparms=pageci%3A74e8685e-c98a-11eb-9c4e-02c0314a9382%7Cparentrq%3Af38455fa1790a77d1693cda1fff7f3ae%7Ciid%3A1");
        product.addToCart();
    }

    @Test
    public void TestAddToWatchlist(){
        EbayProducts product = new EbayProducts("https://www.ebay.com/itm/154367801008?_trkparms=pageci%3A74e8685e-c98a-11eb-9c4e-02c0314a9382%7Cparentrq%3Af38455fa1790a77d1693cda1fff7f3ae%7Ciid%3A1");
        product.addToWatchlist();
    }

    @Test
    public void TestPrice(){
        EbayProducts product = new EbayProducts("https://www.ebay.com/itm/154367801008?_trkparms=pageci%3A74e8685e-c98a-11eb-9c4e-02c0314a9382%7Cparentrq%3Af38455fa1790a77d1693cda1fff7f3ae%7Ciid%3A1");
        product.price();
    }

    @Test
    public void TestDescription(){
        EbayProducts product = new EbayProducts("https://www.ebay.com/itm/154367801008?_trkparms=pageci%3A74e8685e-c98a-11eb-9c4e-02c0314a9382%7Cparentrq%3Af38455fa1790a77d1693cda1fff7f3ae%7Ciid%3A1");
        product.description();
    }
}
